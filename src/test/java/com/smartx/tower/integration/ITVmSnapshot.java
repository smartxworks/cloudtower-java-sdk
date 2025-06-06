package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmApi;
import com.smartx.tower.api.VmSnapshotApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITVmSnapshot extends ITBase {
    VmSnapshotApi api = null;
    VmApi vmApi = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    Cluster cluster = null;

    @DataProvider(name = "vmSnapshotPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws JsonSyntaxException, IOException {
        api = new VmSnapshotApi(client);
        vmApi = new VmApi(client);

        InputStream stream = getClass().getResourceAsStream("/VmSnapshot.json");
        if (stream != null) {
            payloads =
                    gson.fromJson(
                            ITUtils.readInputStream(stream),
                            new TypeToken<HashMap<String, Object>>() {}.getType());
        }
    }

    Vm vm = null;

    @BeforeMethod(groups = {"need_vm"})
    public void createVm()
            throws ApiException, IllegalAccessException, IllegalArgumentException,
                    InvocationTargetException, NoSuchMethodException, SecurityException,
                    InterruptedException {
        List<VmCreationParams> params = new ArrayList<>();
        Vlan vlan = getData("defaultVlan", Vlan.class);
        cluster = getData("defaultCluster", Cluster.class);
        params.add(
                new VmCreationParams()
                        .name("tower-sdk-test-snapshot-vm" + System.currentTimeMillis())
                        .cpuCores(1)
                        .cpuSockets(1)
                        .memory(4294967296L)
                        .ha(true)
                        .vcpu(1)
                        .status(VmStatus.STOPPED)
                        .firmware(VmFirmware.BIOS)
                        .clusterId(cluster.getId())
                        .vmDisks(
                                new VmDiskParams()
                                        .addMountCdRomsItem(new VmCdRomParams().boot(1).index(1)))
                        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
        WithTaskVm createResult = vmApi.createVm(params).get(0);
        vm = createResult.getData();
        waitForTaskSucceed(createResult.getTaskId());
    }

    @AfterMethod(
            groups = {"need_vm"},
            alwaysRun = true)
    public void deleteVm()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, ApiException, InterruptedException {
        Vm _vm =
                (Vm)
                        waitForResourceAsyncStatus(
                                new GetVmsRequestBody().where(new VmWhereInput().id(vm.getId())),
                                vmApi,
                                "getVms",
                                new TypeToken<List<Vm>>() {}.getClass(),
                                GetVmsRequestBody.class);
        if (_vm.getStatus() == VmStatus.RUNNING) {
            waitForTaskSucceed(
                    vmApi.shutDownVm(
                                    new VmOperateParams().where(new VmWhereInput().id(_vm.getId())))
                            .get(0)
                            .getTaskId());
        }
        waitForTaskSucceed(
                vmApi.deleteVm(new VmDeleteParams().where(new VmWhereInput().id(vm.getId())))
                        .get(0)
                        .getTaskId());
    }

    @Test(
            dataProvider = "vmSnapshotPayload",
            groups = {"need_vm"})
    public void createVmSnapshot(String payload) {
        try {
            // parse params from json payload
            VmSnapshotCreationParams params =
                    gson.fromJson(payload, new TypeToken<VmSnapshotCreationParams>() {}.getType());
            params.addDataItem(
                    new VmSnapshotCreationParamsData()
                            .vmId(vm.getId())
                            .name("tower-sdk-test-snapshot" + System.currentTimeMillis()));
            // do some modify to params(optional)
            List<WithTaskVmSnapshot> result = api.createVmSnapshot(params);
            assertThat(result).as("check result of createVmSnapshot").isNotNull();
            VmSnapshot snapshot = result.get(0).getData();
            api.deleteVmSnapshot(
                    new VmSnapshotDeletionParams()
                            .where(new VmSnapshotWhereInput().id(snapshot.getId())));
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vmSnapshotPayload")
    public void getVmSnapshots(String payload) {
        try {
            // parse params from json payload
            GetVmSnapshotsRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetVmSnapshotsRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<VmSnapshot> result = api.getVmSnapshots(params);
            assertThat(result).as("check result of getVmSnapshots").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vmSnapshotPayload")
    public void getVmSnapshotsConnection(String payload) {
        try {
            // parse params from json payload
            GetVmSnapshotsConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetVmSnapshotsConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            VmSnapshotConnection result = api.getVmSnapshotsConnection(params);
            assertThat(result).as("check result of getVmSnapshotsConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    VmSnapshot snapshot = null;

    @BeforeMethod(
            onlyForGroups = {"need_vm_snapshot"},
            dependsOnMethods = {"createVm"})
    public void createSnapShot()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, ApiException, InterruptedException {
        VmSnapshotCreationParams params = new VmSnapshotCreationParams();
        params.addDataItem(
                new VmSnapshotCreationParamsData()
                        .vmId(vm.getId())
                        .name("tower-sdk-test-snapshot" + System.currentTimeMillis()));
        // do some modify to params(optional)
        WithTaskVmSnapshot result = api.createVmSnapshot(params).get(0);
        assertThat(result).as("check result of createVmSnapshot").isNotNull();
        snapshot = result.getData();
        waitForTaskSucceed(result.getTaskId());
    }

    @AfterMethod(
            alwaysRun = true,
            onlyForGroups = {"need_vm_snapshot"})
    public void deleteSnapShot()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, ApiException, InterruptedException {
        waitForResourceAsyncStatus(
                new GetVmSnapshotsRequestBody()
                        .where(new VmSnapshotWhereInput().id(snapshot.getId())),
                api,
                "getVmSnapshots",
                new TypeToken<List<VmSnapshot>>() {}.getClass(),
                GetVmSnapshotsRequestBody.class);
        waitForTaskSucceed(
                api.deleteVmSnapshot(
                                new VmSnapshotDeletionParams()
                                        .where(new VmSnapshotWhereInput().id(snapshot.getId())))
                        .get(0)
                        .getTaskId());
        snapshot = null;
    }

    @Test(groups = {"need_vm_snapshot"})
    public void rebuildVm()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, InterruptedException {
        try {
            // parse params from json payload
            List<VmRebuildParams> params = new ArrayList<>();
            params.add(
                    new VmRebuildParams()
                            .clusterId(cluster.getId())
                            .name("tower-sdk-test-rebuild-vm" + System.currentTimeMillis())
                            .rebuildFromSnapshotId(snapshot.getId()));
            // do some modify to params(optional)
            List<WithTaskVm> result = vmApi.rebuildVm(params);
            assertThat(result).as("check result of rebuildVm").isNotNull();
            Vm vm = result.get(0).getData();
            waitForTaskSucceed(result.get(0).getTaskId());
            waitForTaskSucceed(
                    vmApi.deleteVm(new VmDeleteParams().where(new VmWhereInput().id(vm.getId())))
                            .get(0)
                            .getTaskId());
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(groups = {"need_vm_snapshot"})
    public void rollbackVm() {
        try {
            // parse params from json payload
            VmRollbackParams params = new VmRollbackParams();
            params.data(new VmRollbackParamsData().snapshotId(snapshot.getId()))
                    .where(new VmWhereInput().id(vm.getId()));
            // do some modify to params(optional)
            List<WithTaskVm> result = vmApi.rollbackVm(params);
            assertThat(result).as("check result of rollbackVm").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}

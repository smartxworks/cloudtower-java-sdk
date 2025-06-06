package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmApi;
import com.smartx.tower.api.VmTemplateApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITVmTemplate extends ITBase {
    VmTemplateApi api = null;
    VmApi vmApi = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    Cluster cluster = null;

    @DataProvider(name = "vmTemplatePayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException, ApiException {
        api = new VmTemplateApi(client);
        vmApi = new VmApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/VmTemplate.json");
        cluster = getData("defaultCluster", Cluster.class);
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    Vm vm = null;

    @BeforeMethod(groups = {"need_vm"})
    public void createVm()
            throws ApiException, IllegalAccessException, IllegalArgumentException,
                    InvocationTargetException, NoSuchMethodException, SecurityException,
                    InterruptedException {
        List<VmCreationParams> params = new ArrayList<>();
        Vlan vlan = getData("defaultVlan", Vlan.class);
        params.add(
                new VmCreationParams()
                        .name("tower-sdk-test-template-vm" + System.currentTimeMillis())
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
        if (vm == null) {
            return;
        }
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
        vm = null;
    }

    @Test(groups = {"need_vm"})
    public void cloneVmTemplateFromVmAndUpdateAndDelete()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, InterruptedException {
        try {
            // parse params from json payload
            List<VmTemplateCreationParams> params = new ArrayList<>();
            params.add(
                    new VmTemplateCreationParams()
                            .name("tower-api-test-clone-vm-template" + System.currentTimeMillis())
                            .clusterId(cluster.getId())
                            .vmId(vm.getId())
                            .cloudInitSupported(false));
            // do some modify to params(optional)
            List<WithTaskVmTemplate> result = api.cloneVmTemplateFromVm(params);
            VmTemplate template = result.get(0).getData();
            waitForTaskSucceed(result.get(0).getTaskId());
            waitForTaskSucceed(
                    api.updateVmTemplate(
                                    new VmTemplateUpdationParams()
                                            .data(
                                                    new VmTemplateUpdationParamsData()
                                                            .name(
                                                                    "tower-sdk-test-clone-vm-template-update"
                                                                            + System
                                                                                    .currentTimeMillis()))
                                            .where(new VmTemplateWhereInput().id(template.getId())))
                            .get(0)
                            .getTaskId());
            waitForTaskSucceed(
                    api.deleteVmTemplate(
                                    new VmTemplateDeletionParams()
                                            .where(new VmTemplateWhereInput().id(template.getId())))
                            .get(0)
                            .getTaskId());
            assertThat(result)
                    .as("check result of cloneVmTemplateFromVmAndUpdateAndDelete")
                    .isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(groups = {"need_vm"})
    public void convertVmTemplateFromVmAndUpdateAndDelete()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, InterruptedException {
        try {
            // parse params from json payload
            List<VmTemplateCreationParams> params = new ArrayList<>();
            params.add(
                    new VmTemplateCreationParams()
                            .name("tower-sdk-test-convert-vm-template" + System.currentTimeMillis())
                            .clusterId(cluster.getId())
                            .vmId(vm.getId())
                            .cloudInitSupported(false));
            // do some modify to params(optional)
            List<WithTaskVmTemplate> result = api.convertVmTemplateFromVm(params);
            VmTemplate template = result.get(0).getData();
            waitForTaskSucceed(result.get(0).getTaskId());
            waitForTaskSucceed(
                    api.updateVmTemplate(
                                    new VmTemplateUpdationParams()
                                            .data(
                                                    new VmTemplateUpdationParamsData()
                                                            .name(
                                                                    "tower-sdk-test-clone-vm-template-update"
                                                                            + System
                                                                                    .currentTimeMillis()))
                                            .where(new VmTemplateWhereInput().id(template.getId())))
                            .get(0)
                            .getTaskId());
            waitForTaskSucceed(
                    api.deleteVmTemplate(
                                    new VmTemplateDeletionParams()
                                            .where(new VmTemplateWhereInput().id(template.getId())))
                            .get(0)
                            .getTaskId());
            assertThat(result).as("check result of convertVmTemplateFromVmAndDelete").isNotNull();
            vm = null;
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vmTemplatePayload")
    public void getVmTemplates(String payload) {
        try {
            // parse params from json payload
            GetVmTemplatesRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetVmTemplatesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<VmTemplate> result = api.getVmTemplates(params);
            assertThat(result).as("check result of getVmTemplates").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vmTemplatePayload")
    public void getVmTemplatesConnection(String payload) {
        try {
            // parse params from json payload
            GetVmTemplatesConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetVmTemplatesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            VmTemplateConnection result = api.getVmTemplatesConnection(params);
            assertThat(result).as("check result of getVmTemplatesConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    VmTemplate template = null;

    @BeforeMethod(
            groups = {"need_vm_template"},
            dependsOnMethods = {"createVm"})
    public void createVmtemplate()
            throws ApiException, IllegalAccessException, IllegalArgumentException,
                    InvocationTargetException, NoSuchMethodException, SecurityException,
                    InterruptedException {
        List<VmTemplateCreationParams> params = new ArrayList<>();
        params.add(
                new VmTemplateCreationParams()
                        .name("tower-api-test-clone-vm-template" + System.currentTimeMillis())
                        .clusterId(cluster.getId())
                        .vmId(vm.getId())
                        .cloudInitSupported(false));
        // do some modify to params(optional)
        List<WithTaskVmTemplate> result = api.cloneVmTemplateFromVm(params);
        template = result.get(0).getData();
        waitForTaskSucceed(result.get(0).getTaskId());
    }

    @AfterMethod(
            groups = {"need_vm_template"},
            alwaysRun = true)
    public void deleteVmtemplate()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException, ApiException, InterruptedException {
        if (template == null) {
            return;
        }
        waitForResourceAsyncStatus(
                new GetVmTemplatesRequestBody()
                        .where(new VmTemplateWhereInput().id(template.getId())),
                api,
                "getVmTemplates",
                new TypeToken<List<VmTemplate>>() {}.getClass(),
                GetVmTemplatesRequestBody.class);
        waitForTaskSucceed(
                api.deleteVmTemplate(
                                new VmTemplateDeletionParams()
                                        .where(new VmTemplateWhereInput().id(template.getId())))
                        .get(0)
                        .getTaskId());
    }

    @Test(groups = {"need_vm", "need_vm_template"})
    public void convertVmTemplateToVm()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException {
        try {
            List<ConvertVmTemplateToVmParams> params = new ArrayList<>();
            params.add(
                    new ConvertVmTemplateToVmParams()
                            .convertedFromTemplateId(template.getId())
                            .name(
                                    "tower-sdk-test-vm-convert-from-template"
                                            + System.currentTimeMillis()));
            List<WithTaskVm> result = vmApi.convertVmTemplateToVm(params);
            Vm vm = result.get(0).getData();
            waitForTaskSucceed(result.get(0).getTaskId());
            waitForTaskSucceed(
                    vmApi.deleteVm(new VmDeleteParams().where(new VmWhereInput().id(vm.getId())))
                            .get(0)
                            .getTaskId());
            assertThat(result).as("check result of convertVmTemplateToVm").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(groups = {"need_vm", "need_vm_template"})
    public void createVmFromTemplate()
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
                    NoSuchMethodException, SecurityException {
        try {
            List<VmCreateVmFromTemplateParams> params = new ArrayList<>();
            params.add(
                    new VmCreateVmFromTemplateParams()
                            .templateId(template.getId())
                            .name(
                                    "tower-sdk-test-vm-create-from-template"
                                            + System.currentTimeMillis())
                            .clusterId(cluster.getId())
                            .isFullCopy(false));
            List<WithTaskVm> result = vmApi.createVmFromTemplate(params);
            Vm vm = result.get(0).getData();
            waitForTaskSucceed(result.get(0).getTaskId());
            waitForTaskSucceed(
                    vmApi.deleteVm(new VmDeleteParams().where(new VmWhereInput().id(vm.getId())))
                            .get(0)
                            .getTaskId());
            assertThat(result).as("check result of createVmFromTemplate").isNotNull();
            template = null;
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}

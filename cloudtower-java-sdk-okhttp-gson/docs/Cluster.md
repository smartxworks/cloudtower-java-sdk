

# Cluster


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications** | [**List&lt;NestedApplication&gt;**](NestedApplication.md) |  |  [optional]
**architecture** | **Architecture** |  | 
**autoConverge** | **Boolean** |  |  [optional]
**connectState** | **ConnectState** |  | 
**consistencyGroups** | [**List&lt;NestedConsistencyGroup&gt;**](NestedConsistencyGroup.md) |  |  [optional]
**currentCpuModel** | **String** |  |  [optional]
**datacenters** | [**List&lt;NestedDatacenter&gt;**](NestedDatacenter.md) |  |  [optional]
**disconnectedDate** | **String** |  |  [optional]
**disconnectedReason** | [**ClusterConnectorErrorCode**](ClusterConnectorErrorCode.md) |  |  [optional]
**dns** | **List&lt;String&gt;** |  | 
**entityAsyncStatus** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**everouteCluster** | [**NestedEverouteCluster**](NestedEverouteCluster.md) |  |  [optional]
**failureDataSpace** | **Double** |  |  [optional]
**hasMetrox** | **Boolean** |  |  [optional]
**hasRemoteBackup** | **Boolean** |  |  [optional]
**hostNum** | **Integer** |  |  [optional]
**hosts** | [**List&lt;NestedHost&gt;**](NestedHost.md) |  |  [optional]
**hypervisor** | [**Hypervisor**](Hypervisor.md) |  |  [optional]
**id** | **String** |  | 
**ip** | **String** |  | 
**isAllFlash** | **Boolean** |  |  [optional]
**iscsiVip** | **String** |  |  [optional]
**labels** | [**List&lt;NestedLabel&gt;**](NestedLabel.md) |  |  [optional]
**licenseExpireDate** | **String** |  |  [optional]
**licenseSerial** | **String** |  |  [optional]
**licenseSignDate** | **String** |  |  [optional]
**licenseType** | [**LicenseType**](LicenseType.md) |  |  [optional]
**localId** | **String** |  |  [optional]
**maintenanceEndDate** | **String** |  |  [optional]
**maintenanceStartDate** | **String** |  |  [optional]
**managementVip** | **String** |  |  [optional]
**maxChunkNum** | **Integer** |  |  [optional]
**maxPhysicalDataCapacity** | **Double** |  |  [optional]
**maxPhysicalDataCapacityPerNode** | **Double** |  |  [optional]
**metroAvailabilityChecklist** | [**NestedMetroAvailabilityChecklist**](NestedMetroAvailabilityChecklist.md) |  |  [optional]
**mgtGateway** | **String** |  |  [optional]
**mgtNetmask** | **String** |  |  [optional]
**migrationDataSize** | **Double** |  |  [optional]
**migrationSpeed** | **Double** |  |  [optional]
**name** | **String** |  | 
**ntpMode** | [**NtpMode**](NtpMode.md) |  |  [optional]
**ntpServers** | **List&lt;String&gt;** |  | 
**nvmfEnabled** | **Boolean** |  |  [optional]
**pmemEnabled** | **Boolean** |  |  [optional]
**provisionedCpuCores** | **Integer** |  |  [optional]
**provisionedCpuCoresForActiveVm** | **Integer** |  |  [optional]
**provisionedForActiveVmRatio** | **Double** |  |  [optional]
**provisionedMemoryBytes** | **Double** |  |  [optional]
**provisionedRatio** | **Double** |  |  [optional]
**rdmaEnabled** | **Boolean** |  |  [optional]
**recommendedCpuModels** | **List&lt;String&gt;** |  | 
**recoverDataSize** | **Double** |  |  [optional]
**recoverSpeed** | **Double** |  |  [optional]
**reservedCpuCoresForSystemService** | **Integer** |  |  [optional]
**runningVmNum** | **Integer** |  |  [optional]
**settings** | [**NestedClusterSettings**](NestedClusterSettings.md) |  |  [optional]
**softwareEdition** | [**SoftwareEdition**](SoftwareEdition.md) |  |  [optional]
**stoppedVmNum** | **Integer** |  |  [optional]
**stretch** | **Boolean** |  |  [optional]
**suspendedVmNum** | **Integer** |  |  [optional]
**totalCacheCapacity** | **Double** |  |  [optional]
**totalCpuCores** | **Integer** |  |  [optional]
**totalCpuHz** | **Double** |  |  [optional]
**totalCpuModels** | **List&lt;String&gt;** |  | 
**totalCpuSockets** | **Integer** |  |  [optional]
**totalDataCapacity** | **Double** |  |  [optional]
**totalMemoryBytes** | **Double** |  |  [optional]
**type** | **ClusterType** |  | 
**usedCpuHz** | **Double** |  |  [optional]
**usedDataSpace** | **Double** |  |  [optional]
**usedMemoryBytes** | **Double** |  |  [optional]
**validDataSpace** | **Double** |  |  [optional]
**vcenterAccount** | [**NestedVcenterAccount**](NestedVcenterAccount.md) |  |  [optional]
**vdses** | [**List&lt;NestedVds&gt;**](NestedVds.md) |  |  [optional]
**version** | **String** |  | 
**vhostEnabled** | **Boolean** |  |  [optional]
**vmFolders** | [**List&lt;NestedVmFolder&gt;**](NestedVmFolder.md) |  |  [optional]
**vmNum** | **Integer** |  |  [optional]
**vmTemplates** | [**List&lt;NestedVmTemplate&gt;**](NestedVmTemplate.md) |  |  [optional]
**vms** | [**List&lt;NestedVm&gt;**](NestedVm.md) |  |  [optional]
**witness** | [**NestedWitness**](NestedWitness.md) |  |  [optional]
**zones** | [**List&lt;NestedZone&gt;**](NestedZone.md) |  |  [optional]




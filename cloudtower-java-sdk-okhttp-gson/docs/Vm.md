

# Vm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clockOffset** | **VmClockOffset** |  | 
**cluster** | [**NestedCluster**](NestedCluster.md) |  |  [optional]
**cpu** | [**NestedCpu**](NestedCpu.md) |  | 
**cpuModel** | **String** |  | 
**cpuUsage** | **Double** |  |  [optional]
**deletedAt** | **String** |  |  [optional]
**description** | **String** |  | 
**dnsServers** | **String** |  |  [optional]
**entityFilterResults** | [**List&lt;NestedVmEntityFilterResult&gt;**](NestedVmEntityFilterResult.md) |  |  [optional]
**entityAsyncStatus** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**firmware** | **VmFirmware** |  | 
**folder** | [**NestedVmFolder**](NestedVmFolder.md) |  |  [optional]
**guestCpuModel** | **String** |  |  [optional]
**guestOsType** | [**VmGuestsOperationSystem**](VmGuestsOperationSystem.md) |  |  [optional]
**guestSizeUsage** | **Double** |  |  [optional]
**guestUsedSize** | **Double** |  |  [optional]
**ha** | **Boolean** |  | 
**host** | [**NestedHost**](NestedHost.md) |  |  [optional]
**hostname** | **String** |  |  [optional]
**id** | **String** |  | 
**inRecycleBin** | **Boolean** |  | 
**internal** | **Boolean** |  | 
**ioPolicy** | [**VmDiskIoPolicy**](VmDiskIoPolicy.md) |  |  [optional]
**ips** | **String** |  | 
**isolationPolicy** | [**NestedIsolationPolicy**](NestedIsolationPolicy.md) |  |  [optional]
**kernelInfo** | **String** |  |  [optional]
**labels** | [**List&lt;NestedLabel&gt;**](NestedLabel.md) |  |  [optional]
**lastShutdownTime** | **String** |  |  [optional]
**localCreatedAt** | **String** |  |  [optional]
**localId** | **String** |  | 
**logicalSizeBytes** | **Double** |  |  [optional]
**maxBandwidth** | **Double** |  |  [optional]
**maxBandwidthPolicy** | [**VmDiskIoRestrictType**](VmDiskIoRestrictType.md) |  |  [optional]
**maxIops** | **Integer** |  |  [optional]
**maxIopsPolicy** | [**VmDiskIoRestrictType**](VmDiskIoRestrictType.md) |  |  [optional]
**memory** | **Double** |  | 
**memoryUsage** | **Double** |  |  [optional]
**name** | **String** |  | 
**nestedVirtualization** | **Boolean** |  | 
**nodeIp** | **String** |  | 
**originalName** | **String** |  |  [optional]
**os** | **String** |  |  [optional]
**outUninstallUsb** | **List&lt;String&gt;** |  | 
**_protected** | **Boolean** |  | 
**provisionedSize** | **Double** |  |  [optional]
**size** | **Double** |  |  [optional]
**snapshotPlan** | [**NestedSnapshotPlan**](NestedSnapshotPlan.md) |  |  [optional]
**snapshots** | [**List&lt;NestedVmSnapshot&gt;**](NestedVmSnapshot.md) |  |  [optional]
**status** | **VmStatus** |  | 
**uniqueSize** | **Double** |  |  [optional]
**usbDevices** | [**List&lt;NestedUsbDevice&gt;**](NestedUsbDevice.md) |  |  [optional]
**vcpu** | **Integer** |  | 
**videoType** | [**VmVideoType**](VmVideoType.md) |  |  [optional]
**vmDisks** | [**List&lt;NestedVmDisk&gt;**](NestedVmDisk.md) |  |  [optional]
**vmNics** | [**List&lt;NestedVmNic&gt;**](NestedVmNic.md) |  |  [optional]
**vmPlacementGroup** | [**List&lt;NestedVmPlacementGroup&gt;**](NestedVmPlacementGroup.md) |  |  [optional]
**vmToolsStatus** | **VmToolsStatus** |  | 
**vmToolsVersion** | **String** |  |  [optional]
**vmUsage** | [**VmUsage**](VmUsage.md) |  |  [optional]
**winOpt** | **Boolean** |  | 




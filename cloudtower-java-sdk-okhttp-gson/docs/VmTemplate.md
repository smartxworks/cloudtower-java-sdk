

# VmTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clockOffset** | **VmClockOffset** |  | 
**cloudInitSupported** | **Boolean** |  | 
**cluster** | [**NestedCluster**](NestedCluster.md) |  | 
**contentLibraryVmTemplate** | [**NestedContentLibraryVmTemplate**](NestedContentLibraryVmTemplate.md) |  |  [optional]
**cpu** | [**NestedCpu**](NestedCpu.md) |  | 
**cpuModel** | **String** |  | 
**description** | **String** |  | 
**entityAsyncStatus** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**firmware** | **VmFirmware** |  | 
**ha** | **Boolean** |  | 
**id** | **String** |  | 
**ioPolicy** | [**VmDiskIoPolicy**](VmDiskIoPolicy.md) |  |  [optional]
**labels** | [**List&lt;NestedLabel&gt;**](NestedLabel.md) |  |  [optional]
**localCreatedAt** | **String** |  |  [optional]
**localId** | **String** |  | 
**maxBandwidth** | **Double** |  |  [optional]
**maxBandwidthPolicy** | [**VmDiskIoRestrictType**](VmDiskIoRestrictType.md) |  |  [optional]
**maxIops** | **Integer** |  |  [optional]
**maxIopsPolicy** | [**VmDiskIoRestrictType**](VmDiskIoRestrictType.md) |  |  [optional]
**memory** | **Double** |  | 
**name** | **String** |  | 
**size** | **Double** |  | 
**vcpu** | **Integer** |  | 
**videoType** | **String** |  |  [optional]
**vmDisks** | [**List&lt;NestedFrozenDisks&gt;**](NestedFrozenDisks.md) |  |  [optional]
**vmNics** | [**List&lt;NestedTemplateNic&gt;**](NestedTemplateNic.md) |  |  [optional]
**winOpt** | **Boolean** |  | 




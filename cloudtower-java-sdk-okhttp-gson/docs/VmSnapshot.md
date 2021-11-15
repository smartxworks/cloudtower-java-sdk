

# VmSnapshot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clockOffset** | **VmClockOffset** |  | 
**cluster** | [**NestedCluster**](NestedCluster.md) |  | 
**consistentType** | **ConsistentType** |  | 
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
**snapshotGroup** | [**NestedSnapshotGroup**](NestedSnapshotGroup.md) |  |  [optional]
**vcpu** | **Integer** |  | 
**vm** | [**NestedVm**](NestedVm.md) |  |  [optional]
**vmDisks** | [**List&lt;NestedFrozenDisks&gt;**](NestedFrozenDisks.md) |  |  [optional]
**vmNics** | [**List&lt;NestedFrozenNic&gt;**](NestedFrozenNic.md) |  |  [optional]
**winOpt** | **Boolean** |  | 






# VmSnapshot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clockOffset** | **VmClockOffset** |  | 
**cluster** | [**AlertRuleCluster**](AlertRuleCluster.md) |  | 
**consistentType** | **ConsistentType** |  | 
**cpu** | [**VmCpu**](VmCpu.md) |  | 
**cpuModel** | **String** |  | 
**description** | **String** |  | 
**entityAsyncStatus** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**firmware** | **VmFirmware** |  | 
**ha** | **Boolean** |  | 
**id** | **String** |  | 
**ioPolicy** | [**VmDiskIoPolicy**](VmDiskIoPolicy.md) |  |  [optional]
**labels** | [**List&lt;BrickTopoPowers&gt;**](BrickTopoPowers.md) |  |  [optional]
**localCreatedAt** | **String** |  |  [optional]
**localId** | **String** |  | 
**maxBandwidth** | **Double** |  |  [optional]
**maxBandwidthPolicy** | [**VmDiskIoRestrictType**](VmDiskIoRestrictType.md) |  |  [optional]
**maxIops** | **Double** |  |  [optional]
**maxIopsPolicy** | [**VmDiskIoRestrictType**](VmDiskIoRestrictType.md) |  |  [optional]
**memory** | **Double** |  | 
**name** | **String** |  | 
**size** | **Double** |  | 
**snapshotGroup** | [**AlertDisk**](AlertDisk.md) |  |  [optional]
**vcpu** | **Double** |  | 
**vm** | [**AlertDisk**](AlertDisk.md) |  |  [optional]
**vmDisks** | [**List&lt;VmSnapshotVmDisks&gt;**](VmSnapshotVmDisks.md) |  |  [optional]
**vmNics** | [**List&lt;VmSnapshotVmNics&gt;**](VmSnapshotVmNics.md) |  |  [optional]
**winOpt** | **Boolean** |  | 




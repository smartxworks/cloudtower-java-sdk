

# Host


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessIp** | **String** |  |  [optional]
**allocatableMemoryBytes** | **Double** |  | 
**chunkId** | **String** |  | 
**cluster** | [**NestedCluster**](NestedCluster.md) |  | 
**compatibleCpuModels** | **List&lt;String&gt;** |  | 
**cpuBrand** | **String** |  | 
**cpuFanSpeed** | **List&lt;Double&gt;** |  | 
**cpuFanSpeedUnit** | [**CpuFanSpeedUnit**](CpuFanSpeedUnit.md) |  |  [optional]
**cpuHzPerCore** | **Double** |  | 
**cpuModel** | **String** |  | 
**cpuTemperatureCelsius** | **List&lt;Integer&gt;** |  | 
**dataIp** | **String** |  |  [optional]
**disks** | [**List&lt;NestedDisk&gt;**](NestedDisk.md) |  |  [optional]
**failureDataSpace** | **Double** |  | 
**hddDataCapacity** | **Double** |  | 
**hddDiskCount** | **Integer** |  | 
**id** | **String** |  | 
**ipmi** | [**NestedIpmi**](NestedIpmi.md) |  |  [optional]
**isOsInRaid1** | **Boolean** |  |  [optional]
**labels** | [**List&lt;NestedLabel&gt;**](NestedLabel.md) |  |  [optional]
**localId** | **String** |  | 
**lsmCapDiskSafeUmount** | **Boolean** |  | 
**managementIp** | **String** |  | 
**model** | **String** |  | 
**name** | **String** |  | 
**nestedVirtualization** | **Boolean** |  | 
**nicCount** | **Integer** |  | 
**nics** | [**List&lt;NestedNic&gt;**](NestedNic.md) |  |  [optional]
**nodeTopoLocalId** | **String** |  |  [optional]
**osMemoryBytes** | **Double** |  | 
**osVersion** | **String** |  |  [optional]
**pmemDimmCapacity** | **Double** |  | 
**pmemDimmCount** | **Integer** |  | 
**pmemDimms** | [**List&lt;NestedPmemDimm&gt;**](NestedPmemDimm.md) |  |  [optional]
**pmemDiskCount** | **Integer** |  | 
**provisionedCpuCores** | **Integer** |  | 
**provisionedMemoryBytes** | **Double** |  | 
**runningPauseVmMemoryBytes** | **Double** |  | 
**runningVmNum** | **Integer** |  |  [optional]
**scvmCpu** | **Double** |  |  [optional]
**scvmMemory** | **Double** |  |  [optional]
**scvmName** | **String** |  |  [optional]
**serial** | **String** |  |  [optional]
**ssdDataCapacity** | **Double** |  | 
**ssdDiskCount** | **Integer** |  | 
**state** | **HostState** |  | 
**status** | **HostStatus** |  | 
**stoppedVmNum** | **Integer** |  |  [optional]
**suspendedVmNum** | **Integer** |  |  [optional]
**totalCacheCapacity** | **Double** |  |  [optional]
**totalCpuCores** | **Integer** |  | 
**totalCpuHz** | **Double** |  | 
**totalCpuSockets** | **Integer** |  |  [optional]
**totalDataCapacity** | **Double** |  | 
**totalMemoryBytes** | **Double** |  | 
**usbDevices** | [**List&lt;NestedUsbDevice&gt;**](NestedUsbDevice.md) |  |  [optional]
**usedCpuHz** | **Double** |  |  [optional]
**usedDataSpace** | **Double** |  | 
**usedMemoryBytes** | **Double** |  |  [optional]
**vmNum** | **Integer** |  |  [optional]
**vmotionIp** | **String** |  |  [optional]
**vms** | [**List&lt;NestedVm&gt;**](NestedVm.md) |  |  [optional]
**vsphereEsxiAccount** | [**NestedVsphereEsxiAccount**](NestedVsphereEsxiAccount.md) |  |  [optional]
**withFasterSsdAsCache** | **Boolean** |  |  [optional]
**zone** | [**NestedZone**](NestedZone.md) |  |  [optional]




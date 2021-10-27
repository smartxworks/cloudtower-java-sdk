

# Host


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessIp** | **String** |  |  [optional]
**allocatableMemoryBytes** | **Double** |  | 
**chunkId** | **String** |  | 
**cluster** | [**AlertRuleCluster**](AlertRuleCluster.md) |  | 
**compatibleCpuModels** | **List&lt;String&gt;** |  | 
**cpuBrand** | **String** |  | 
**cpuFanSpeed** | **List&lt;Double&gt;** |  | 
**cpuFanSpeedUnit** | [**CpuFanSpeedUnit**](CpuFanSpeedUnit.md) |  |  [optional]
**cpuHzPerCore** | **Double** |  | 
**cpuModel** | **String** |  | 
**cpuTemperatureCelsius** | **List&lt;Double&gt;** |  | 
**dataIp** | **String** |  |  [optional]
**disks** | [**List&lt;AlertRuleCluster&gt;**](AlertRuleCluster.md) |  |  [optional]
**failureDataSpace** | **Double** |  | 
**hddDataCapacity** | **Double** |  | 
**hddDiskCount** | **Double** |  | 
**id** | **String** |  | 
**ipmi** | [**AlertAlertRule**](AlertAlertRule.md) |  |  [optional]
**isOsInRaid1** | **Boolean** |  |  [optional]
**labels** | [**List&lt;BrickTopoPowers&gt;**](BrickTopoPowers.md) |  |  [optional]
**localId** | **String** |  | 
**lsmCapDiskSafeUmount** | **Boolean** |  | 
**managementIp** | **String** |  | 
**model** | **String** |  | 
**name** | **String** |  | 
**nestedVirtualization** | **Boolean** |  | 
**nicCount** | **Double** |  | 
**nics** | [**List&lt;AlertRuleCluster&gt;**](AlertRuleCluster.md) |  |  [optional]
**nodeTopoLocalId** | **String** |  |  [optional]
**osMemoryBytes** | **Double** |  | 
**osVersion** | **String** |  |  [optional]
**pmemDimmCapacity** | **Double** |  | 
**pmemDimmCount** | **Double** |  | 
**pmemDimms** | [**List&lt;AlertRuleCluster&gt;**](AlertRuleCluster.md) |  |  [optional]
**pmemDiskCount** | **Double** |  | 
**provisionedCpuCores** | **Double** |  | 
**provisionedMemoryBytes** | **Double** |  | 
**runningPauseVmMemoryBytes** | **Double** |  | 
**runningVmNum** | **Double** |  |  [optional]
**scvmCpu** | **Double** |  |  [optional]
**scvmMemory** | **Double** |  |  [optional]
**scvmName** | **String** |  |  [optional]
**serial** | **String** |  |  [optional]
**ssdDataCapacity** | **Double** |  | 
**ssdDiskCount** | **Double** |  | 
**state** | **HostState** |  | 
**status** | **HostStatus** |  | 
**stoppedVmNum** | **Double** |  |  [optional]
**suspendedVmNum** | **Double** |  |  [optional]
**totalCacheCapacity** | **Double** |  |  [optional]
**totalCpuCores** | **Double** |  | 
**totalCpuHz** | **Double** |  | 
**totalDataCapacity** | **Double** |  | 
**totalMemoryBytes** | **Double** |  | 
**usbDevices** | [**List&lt;AlertRuleCluster&gt;**](AlertRuleCluster.md) |  |  [optional]
**usedCpuHz** | **Double** |  |  [optional]
**usedDataSpace** | **Double** |  | 
**usedMemoryBytes** | **Double** |  |  [optional]
**vmNum** | **Double** |  |  [optional]
**vmotionIp** | **String** |  |  [optional]
**vms** | [**List&lt;AlertRuleCluster&gt;**](AlertRuleCluster.md) |  |  [optional]
**vsphereEsxiAccount** | [**AlertAlertRule**](AlertAlertRule.md) |  |  [optional]
**withFasterSsdAsCache** | **Boolean** |  |  [optional]
**zone** | [**AlertAlertRule**](AlertAlertRule.md) |  |  [optional]




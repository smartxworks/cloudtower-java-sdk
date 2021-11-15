

# SnapshotPlan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoDeleteNum** | **Integer** |  | 
**autoExecuteNum** | **Integer** |  | 
**cluster** | [**NestedCluster**](NestedCluster.md) |  | 
**description** | **String** |  | 
**endTime** | **String** |  |  [optional]
**entityAsyncStatus** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**execHM** | **Object** |  |  [optional]
**executeIntervals** | **List&lt;Integer&gt;** |  | 
**executePlanType** | **SnapshotPlanExecuteType** |  | 
**executionTasks** | [**List&lt;NestedSnapshotPlanTask&gt;**](NestedSnapshotPlanTask.md) |  |  [optional]
**healthy** | **Boolean** |  | 
**id** | **String** |  | 
**lastExecuteEndTime** | **String** |  |  [optional]
**lastExecuteStatus** | **SnapshotPlanExecuteStatus** |  | 
**lastExecuteTime** | **String** |  |  [optional]
**localId** | **String** |  | 
**logicalSizeBytes** | **Double** |  | 
**manualDeleteNum** | **Integer** |  | 
**manualExecuteNum** | **Integer** |  | 
**mirror** | **Boolean** |  | 
**name** | **String** |  | 
**nextExecuteTime** | **String** |  |  [optional]
**objectNum** | **Integer** |  | 
**physicalSizeBytes** | **Double** |  | 
**remainSnapshotNum** | **Integer** |  | 
**snapshotGroupNum** | **Integer** |  | 
**startTime** | **String** |  | 
**status** | **SnapshotPlanStatus** |  | 
**vms** | [**List&lt;NestedVm&gt;**](NestedVm.md) |  |  [optional]




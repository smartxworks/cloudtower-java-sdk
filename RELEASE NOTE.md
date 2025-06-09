# RELEASE NOTE

## release 日期 2025-06-09

v2.20.0 release (tower version 4.6.0)

### feature

- 为所有 model 实现了 ConditionalNullablePojo 用于显式设置某个字段为 null 时，会在序列化时为被显式序列化为 null 还是被忽略（默认会被忽略），可以通过：
  - 新增 ${field}_ExplictlyNull, ${field}_ExplictlyNonNull 方法来控制字段是否被显示设置为 null
  - 新增 set${field}_IsExplictlyNull 方法来设置当前字段是否会被显式序列化为 null
  - 新增 get${field}_IsExplictlyNull 方法来获取字段是否被显式序列化为 null
- [Vm], [VmVolume]: 新增 used_size 与 used_size_usage 字段，用于获取虚拟机与虚拟卷的已使用容量
- [ResourceChangeApi]: 新增 getResourceChange API 用于获取 Resource Change Events
- [PciDeviceApi]: 新增 getPciDevices API 用于获取 PCI 设备列表
- [TaskApi]: 为 createTask 新增 status 字段，用于指定任务状态
- [ReplicationPlanApi]: 新增 getReplicationPlan API 用于获取复制计划列表
- [SmtpServerApi]: 新增 getSmtpServer API 用于获取 SMTP 服务器列表
- [ReplicaVmApi]: 新增 getReplicaVms API 用于获取复制虚拟机列表
- [NetworkPolicyRuleServiceApi]: 
  - 新增 getNetworkPolicyRuleServices API 用于获取「网络安全」的服务资源
  - 新增 createNetworkPolicyRuleService API 用于创建「网络安全」的服务资源
  - 新增 updateNetworkPolicyRuleService API 用于更新「网络安全」的服务资源
  - 新增 deleteNetworkPolicyRuleService API 用于删除「网络安全」的服务资源
- [SecurityPolicyApi]: [SecurityPolicyIngressEgressInput]: 支持配置 `service_ids` 用于指定「网络安全」的服务资源
- [SecurityPolicyApi]: [IPSecurityPolicy]: 支持配置 `ip_block`，用于从白名单/黑名单中排除部分 IP
- [IsolationPolicyApi]: 
  - 新增 createIsolationPolicy API 用于创建「隔离策略」
  - 新增 updateIsolationPolicy API 用于更新「隔离策略」
  - 新增 deleteIsolationPolicy API 用于删除「隔离策略」
- [VirtualPrivateCloudExternalSubnetGroupApi]: 新增 getVirtualPrivateCloudExternalSubnetGroups API 用于获取「外部子网组」
- [VirtualPrivateCloudEdgeGatewayApi]: 新增 getVirtualPrivateCloudEdgeGateways API 用于获取「边缘网关」
- [VirtualPrivateCloudEdgeGatewayGroupApi]: 新增 getVirtualPrivateCloudEdgeGatewayGroups API 用于获取「边缘网关组」
- [VirtualPrivateCloudNatGatewayApi]: [VirtualPrivateCloudNatGatewayCreateParams]: 新增 `external_subnet_group_id` 用于配置外部子网组；新增 `external_ips`，用于配置主备转换地址。
- [VirtualPrivateCloudNatGatewayApi]: [VirtualPrivateCloudRouteGatewayUpdateParams]: 新增 `external_ips`，用于配置主备转换地址。
- [VirtualPrivateCloudRouterGatewayApi]: 
  - [VirtualPrivateCloudRouterGatewayCreateParams]: 新增 `external_subnet_group_id` 用于配置外部子网组；新增 `external_ips`，用于配置主备转换地址。
  - [VirtualPrivateCloudRouterGatewayUpdateParams]: 新增 `external_ips`，用于配置主备转换地址。
- [VirtualPrivateCloudFloatingIPApi]: 新增 batchCreateVirtualPrivateCloudFloatingIPs API，用于批量分配浮动 IP。

### bugfix

- [VmApi]: [getVmVncInfo]: 修复生成的 vnc redirect url
- [VmApi]: [addVmNic] [updateVmNic] [updateVmNicBasicInfo]: 修复虚拟机网卡无法正确编辑 ip

## release 日期 2025-02-17

v2.19.0 release (tower version 4.5.0)

### breaking change

- [TaskApi]: [updateTask]: description 字段由 string 更新为 TaskDescription

### feature

- [BackupPlanApi]: 新增 getBackupRestorePointMetadata API 用于获取备份恢复点元数据;
- [NtpApi]: 新增 getNtpServiceURL API 用于获取 Ntp 服务 URL;
- [ClusterApi]: 新增 getClusterStorageInfo API 用于获取集群存储信息;
- [ObservabilityApi]: 新增 clearSystemServiceAlertNotificationConfig API 用于清除系统服务报警信息

### optimize

- [BackupPlanApi]: [createBackupPlan]: 在 incrementalPeriod 为 Weekly 时，校验 incrementalWeekdays 是否已输入;
- 为以下资源新增返回字段
  - [BackupPlan]: 新增 vms, phase, lastExecuteStatusMessage, lastManualExecuteStatusMessage, backupRestorePointCount, validSizeOfRestorePoint, backupTotalSize, logicalSize, backupDelayOption, deleteStrategy, backupPlanExecutions 和 backupRestorePoints 字段;
  - [NestedVirtualPrivateCloudService]: 新增 internalCidr 和 tepIpPools 字段;
  - [VirtualPrivateCloud]: 新增 vpcService 字段;
  - [SecurityPolicy]: 新增 isBlocklist 字段;
  - [ContentLibraryVmTemplate]: 新增 vmDisks, vmNics, clockOffset, cpu, cpuModel, firmware, ha, ioPolicy, localCreatedAt, maxBandwidth, maxBandwidthPolicy, maxIops, maxIopsPolicy, templateConfig, videoType, winOpt 和 zbsStorageInfo 字段;
  - [VirtualPrivateCloudExternalSubnets]: 新增 edgeGateway 和 exclusive 字段;
- [TaskApi]: [createTask], [updateTask]: 支持传入 startedAt 和 finishedAt 字段;

### bugfix

- [IscsiLunApi]: [copyIscsiLun]: 修复跨集群克隆 iscsi lun 失败;
- [ObservabilityApi]: [disassociateSystemServiceFromObsService]: 修复解除关系错误时无法正确返回错误信息。

## release 日期 2024-10-14

v2.18.0 release (tower version 4.4.0)

### feature

- [VmApi]: [createVmFromContentLibraryTemplateBatch]: 支持批量通过内容库模板创建虚拟机
- 新增备份相关 API
  - [BackupPlanExecutionApi] 备份计划执行记录 API
  - [BackupPlanApi] 备份计划管理 API
  - [BackupRestoreExecutionApi] 备份计划恢复点执行记录 API
  - [BackupRestorePointApi] 备份计划恢复点管理 API
  - [BackupServiceApi] 备份服务 API
  - [BackupStoreRepositoryApi] 备份存储库 API
  - [BackupTargetExecutionApi] 备份虚拟机执行记录 API
### optimize

- [VmApi]: [installVmTools]: 优化虚拟机镜像挂载，现在无需输入虚拟机工具镜像 ID 即可挂载
- [LogCollectionApi]: [forceStopLogCollection]: 优化执行，不再会将日志收集任务置为失败
- [ContentLanguage]: 支持配置为 `*` 以同时返回所有支持的语言，返回值依旧是 string 类型，可以被 JSON 序列化为语言和实际值的键值对
- [SecurityPolicyIngressEgressInput]: 新增 type 字段 `SecurityPolicyFlowControlType` 以支持配置全部流量
- [SecurityPolicyApi] 支持配置 alg_protocol
- [HostApi]: [createHost]: 支持添加主机时配置主机账户密码

### bugfix

- [SecurityGroupApi]: [updateSecurityGroup]: 修复无法正确更新安全组名称与描述

## release 日期 2024-08-21

v2.17.0 release (tower version 4.3.0)

### feature

- 新增 VPC 相关 API
  - [VirtualPrivateCloudApi] VPC 服务管理
  - [VirtualPrivateCloudClusterBindingApi] VPC 服务与集群关联关系
  - [VirtualPrivateCloudExternalSubnetApi] VPC 网络外部子网
  - [VirtualPrivateCloudFloatingIpApi] VPC 网络浮动 IP 管理
  - [VirtualPrivateCloudNatGatewayApi] VPC 网络 NAT 网关管理
  - [VirtualPrivateCloudRouterGatewayApi] VPC 网络路由网关管理
  - [VirtualPrivateCloudRouteTableApi] VPC 网络路由表管理
  - [VirtualPrivateCloudSecurityGroupApi] VPC 网络安全组管理
  - [VirtualPrivateCloudSecurityPolicyApi] VPC 网络安全策略管理
  - [VirtualPrivateCloudSubnetApi] VPC 子网管理
- [VmApi]: [updateVmNicVpc]: 更新虚拟机的 VPC 网卡

### update

- [ContentLibraryImage]: 新增 iscsi_luns 字段，用于记录分发至存算分离节点中的镜像的 lun 。
- [ContentLibraryImageApi]: []支持使用 iscsi_luns 进行搜索
- [VmApi]:
  - [createVm], [createVmFromContentLibraryTemplate], [createVmFromTemplate], [cloneVm], [rebuildVmFromSnapshot] 支持配置虚拟机的 VPC 网卡
  - [addVmNic], [updateVmNic] 支持配置 VPC 网卡

### bugfix

- [VmApi]: [updateVmDisk], [addVmDisk], [expandVmDisk], [removeVmDisk], [addVmCdRom], [removeVmCdRom], [ejectIsoFromVmCdRom], [toggleVmCdRomDisable]: 修复被修改虚拟机的虚拟盘会丢失限速设置以及 cdrom 的禁用的问题
- [vmApi]: [createVmFromContentLibraryTemplate]: 修复当内容库模板仅分发在存算分离的集群时，无法创建虚拟机的问题。

## release 日期 2024-07-16

v2.16.0 release (tower version 4.2.0)

### update

- [HostApi]:
  - [createHost]: 新增 `vdses` 字段适配网络融合，新增 `zbsSpec` 字段适配 zbs 560 以上版本集群的添加
- [VmApi]:
  - [getVms]: 新增 `bios_uuid` 字段
- enum 兼容性处理:
  为所有的 enum 都添加了一个 `${ENUM_NAME}_UNSUPPORTED_ENUM` 项，用于兼容未来新增的枚举值，当未来新增的枚举值不在当前版本的枚举值中时，会返回该项，而不是报错

## release 日期 2024-05-30

v2.15.1 release (tower version 4.1.0)

### bugfix

- [Vm], [VmVolume], [IscsiLun], [NvmfNameSpace], [NfsInode]: 更新 `unique_logical_size` 类型为 `Double`

## release 日期 2024-05-11

v2.15.0 release (tower version 4.1.0)

### update

- [CommonHeader]: 新增默认返回 Header 类
- [ContentLanguage]: 新增枚举规范返回语言，用于设置请求头的 `content-language`
- [NestedLabel], [LabelApi]: `LabelApi` 将会返回一致的 `Label` 相关的属性，NestedLabel 额外返回 `key` 和 `value`。
- [Vm], [VmVolume], [IscsiLun], [NvmfNameSpace], [NfsInode]: 新增返回 `unique_logical_size` 用于表示资源的独占逻辑容量

### bugfix

- [VmApi]
  - [addVmNic], [removeVmNic], [removeVmNicByWhere], [updateVmNic], [updateVmNicBasicInfo], [updateVmNicAdvanceInfo], [updateVmNicQosOption]: 修复更新虚拟机网卡类 API 编辑后丢失部分网卡信息的问题
- [VmPlacementGroupApi]
  - [createVmPlacementGroup], [updateVmPlacementGroup]: 修复了创建与更新放置组时，`vm_vm_policy_enabled` 为 false 时无法更新组内虚拟机成员

## release 日期 2024-01-04

v2.14.0 release (tower version 4.0.0)

### update

- [ContentLibraryImageApi]:
  - [importContentLibraryImage]: 新增通过 url 导入内容库镜像 API
- [GpuDeviceApi]:
  - [getDetailVmInfoByGpuDevices]: 新增获取 GPU 设备关联的虚拟机 API
- [HostApi]:
  - [enterMaintenanceMode]: 新增进入维护模式 API
  - [enterMaintenanceModePreCheck]: 新增进入维护模式预检 API
  - [enterMaintenanceModePrecheckResult]: 新增获取进入维护模式预检结果 API
  - [exitMaintenanceMode]: 新增离开维护模式 API
  - [exitMaintenanceModePrecheckResult]: 新增离开维护模式预检 API
  - [powerOffHost]: 新增主机电源操作 API，用于关闭、重启主机
- [IscsiLunAPi]:
  - [copyIscsiLun]: 新增复制 iscsi lun API
- [NicApi]:
  - [getNics]: 额外返回 iommu_status 以及关联的虚拟机
- [TaskApi]:
  - [createTask]: 新增创建 Task API
  - [updateTask]: 新增更新 Task API
- [UserAuditLogApi]:
  - [createUserAuditLog]: 新增创建事件审计 API
- [VmApi]:
  - [getVmGpuDeviceInfo]: 新增根据虚拟机获取其挂载的 GPU 设备信息 API
  - [getVmVncInfo]: 新增获取 vm vnc 信息 API
  - [migrateVmAcrossCluster]: 优化了报错逻辑，当目标主机存在且不在目标集群上时，直接报错
  - [rebuildVmFromSnapshot]: 重建虚拟机 API 支持配置 PCI 网卡
  - [createVm], [createVmFromTemplate], [createVmFromContentLibraryTemplate], [cloneVm], [rebuildVmFromSnapshot]: 创建虚拟机时支持配置虚拟机所属用户

### bugfix

- [ContentLibraryImageApi]:
  - [updateContentLibraryImage]: 修复了更新内容库镜像时，没有传递 name 会失败的问题
- [ElfImageApi]:
  - [updateElfImage]: 修复了更新镜像时，没有传递 name 会失败的问题
- [vmApi]:
  - [createVmFromContentLibraryTemplate]: 修复模板卷存储策略包含三副本时，非完全克隆虚拟机失败，提示非完全克隆无法修改存储策略的问题

## release 日期 2023-11-07

v2.13.0 release (tower version 3.4.0)

### update

- [ROLEACTION] 新增 `SMTX_INSPECTOR`

## release 日期 2023-10-19

v2.12.0 release (tower version 3.3.0)

### update

- [GpuDeviceApi] 新增 GPU 设备的支持，新增以下 API：
  - [getGpuDevices] 获取 GPU 设备列表
  - [getGpuDeviceConnections] 获取 GPU 设备数量
  - [switchGpuDeviceSriov] 切换 GPU 设备 sr-iov 开启
  - [updateGpuDeviceDescription] 更新 GPU 设备描述
  - [updateGpuDeviceUsage] 更新 GPU 设备用途
- [VmApi] 新增 GPU 设备支持：
  - 支持创建虚拟机，克隆虚拟机，从内容库模板创建虚拟机时额外配置 GPU 设备，需要指定主机
  - 新增 [addVmGpuDevice] 为已有虚拟机挂载 GPU 设备
  - 新增 [removeVmGpuDevice] 为已有虚拟机卸载 GPU 设备
- [VmApi] 新增 PCI 网卡支持：
  - 支持创建虚拟机，克隆虚拟机，从内容库模板创建虚拟机时额外配置 PCI 网卡，需要指定主机
  - 新增 [addVmPciNic] 支持为已有虚拟机挂载 PCI 网卡
  - 新增 [removeVmPciNicCall] 支持为已有的虚拟机卸载 PCI 网卡
- [VmApi] 优化卸载网卡:
  - [removeVmNic] `nic_index` 作为删除标记不够稳定，弃用
  - [removeVmNicByWhere] 新方法，支持使用 where 条件来筛选需要的网卡，对于 VmNic 而言，可以配合使用 vm + mac_address 的筛选， `{vm:<vm_where>, mac_address:<mac_address>}` 的形式来较为稳定的筛选出需要的 VmNic
- [NicApi] [updateNic] 支持通过 `nic_user_usage` 更新网口用途
- [LabelApi] 支持为 GPU 设备打标签

## release 日期 2023-09-01

v2.11.0 release (tower version 3.2.0)

### breaking change

- [VmApi]: [VmImportParams]: 由于 `VmNicParams` 支持配置 qos 配置，现在设计网卡的参数由 `VmNicParams` 更新为了 `VmImportNicParams`，类型和过去一致，没有 qos 支持。

### update

- feature: [VmVolumeApi]: [importVmVolume] [exportVmVolume]: 现在支持虚拟卷的导入与导出
- feature: [ContentLibraryVmTemplateApi]: [importContentLibraryVmTemplate] [exportContentLibraryVmTemplate]: 现在支持虚拟机模板的导入与导出
- feature: [VmApi]: [updateVmNicQosOption]: 现在支持通过 api 更新现有虚拟机网卡的 qos 属性
- optimize: [VmNicParams]: 现在支持配置 `qos` 参数，用于在创建虚拟机（直接创建，模板创建，快照重建，克隆创建）时配置虚拟机网卡的 qos 参数

### bugfix

- [VmApi]: [createVmFromTemplate] [createVmFromContentLibraryTemplate] [cloneVm] [rebuildVmFromSnapshot]: 修复了磁盘限速无法正确配置的问题，
  目前从模板创建，快照重建，克隆虚拟机时，仅支持配置与模板，快照或源虚拟机一致的 `io_policy` 并进行创建，原参数的 `io_policy` 被弃用
- [IscsiTargetApi] [IscsiLunApi] [NvmfSubsystemApi] [NvmfNamespaceApi]:
  [createIscsiTarget] [updateIscsiTarget] [createIscsiLun] [updateIscsiLun]
  [createNvmfSubsystem] [updateNvmfSubsystem] [createNvmfNamespace] [updateNvmfNamespace]:
  `bps_wr_maxLength` 可以被正常设置了
- [VmApi]: [createVmFromTemplate] [createVmFromContentLibraryTemplate]: 修复了单位无法被正常应用的 bug
- [GlobalAlertRuleApi]: [updateCustomizeAlertRule] 修复了特例报警无法正常更新的问题

## release 日期 2023-08-01

v2.10.0 release

- feature: [AlertNotifierApi] 支持更新，删除以及创建新的报警通知配置
- optimize: [TaskUtil] WaitTask WaitTasks 现在会额外返回错误 task 的信息

## release 日期 2023-07-18

v2.9.1 release

- optimize: 优化 ClientUtil.login 登陆，当 useLDAP 为 true 时，自动切换成当前的 LDAP 登录源进行登陆，减少迁移成本。

## release 日期 2023-07-03

v2.9.0 release

- feature: [SecurityGroupApi] 支持创建，更新与删除安全组
- feature: [SecurityPolicy] 支持创建，更新与删除自定义安全策略
- feature: [OvfApi], [VmExportFileApi], [VmApi] 支持虚拟机的导入与导出
- feature: [VlanApi] 支持 trunk vlan 的创建与编辑
- feature: [UserApi] [Login] 支持使用 authn_id 登陆，旧 LDAP 登陆方式被废弃
- optimize: 为 [Host], [Nic], [UsbDevice], [VmVolume], [VmVolumeSnapshot] 添加了 `EntityAsyncStatus` 已判断资源目前的状态

## release 日期 2023-05-04

v2.8.0 release

- optimize: VlanApi: [VmVlanCreation_params], [VmVlanUpdationParamsData], [ManagementVlanUpdationParamsData] 限制 `VlanId` 范围为 0~4095

## release 日期 2023-03-22

v2.7.0 release

- optimize: VmApi: [deleteVm] 更新参数类型为 `VmDeleteParams`，添加 `effect` 允许删除相关的快照
- feature: [vm_usage] 枚举添加:
  - `BUNDLE_APPLICATION`
- feature: [ROLE_ACTION] 枚举添加:
  - `MANAGE_OBSERVABILITY_PACKAGE`
  - `MANAGE_OBSERVABILITY_SERVICE`
- feature: [software_edition] 枚举添加：
  - `ENTERPRISE_PLUS`
- feature: [upload_resource_type] 枚举添加:
  - `HOST_PLUGIN_PACKAGE`
- feature: [task_type] 枚举添加:
  - `HOST_PLUGIN`

## release 日期 2023-02-20

v2.6.0 release

- feature: [vm_usage] 枚举添加 `SKS_MANAGEMENT` 与 `REGISTRY`
- feature: [ROLEACTION] 枚举添加:
  - `MANAGE_SKS_SERVICE`
  - `MANAGE_SKS_LICENSE`
  - `CONFIGURE_SKS_SERVICE`
  - `CREATE_SKS_WORKLOAD_CLUSTER`
  - `DELETE_SKS_WORKLOAD_CLUSTER`
  - `UPDATE_SKS_WORKLOAD_CLUSTER`
  - `DOWNLOAD_SKS_WORKLOAD_CLUSTER_KUBECONFIG`

## release 日期 2023-01-03

v2.5.0 release

- bugfix: [IscsiTargetCommonParams]: 修复错误的 `BpsWrMaxSize` 为 `BpsWrMaxUnit`
- feature: IscsiLunSnapshotApi: [createIscsiLunSnapshot] 增加了同步创建 lun 快照的选项。
- feature: ClusterApi: [getMetaLeader]: 增加了获取集群 meta leader 的 api
- optimize: 增加 header 定义，可以从返回值中获取对应的 x-tower-request-id
- optimize: [NestedHost]: 嵌套的主机类型额外返回 management_ip
- optimize: UserApi: [login] 返回值重命名为 WithTaskLoginResponse

## release 日期 2022-11-18

v2.4.0 release

- feature:CloudTowerApplicationApi: [CloudTowerApplicationApi] 新增 CloudTowerApplicationApi;
  - [getCloudTowerApplications] 获取应用;
  - [uploadCloudTowerApplicationPackage] 上传应用包;
  - [deleteCloudTowerApplicationPackage] 删除应用包;
  - [deployCloudTowerApplication] 部署应用;
  - [upgradeCloudTowerApplication] 升级应用;
  - [uninstallCloudTowerApplication] 删除应用;
- feature:CloudTowerApplicationPackageApi: [CloudTowerApplicationPackageApi] 新增 CloudTowerApplicationPackageApi;
  - [getCloudTowerApplicationPackages] 获取应用包.
- optimize: 存储容量, 内存容量相关的 api 参数都允许传入 `${field}_unit` 形式的参数来为输入参数设置单位，类型为 `ByteUnit`，默认为 `ByteUnit.B`;
- optimize: 带宽相关的 api 参数都允许传入 `${field}_unit` 形式的参数来为输入参数设置单位，类型为 `BpsUnit`，默认为 `BpsUnit.Bps`.

## release 日期 2022-09-05

v2.3.0 release

- feature:VmVolumeSnapshotApi: [getVmVolumeSnapshots] 新增虚拟卷快照查询 api
- feature:VmVolumeSnapshotApi: [createVmVolumeSnapshot] 新增创建虚拟卷快照 api
- feature:VmVolumeSnapshotApi: [deleteVmVolumeSnapshot] 新增删除虚拟卷快照 api
- feature:VmVolumeApi: [cloneVmVolume] 新增克隆虚拟卷 api
- feature:VmVolumeApi: [rebuildVmVolume] 新增通过虚拟卷快照重建虚拟卷 api
- feature:VmVolumeApi: [rollbackVmVolume] 新增回滚虚拟卷至指定虚拟卷快照 api
- feature:VmVolumeApi: [updateVmVolume] 新增编辑虚拟卷 api
- feature:UserApi: [getMyInfo] 新增查询当前 client 对应用户 api
- feature:VersionApi: [getApiInfo] 新增查询当前 api 版本 api
- feature:VmApi: 新增内容库镜像支持，[VmCdRomParams] 支持传入 `content_library_image_id` 来挂载内容库镜像
- optimize: 优化 `WaitTask`, `WaitTasks` 方法，在没有搜索到对应 `taskId` 的 task 情况下，尝试等待 task 被创建或直到超时

## release 日期 2022-08-12

v2.2.0 release

- feature:VmApi: [createVmFromContentLibraryTemplate] 新增通过内容库模板创建虚拟机 api
- bugfix: 正确生成嵌套类型的数字类型

## release 日期 2022-07-08

v2.1.0 release

- feature:ClusterApi: [updateClusterNetworkSetting] 新增更新集群网络配置 api
- feature:ClusterApi: [updateClusterVirtualizationSetting] 新增更新集群虚拟化设置 api
- feature:ClusterApi: [updateClusterHaSetting] 新增更新集群高可用设置 api
- feature:ClusterApi: [updateClusterEnableISCSISetting] 新增更新集群块功能启用设置 api
- feature:VmApi: [migrateVmAcrossCluster] 新增跨集群迁移虚拟机 api
- feature:VmApi: [abortMigrateVmAcrossCluster] 新增取消跨集群迁移 api
- feature:VmApi: [stopVmInCutoverMigration] 新增关闭源虚拟机 api
- feature:VmApi: [updateVmHostOptions] 新增更新虚拟机 guest os 设置 api，更新 dns, hostname 与 ntp server，需要虚拟机工具的支持。
- feature:VmApi: [resetVmGuestOsPassword] 新增更新虚拟机 guest os 用户密码 api，需要虚拟机工具的支持。
- feature:VmApi: [updateVmOwner] 新增更新虚拟机拥有者 api
- feature:SecurityApi: [updatePasswordSecurity] 新增更新密码安全设置 api
- feature:SecurityApi: [updateAccessRestriction] 新增更新访问限制 api
- feature:SecurityApi: [updateSessionTimeout] 新增更新会话超时 api
- feature:VcenterAccountApi: [updateVcenterAccount] 新增更新 vcenter 账号 api
- feature:VcenterAccountApi: [createVcenterAccount] 新增添加 vcenter 账号 api
- feature:VsphereEsxiAccountApi: [updateVsphereEsxiAccount] 新增更新 vsphere esxi 账号 api
- feature:SvtImageApi: [UploadSvtImage] 新增上传虚拟机镜像 api 工具
- feature:TableReporterApi: [exportCSV] 新增导出 CSV 报表 api
- feature:UploadTaskApi: [cancelUploadTask] 新增取消上传 api
- feature:LabelApi: [addLabelsToResources],[removeLabelsFromResources] 新增想内容库模板，内容库镜像，隔离策略，安全策略添加，删除标签

- bugfix:ContentLibraryImageApi,ElfImageApi: 修复了上传类 Api 无法正确执行的问题，并优化了上传类 Api 的执行逻辑，第一次上传时会上传第一个分片而非只是创建一个上传任务，详见[示例](/examples/upload/readme.md)

- optimize:VmTemplateApi: 优化了模板创建时根据传入的 cpu 参数和模板参数计算缺省值的逻辑
- optimize:ContentLibraryImageApi: 优化了分发的逻辑，不再同时上传一个镜像至多个集群，等待上传置单个集群后再分发。
- optimize:ContentLibraryImageApi,ElfImageApi: 所有上传类 Api 接受的文件类型参数都由 `System.io.File` 变为了 `byte[]` 使分片上传更加容易实现
- optimize: 添加了 `ClientUtil.login` 方法来维护登录逻辑，不再需要手动赋值 token。
- optimize: 添加了 `IsoUtil.getSvtIsoVersion` 方法来获得虚拟机工具镜像的版本号。

## release 日期：2022-05-26

v2.0.0+rev1 release

- bugfix: [Cluster],[ClusterWhereInput]: 修复 `usedMemoryBytes`, `usedCpuUsage` 的数据类型 Long -> Double
- bugfix: [Host],[HostWhereInput]: 修复 `usedMemoryBytes`, `usedCpuUsage`的数据类型 Long -> Double
- bugfix: [Datacenter],[DatacenterWhereInput]: 修复 `usedMemoryBytes`, `usedCpuUsage` 的数据类型 Long -> Double

## release 日期：2022-05-20

v2.0.0 release

- feature: 开放内容库相关 Api [ContentLibraryImage], [ContentLibraryVMTemplate]
- feature: 新增 [Metric] 功能，用于查询资源性能指标
- bugfix: 移除 [Witness] 中的 [management_ip] 字段

## release 日期：2022-05-07

v1.10.0 release

- bugfix: [VmVolume],[VmVolumeWhereInput]: 修复 `guestSizeUsage` 的数据类型 Long -> Double

## release 日期：2022-04-29

v1.10.0-rc1 release

- feature: UserApi: [createRootUser]: 创建初始 root 用户，创建用户需要传递 role id，而获取 role id 需要鉴权，提供一个接口在没有账号被建立的情况下创建一个默认的 root 用户，不需要鉴权；
- feature: VmApi: [expandVmDisk]: 提供扩容指定虚拟盘的能力；
- feature: VmApi: [ejectIsoFromVmCdRom]: 将 iso 从 vm cdrom 中卸载；
- feature: VmApi: [toggleVmCdRomDisable]: 禁用、启用 vm cdrom；
- feature: VmApi: [updateVmNicBasicInfo]: 更新一个虚拟机网卡的常用信息，包括 IP 地址，网关地址，子网掩码，需要虚拟机工具的支持；
- feature: VmApi: [updateVmNicAdvanceInfo]: 更新一个虚拟机网卡的非常用信息，包括接入的虚拟网络，sriov 网卡的直连网卡，mac 地址，是否启用，以及是否开启镜像模式；
- feature: VmApi: [updateVmAdvancedOptions]: 更新虚拟机的高级信息，包括 CPU 兼容性，虚拟机时钟(UTC、LocalTime)，是否开启为 windows 优化，以及虚拟机显卡型号；
- optimize: 提供了更加完整的错误返回信息，包含了错误发生的位置，graphql operationName，并透传 tower server 状态码。
- optimize: 缩短了部分变量类型名称。
- bugfix: VmApi: [createVmFromTemplate], []: 修复了无法在使用模板创建虚拟机时挂载已存在的虚拟机和 cd-rom 的问题，修正 MountDiskParams 中的 index 为可选项。
- bugfix: 使用了更加准确的数字类型，将以 Byte，HZ 为单位的数字类型从 Double 转为了 Long；
- bugfix: 将分类错误的 endpoint 移至正确的 api 下
  - [getIscsiConnections]: IscsiApi -> IscsiConnectionApi
  - [createNvmfSubsystem]: DefaultApi -> NvmfSubsystemApi
  - [deleteNvmfSubsystem]: DefaultApi -> NvmfSubsystemApi
  - [updateNvmfSubsystem]: DefaultApi -> NvmfSubsystemApi

# RELEASE NOTE

## release 日期 2023-01-03

v2.5.0 release

- bugfix: [IscsiTargetCommonParams]: 修复错误的 `BpsWrMaxSize` 为 `BpsWrMaxUnit`
- feature: IscsiLunSnapshotApi: [createIscsiLunSnapshot] 增加了同步创建 lun 快照的选项。
- feature: ClusterApi: [getMetaLeader]: 增加了获取集群 meta leader 的 api
- optimize: 增加 header 定义，可以从返回值中获取对应的 x-tower-request-id
- optimize: [NestedHost]: 嵌套的主机类型额外返回 management_ip

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

# RELEASE NOTE

## release 日期：2022-05-25
v1.10.0+rev1 release
- bugfix: [Cluster],[ClusterWhereInput]: 修复 `usedMemoryBytes`, `usedCpuUsage` 的数据类型 Long -> Double
- bugfix: [Host],[HostWhereInput]: 修复 `usedMemoryBytes`, `usedCpuUsage`的数据类型 Long -> Double
- bugfix: [Datacenter],[DatacenterWhereInput]: 修复 `usedMemoryBytes`, `usedCpuUsage` 的数据类型 Long -> Double

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

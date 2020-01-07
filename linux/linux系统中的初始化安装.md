#linux系统初始化配置
##安装iptables
    yum -y install net-tools
    禁用firewall.service并关闭开机启动
    systemctl stop firewall.service
    systemctl disable firewall.service
    设置iptables开机启用
    systemctl restart iptables.service
    systemctl enable iptables.service
##安装文件上传下载插件
    yum install -y lrzsz
##安装vim
    yum install -y vim
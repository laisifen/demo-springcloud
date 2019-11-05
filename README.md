# demo-springcloud
我的springcloud学习

### 多端口启动设置
在"Configuration"下的VM options中填入需要修改的属性值
本文修改profile和port，指定当前激活的配置文件是dev，端口号是8081，配置如下：
-Dspring.profiles.active=dev -Dserver.port=8081

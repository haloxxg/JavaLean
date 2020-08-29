Demo运行前提条件：
1、拥有蚂蚁金服开放平台入驻账号：https://openhome.alipay.com/platform/home.htm
2、对应appid下挂载获取会员信息功能（详见说明文档）

应用部署运行：
1、配置resource/application.properties文件中的相关参数
2、在alipayDemo_hello/ 目录下,执行: mvn clean  package 打包命令
3、在alipayDemo_hello/ 目录下,启动命令alipayDemo-hello系统：java -jar target/alipay.demo4hello-1.0.0.jar com.alipay.demo.Application.class（或者右键运行com.alipay.demo.Application.class文件）
4、在浏览器下打开：http://127.0.0.1:8080(端口与alipayDemo_hello/src/main/resources/application.properties中配置的server.port保持一致)， 再根据页面里面的内容操作
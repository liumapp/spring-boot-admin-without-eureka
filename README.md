# spring-boot-admin-without-eureka
在Spring Boot Admin中手动注册其他服务，而不是使用Eureka来进行管理的案例项目

## 流程

* 编写服务端和客户端基础代码

    * 服务端见admin-server，主要是配置spring-boot-admin依赖，然后启用admin服务即可
    
    * 客户端见admin-client-a和admin-client-b，主要是配置spring-boot-admin-starter和spring-boot-starter-security，然后进行相关配置即可
    
* 配置客户端日志文件，使admin-server的web系统可以在线浏览客户端的日志输出

    * 配置客户端，将日志输出保存在一个文件上
    
        
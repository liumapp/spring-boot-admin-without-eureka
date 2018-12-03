# spring-boot-admin-without-eureka
在Spring Boot Admin中手动注册其他服务，而不是使用Eureka来进行管理的案例项目

## 如何使用

* clone the project 

* run admin-server

* run admin-client-a

* run admin-client-b

* 在浏览器访问http://localhost:7070 

* 用户名默认为admin， 密码为adminadmin

## 流程

* 编写服务端和客户端基础代码

    * 服务端见admin-server，主要是配置spring-boot-admin依赖，然后启用admin服务即可
    
    * 客户端见admin-client-a和admin-client-b，主要是配置spring-boot-admin-starter和spring-boot-starter-security，然后进行相关配置即可
    
* 配置客户端日志文件，使admin-server的web系统可以在线浏览客户端的日志输出

    * 配置客户端，将日志输出保存在一个文件上即可
    
* 配置admin-server的账号密码

    * 添加spring-boot-starter-security的依赖（服务端与客户端都需要）
    
    * 配置SecuritySecureConfig，并设置Spring security的用户名与密码，具体见admin-server
    
* 配置admin-client在注册admin-server时，提交账户信息

    * 在配置文件中加入以下内容即可
    
    
           spring:
             boot:
               admin:
                 client:
                   url: http://localhost:7070
                   username: 'admin'
                   password: 'adminadmin'    

    
        这里写的跟官方文档介绍的不同，经过实际测试，2.0.2版本的只有这样写才可以手动注册成功
        
        
        
        

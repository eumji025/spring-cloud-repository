# 文档记录

update to new version 
spring boot:2.1.3.RELEASE
spring cloud:Greenwich.SR3


## spring-cloud-config

>Spring Cloud Config为分布式系统中的外部配置提供服务器和客户端支持。使用Config Server，您可以在所有环境中管理应用程序的外部属性。客户端和服务器映射的概念与Spring Environment和PropertySource抽象相同，因此它们与Spring应用程序非常契合，但可以与任何以任何语言运行的应用程序一起使用。随着应用程序通过从开发人员到测试和生产的部署流程，您可以管理这些环境之间的配置，并确定应用程序具有迁移时需要运行的一切。服务器存储后端的默认实现使用git，因此它轻松支持标签版本的配置环境，以及可用于管理内容的各种工具。可以轻松添加替代实现，并使用Spring配置将其插入。

### spring-cloud-config-client

是spring-cloud-config的客户端配置

### spring-cloud-config-server
是spring-cloud-config的服务端配置

###  spring-cloud-discovery-eureka-server
eureka的服务端配置

###  spring-cloud-discovery-eureka-client
eureka客户端的配置

###  spring-cloud-discovery-eureka-client2
eureka客户端的配置,用于负载均衡

###  spring-cloud-netflix-feign
netflix下的负载均衡组件

### spring-cloud-netflix-ribbon
netflix下的负载均衡组件

### spring-cloud-netflix-hystrix-fallback
使用hystrix的fallback功能
和ribbon的例子差不多,通过@HystrixCommand注解指定当服务不可达的时候,相应一个默认值.

### spring-cloud-netflix-hystrix-dashboard
断路由仪表盘的例子

### spring-cloud-netflix-hystrix-zuul-proxy
使用zuul作为代理服务器,对请求的url进行转发
本节使用最简单的转发,直接转发到某个url地址

### spring-cloud-netflix-hystrix-zuul-proxy2
使用feign进行动态的路由,需要配置serviceId,也就是feign客户端的名称

### 说明
后面按照官方文档将要学习spring cloud stream相关的内容,在这之前要先学习一下RabbitMQ相关的知识,


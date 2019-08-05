# springboot-dubbo-provider-
springboot整合dubbo，zookeeper集群做协调服务，这个做提供者(服务端)
jdk：1.8，springboot：2.1.6，dubbo：0.2.0

zookeeper：3.4.9，curator：2.12.0

zookeeper集群的其中一个端口：192.168.137.131：2181
```
  
├─.mvn
│  └─wrapper
│          maven-wrapper.jar
│          maven-wrapper.properties
│          MavenWrapperDownloader.java
│          
│      
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─ssm
│  │  │          │  DubboProviderApplication.java  //启动类
│  │  │          │  
│  │  │          ├─mapper
│  │  │          │      UserMapper.java		//mybatis接口
│  │  │          │      
│  │  │          ├─pojo
│  │  │          │      User.java			//bean
│  │  │          │      
│  │  │          └─service
│  │  │              │  UserService.java		//服务接口
│  │  │              │  
│  │  │              └─impl
│  │  │                      UserServiceImpl.java	//服务实现类
│  │  │                      
│  │  └─resources
│  │      │  application.yml				//全局配置文件
│  │      │  
│  │      ├─mapper
│  │      │      UserMapper.xml			//mybatis配置文件
│  │      │      
│  │      ├─static
│  │      └─templates

```

# springboot-dubbo-provider-
springboot整合dubbo，zookeeper集群做协调服务，这个做提供者(服务端)
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

package com.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
@EnableDubbo   //添加注解，知道开启dubbo
@SpringBootApplication()
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}

}

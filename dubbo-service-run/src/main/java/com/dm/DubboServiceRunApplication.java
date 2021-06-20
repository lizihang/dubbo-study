package com.dm;

import org.apache.dubbo.apidocs.EnableDubboApiDocs;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@EnableDubboApiDocs
@SpringBootApplication
public class DubboServiceRunApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DubboServiceRunApplication.class, args);
	}
}

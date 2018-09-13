package com.tech.wxdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
* @author 文心雕龙 Email：xuwenlong@shike8888.com
* @version 创建时间：2017年6月12日 下午10:01:14
* 类说明
*/
@SpringBootApplication
@ComponentScan("com.tech.wxdl")
public class DemoApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
}

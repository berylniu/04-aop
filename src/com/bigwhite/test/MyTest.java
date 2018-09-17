package com.bigwhite.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigwhite.service.ISomeService;
import com.bigwhite.service.SomeServiceImpl;

public class MyTest {
	
	@Test
	public void test01(){
		ISomeService someservice = new SomeServiceImpl();
		someservice.SomeService();
	}
	@Test
	public void test02(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService iss = (ISomeService) ac.getBean("someservice");
		iss.SomeService();
	}
	
	@Test
//	接口的实现类
	public void test03(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService iss = (ISomeService) ac.getBean(ISomeService.class);
		iss.SomeService();
	}
}

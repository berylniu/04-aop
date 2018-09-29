package com.bigwhite.annotion;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01(){
		String config ="com/bigwhite/annotion/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = ac.getBean(ISomeService.class);
		//默认bean需把实现类首单词小写
//		ISomeService service = (ISomeService) ac.getBean("someServiceImpl");
		service.doFirst();
		System.out.println("==========");
		System.out.println(service.doSecond());
		System.out.println("==========");
		service.doThird();
		System.out.println("==========");
	}
}







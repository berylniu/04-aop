package com.bigwhite.di02;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01(){
		String config ="com/bigwhite/di02/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
	}
	
	@Test
	public void test02(){
		String config ="com/bigwhite/di02/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student s = (Student) ac.getBean("student1");
		System.out.println(s);
	}
}







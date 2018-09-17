package com.bigwhite.di01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01(){
		String config ="com/bigwhite/di01/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
	}
}







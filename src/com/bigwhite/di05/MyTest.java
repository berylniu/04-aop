package com.bigwhite.di05;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01(){
		String config ="com/bigwhite/di05/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}

}







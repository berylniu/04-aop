package com.bigwhite.di07;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//	多个同级配置文件配置方式
//	1，多个配置文件
	@Test
	public void test01(){
		String config ="com/bigwhite/di07/springTotal.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
	
}







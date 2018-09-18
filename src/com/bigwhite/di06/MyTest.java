package com.bigwhite.di06;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//	多个同级配置文件配置方式
//	1，多个配置文件
	@Test
	public void test01(){
		String config ="com/bigwhite/di06/spring-student.xml";
		String config1 ="com/bigwhite/di06/spring-person.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config,config1);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
	
//	2，通配符方式
	@Test
	public void test02(){
		String config ="com/bigwhite/di06/spring*.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
//	3，数组方式
	@Test
	public void test03(){
		String config ="com/bigwhite/di06/spring-student.xml";
		String config1 ="com/bigwhite/di06/spring-person.xml";
		String[] conf = {config,config1};
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
}







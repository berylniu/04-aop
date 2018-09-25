package com.bigwhite.annotion;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//该类为切面
@Component
@Aspect
public class MyAspect {
	//	前置通知：目标方法执行之前执行
	@Before("execution(* *..annotion.ISomeService.doFirst(..))")
	public void before() {
		System.out.println("这是前置方法");
	}
	//
	@Before("execution(* *..annotion.ISomeService.doFirst(..))")
	public void before(JoinPoint jp) {
		System.out.println("JP" + jp);
		System.out.println("JP" + jp.getKind());
		System.out.println("JP" + jp.getArgs());
		System.out.println("JP" + jp.getSignature());
	}
}

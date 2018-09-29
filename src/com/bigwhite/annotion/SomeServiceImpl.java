package com.bigwhite.annotion;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst");
	}
	@Override
	public String doSecond() {
		System.out.println("执行doSecond");
		return "牛小牛";
	}
	@Override
	public void doThird() {
		System.out.println("执行doThird");
	}
}

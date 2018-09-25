package com.bigwhite.annotion;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst");
	}
	@Override
	public void doSecond() {
		System.out.println("执行doSecond");
	}
	@Override
	public void doThird() {
		System.out.println("执行doThird");
	}
}

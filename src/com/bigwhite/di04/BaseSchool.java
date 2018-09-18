package com.bigwhite.di04;

public class BaseSchool extends School {
	private String address;
	public BaseSchool() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseSchool(String address) {
		super();
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "BaseSchool [address=" + address + "]";
	}	
}

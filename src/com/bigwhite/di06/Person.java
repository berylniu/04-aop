package com.bigwhite.di06;

public class Person {
	private String pname;
	private int page;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pname, int page) {
		super();
		this.pname = pname;
		this.page = page;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", page=" + page + "]";
	}
}

package com.spring.impl;



import com.spring.i.Person;

public class zhangsan implements Person{
	
	String sex = "女";
	String name = "张三";
	@Override
	public void findlove() {
		System.out.println("要找高富帅");
	}



}

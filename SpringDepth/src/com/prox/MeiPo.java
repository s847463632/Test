package com.prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.spring.i.Person;

public class MeiPo implements InvocationHandler{
	private Person person;
	
	public Object getIstance(Person person) {
		this.person = person;
		return person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		return null;
	}

	
}

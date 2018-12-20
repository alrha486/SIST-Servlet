package com.example.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Hello;

public class TestApp {
	private BeanFactory bean;
	
	@Before
	public void init() {
		this.bean = new GenericXmlApplicationContext("classpath:beans.xml");
	}
	
	@Test
	public void test() {
		assertNotNull(this.bean);
	}
	
	@Test
	public void test1() {
		Hello hello = this.bean.getBean("hello", Hello.class);
		System.out.println(hello);
		hello.calculation();
	}

}

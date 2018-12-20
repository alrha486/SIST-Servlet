package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Student;
import com.example.Worker;

public class TestApp {
	private ApplicationContext ctx;
	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:beans.xml");
	}
	@Test
	public void test() {
		Student jimin = this.ctx.getBean("jimin", Student.class);
		System.out.println(jimin);
		
		Worker chulsu = this.ctx.getBean("chulsu", Worker.class);
		System.out.println(chulsu);
	}

}

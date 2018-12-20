package com.example.test;

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
		assertNotNull(this.ctx);
	}
	@Test
	public void test1() {
		Student student = this.ctx.getBean("student", Student.class);
		System.out.println(student);
		Worker worker = this.ctx.getBean("worker", Worker.class);
		System.out.println(worker);
	}

}

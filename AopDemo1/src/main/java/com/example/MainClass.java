package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String [] args) {
		String config = "classpath:beans.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		Hello hello = (Hello)ctx.getBean("hello");
		System.out.println(hello);
	}
}

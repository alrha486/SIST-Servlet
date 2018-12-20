package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	@Value("한지민")
	private String name;
	@Value("25")
	private int age;
	
	@Override
	public String toString() {
		return "Hello [name=" + name + ", age=" + age + "]";
	}
	
	public void calculation(){
		System.out.println(5 / 0);
	}
}

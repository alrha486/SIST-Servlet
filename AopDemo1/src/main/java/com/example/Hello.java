package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	@Value("Spring")
	private String name;
	@Value("25")
	private int age;
	private void display() {
		System.out.println("I'm display method.");
	}
	@Override
	public String toString() {
		return String.format("Hello [name=%s, age=%s]", name, age);
	}
}

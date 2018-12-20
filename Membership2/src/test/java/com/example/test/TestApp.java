package com.example.test;

import static org.junit.Assert.assertSame;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.UserService;
import com.example.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestApp {
	private Scanner scan;
	
	@Before
	public void init() {
		this.scan = new Scanner(System.in);
	}
	
	@Autowired
	UserService userService;
	
	@Test 
	public void test4() {
		test();
		System.out.print("Enter a userid to delete: ");  
		String userid = this.scan.next();
		this.userService.delete(userid);
		test();
	}
	
	@Test @Ignore
	public void test2() {
		test();
		System.out.print("Enter a userid to select: ");  
		String userid = this.scan.next();
		System.out.println(this.userService.read(userid));
	}
	
	@Test @Ignore
	public void test3() {
		test();
		System.out.print("Enter a userid to update : ");  
		String userid = this.scan.next();
		System.out.print("Enter your city : ");  
		String city = this.scan.next();
		UserVO user = new UserVO(userid, "", "", city);
		int row = this.userService.update(user);
		assertSame(1, row);
		test();
	}
	
	@Test @Ignore 
	public void test1() {
		System.out.print("Enter a userid : ");  String userid = this.scan.next();
		System.out.print("Enter your name : ");  String name = this.scan.next();
		System.out.print("Enter your gender : ");  String gender = this.scan.next();
		System.out.print("Enter your city : ");  String city = this.scan.next();
		UserVO user = new UserVO(userid, name, gender, city);
		int row = this.userService.create(user);
		assertSame(1, row);
		test();
	}
	
	@Test @Ignore
	public void test() {
		//SELECT ALL
		for(UserVO user : this.userService.readAll()) {
			System.out.println(user);
		}
	}

}

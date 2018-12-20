package com.example.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.EmployeeService;
import com.example.vo.EmployeeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class TestApp {
	private Scanner scan;
	@Before
	public void init() {
		this.scan = new Scanner(System.in);
	}
	@Autowired
	EmployeeService empService;
	
	@Test 
	public void test2() {
		System.out.print("근무지 : ");     String loc = scan.next();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loc", loc);
		this.empService.readByLoc(map);
		List<EmployeeVO> list = (List<EmployeeVO>)map.get("result");
		for(EmployeeVO empVo : list) {
			System.out.printf("%s(%d), %d, %s, %s\n", empVo.getEname(), 
					empVo.getEmpno(), empVo.getDeptno(), empVo.getDname(), 
					empVo.getLoc());
		}
	}
	
	@Test @Ignore
	public void test1() {
		test();
		System.out.print("검색할 사원 번호 : ");   
		int empno = scan.nextInt();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empno", empno);
		this.empService.read(map);
		List<EmployeeVO> list = (List<EmployeeVO>)map.get("result");
		System.out.println(list.get(0));
	}
	
	@Test @Ignore
	public void test() {
		Map<String, Object> map = new HashMap<String, Object>();
		this.empService.readAll(map);
		List<EmployeeVO> list = (List<EmployeeVO>)map.get("result");
		for(EmployeeVO empVo : list) {
			System.out.println(empVo);
		}
	}
	
}

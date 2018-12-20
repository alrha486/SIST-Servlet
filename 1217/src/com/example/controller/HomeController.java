package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.vo.HelloVO;

@Controller
public class HomeController {
	@Autowired
	HelloVO helloVo;
	
	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("greeting", this.helloVo.sayHello());
		return "test.jsp";
	}
}

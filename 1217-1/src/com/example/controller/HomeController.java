package com.example.controller;

import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.MemberService;
import com.example.vo.MemberVO;

@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Model model) {
		List<MemberVO> list = this.memberService.readAll();
		model.addAttribute("list", list);
		return "list.jsp";
	}
	
	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String join() {
		return "register.html";
	}
	
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String join(MemberVO memberVo, Model model) {
		int row = this.memberService.create(memberVo);
		if(row == 1) return "redirect:/list.do";
		else return "register.html";
	}
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String view(HttpServletRequest request, Model model) {
		String userid = request.getParameter("userid");
		MemberVO memberVo = this.memberService.read(userid);
		model.addAttribute("userinfo", memberVo);
		return "view.jsp";
	}
	
	
	
	
	
	
}

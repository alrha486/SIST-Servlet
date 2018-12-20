package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.MemberService;
import com.example.vo.MemberListVO;
import com.example.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;

	@RequestMapping(value = "/list", produces="application/xml")
	@ResponseBody
	public MemberListVO list() {
		List<MemberVO> list = this.memberService.select();
		MemberListVO memberList = new MemberListVO();
		memberList.setMemberList(list);
		return memberList;
	}
}

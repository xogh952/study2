package com.study.member.web;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.member.service.MemberServiceImpl;
import com.study.member.vo.Member;
import com.study.servlet.IController;

public class MemberViewController implements IController{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		MemberServiceImpl memberService = new MemberServiceImpl();
		String viewPage = "/WEB-INF/view/member/memberView.jsp";
		
		String mem_id = request.getParameter("mem_id");
		// 아이디가 널이거나 비어있으면 회원목록을 리다이렉트
		if(mem_id == null || mem_id.trim().equals("")) {
			return "redirect:/member/memberList.do";
		}
		
		Member member = memberService.getMember(mem_id);
		request.setAttribute("member", member);
		
		return viewPage;
	}
	
}

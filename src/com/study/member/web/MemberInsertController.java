package com.study.member.web;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.member.service.MemberServiceImpl;
import com.study.member.vo.Member;
import com.study.servlet.IController;

public class MemberInsertController implements IController{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		MemberServiceImpl memberService = new MemberServiceImpl();
		String insertPage = "/WEB-INF/view/member/memberInsert.jsp";
	
		String mem_id = request.getParameter("mem_id");
		String mem_pwd = request.getParameter("mem_pwd");
		String mem_name = request.getParameter("mem_name");
		String mem_phone = request.getParameter("mem_phone");
		String mem_email = request.getParameter("mem_email");
		
		System.out.println(mem_id);
		System.out.println(mem_pwd);
		System.out.println(mem_name);
		System.out.println(mem_phone);
		System.out.println(mem_email);
		// 아이디가 널이거나 비어있으면 회원목록을 리다이렉트
		if(mem_id == null || mem_id.trim().equals("")) {
			return "redirect:/member/memberList.do";
		}
	
		Member member = new Member();
		
	 	member.setMem_id(request.getParameter("mem_id"));
		member.setMem_id(request.getParameter("mem_pwd"));
	 	member.setMem_name(request.getParameter("mem_name"));
	 	member.setMem_phone(request.getParameter("mem_phone"));
	 	member.setMem_email(request.getParameter("mem_email"));
	 	
		int cnt = memberService.modifyMember(member);
		
		if(cnt > 0) {
			
		}else {
			request.setAttribute("message", "회원등록을 실패했습니다.");
		}
	
		return insertPage;
	}
	
}

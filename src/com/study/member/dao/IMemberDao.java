package com.study.member.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.study.member.vo.Member;

public interface IMemberDao {

	//회원목록
	List<Member> getMemberList(Connection conn) throws SQLException;

	//회원상세
	Member getMember(Connection conn, String mem_id) throws SQLException;

	//회원등록
	int insertMember(Connection conn, Member member) throws SQLException;

	//회원수정
	int updateMember(Connection conn, Member member) throws SQLException;

	//회원삭제
	int deleteMember(Connection conn, Member member) throws SQLException;

}
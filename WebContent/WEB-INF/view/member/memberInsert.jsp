<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   		request.setCharacterEncoding("utf-8");
   %>
    <!DOCTYPE html>
    <html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>타이틀을 입력하세요~^^v</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	
	</head>
<body>
<div class="container">
<%
//JDBC 변수 선언
Connection conn = null; // 연결
PreparedStatement pstmt = null; // 구문
ResultSet rs = null;  // select 한 결과를 담는 객체

try{
	// OracleDriver driver = new OracleDriver();
	String driver = "oracle.jdbc.driver.OracleDriver";	//외부설정파일에서 읽기
	Class.forName(driver);
	
	conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe"
							,"java","oracle");
	
	String mem_id = request.getParameter("mem_id");
	String mem_pwd = request.getParameter("mem_pwd");
	String mem_name = request.getParameter("mem_name");
	String mem_phone = request.getParameter("mem_phone");
	String mem_email = request.getParameter("mem_email");
	
	String query =  "INSERT INTO tb_member";
		   query += " 		 (mem_id, mem_pwd,mem_name, mem_phone, mem_email, reg_date)";
		   query += "  VALUES ( ?, ?, ?, ?, ?, SYSDATE)";
	
	System.out.println(query);	
	pstmt = conn.prepareStatement(query); // ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
	int idx = 1;
	pstmt.setString(idx++, mem_id);
	pstmt.setString(idx++, mem_pwd);
	pstmt.setString(idx++, mem_name);
	pstmt.setString(idx++, mem_phone);
	pstmt.setString(idx++, mem_email);
	
	int cnt = pstmt.executeUpdate();
	if(cnt > 0){
	%>
	<div class="row text-center">
		<div class="alert alert-info col-md-4 col-md-offset-4">
		회원가입 성공
	</div>		
	<%	
	}else{
	%>
	<div class="row">
		회원가입 실패
	</div>
	<%
	}
	                                                                                                                           
}catch(ClassNotFoundException ex){ 
	out.println("드라이버가 없거나, 명칭이 틀렸을거야");
}catch(SQLException ex){
	out.println("DB 오류 :" + ex.getMessage());
	ex.printStackTrace();
}finally{
	if(rs != null) try{rs.close();}catch(Exception e){}
	if(pstmt != null) try{pstmt.close();}catch(Exception e){}
	
	//연결세션은 꼭 닫아야 한다.
	if(conn != null)try{conn.close();}catch(Exception e){}
}
%>

<div class="row">
	<div class="col-md-6 col-xs-4">
		<a href="memberList.do" class="btn-sm btn-warning">목록으로</a>
	</div>
</div>

</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error/msgError.jsp</title>
</head>
<body>
메세지 오류가 발생했습니다.<br>
<hr>
에러타입 : <%=exception.getClass().getName() %><br>
에러정보 : <%=exception.getMessage() %>
<%
	application.log("메시지 오류 발생", exception);
%>
</body>
</html>
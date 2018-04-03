<%@page import="java.sql.SQLException"%>
<%@page import="com.study.board.service.BoardServiceImpl"%>
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
<title>게시판 Insert</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>
<body>
<h1>게시판 등록 결과창</h1>
	<div class="container">
		<jsp:useBean id="board" class="com.study.board.vo.Board" />
		<jsp:setProperty property="*" name="board" />
		
		<div class="row text-center">
			<div class="row">
				<div class="col-md-6 col-xs-4">
					<a href="boardList.jsp" class="btn-sm btn-warning">목록으로</a>
				</div>
				<div class="col-md-6">
					<button type="submit" class="btn-sm btn-primary">저장</button>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
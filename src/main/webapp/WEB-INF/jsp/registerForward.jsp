<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フォワードチェック</title>
</head>
<body>
	<h2>送信完了！</h2>
	<p>RegisterForwardServletから正常にフォワードされました</p>
	
	名前：
	<strong><%= request.getParameter("pass") %></strong><br>
	 パスワード：
	<strong><%= request.getParameter("pass") %></strong><br>
</body>
</html>
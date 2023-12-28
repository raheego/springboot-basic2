<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<h2>loginOK</h2>

	<%
		String id = request.getParameter("useId");
		String pwd = request.getParameter("pwd");

		String[] hobbys = request.getParameterValues("hobby");

	%>

	당신의 id : <%= id %>
	당신의 password : <%= pwd %>
	당신의  취미는

	<%
		if( hobbys != null ) {
			for ( int i = 0; i < hobbys.length; i ++ ){
	%>
			<%= hobbys[i] %>
	<%
			} //for end
		} // if end
	%>
</body>
</html>
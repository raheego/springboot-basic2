<%@page import="src.ex03.Emp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<h2>Emp</h2>

	<%
	    Emp e = new Emp();
	    out.print(e);

        e.setEmpno(233);
	    e.setName("손흥민");
        e.setPay(3000);

        out.print(e.toString());
	%>


</body>
</html>
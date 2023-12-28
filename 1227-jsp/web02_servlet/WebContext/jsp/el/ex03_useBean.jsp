<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="com.encore.ex04.Emp"%>

<!-- new로 객체 생성했던 것을 tag로 객체 생성하기......액션태그 - useBean -->
<jsp:useBean id="e" class="com.encore.ex04.Emp"/>
<jsp:setProperty property="name" name="e" value="강감찬" />
<jsp:setProperty property="pay" name="e" value="8888" />
<jsp:setProperty property="empno" name="e" value="8877" />

<h2><%= e %></h2><hr>
<jsp:useBean id="e2" class="com.encore.ex04.Emp"/>   <!-- Point pt2 = new Point(); -->
<jsp:setProperty property="*" name="e2" />

이름: <jsp:getProperty property="name" name="e"/><br />   <!-- getter method call -->
사번: <jsp:getProperty property="empno" name="e"/><br />
급여: <jsp:getProperty property="pay" name="e"/><br /> <hr color="red">


<jsp:useBean id="now" class="java.util.Date" />

<h3><%= now %></h3>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_useBean.jsp</title>
</head>
<body>
<%= e.toString() %> <p>
<%
	e.setName("gildong");
	e.setPay(3000);
	out.print(e);
%>
<h1><%= e.getName() %></h1>
</body>
</html>
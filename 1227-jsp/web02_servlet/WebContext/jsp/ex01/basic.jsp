<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>basic.jsp</title>
</head>
<body>
	<h2>jps basic</h2>
	<div>jsp 아무거나</div>

	<%
		// 스크립릿 - 자바 기본 문법 - 자바코드, 변수선언, 제어문
		String str = "Hello JSP";
		out.print(str);

		int su = 300;
	%>

	<h2>표현식 출력 : </h2>
	<h3><%= str %></h3>
	<h3><%= su %></h3>

	<hr>

	<%!
		//선언문 - 자바 기본 문버버 사용, 함수 선언

		public String show(){
			return "hello jsp@";
		}
	%>

	<!-- 표현식, 호출하기 -->
	<p><%= show %></p>
	<%= "문자열 출력도 가능합니다." %>
	<%= 200 %>
	<h2>20 + su = <%= 20 + su %></h2>

	<hr>
	<%! //선언문 자바 코드 이용

		int sum = 0;
		for( int i = 1; i <= 100; i ++ ) {
			sum += i;
		}
		out.print(sum);
	%>
	<p>sum : <%= sum %></p>

</body>
</html>
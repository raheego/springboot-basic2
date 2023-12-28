<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<h2>login</h2>

	<form action="ex02_loginOK.jsp" method="post">
		<p>ID : <input type="text"  name="userId"> </p>
		<p>PWD : <input type="password"  name="pwd"> </p>
		<div>
		Hobby :
			<br/><input type="checkbox"  name="hobby"  value="baseball"> Baseball
			<br/><input type="checkbox"  name="hobby"  value="soccer"> Soccer
			<br/><input type="checkbox"  name="hobby"  value="basketball"> Basketball
			<br/><input type="submit"  value="로그인">
		</div>
	</form>

</body>
</html>
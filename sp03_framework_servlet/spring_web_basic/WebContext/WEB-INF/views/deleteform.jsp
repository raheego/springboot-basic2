<%--
  Created by IntelliJ IDEA.
  User: awya5
  Date: 2023-12-21
  Time: 오후 5:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Form Page</title>
</head>
<body>
<h3>회사 지점 위치 추가 글쓰기</h3>
<form action="delete.do"  method="post">

    삭제할번호 : <input type="text" name="deptno"> <br />


    <input type="submit" value="삭제"> &nbsp; &nbsp;
    <input type="reset" value="취소"> &nbsp; &nbsp;

    <input type="button" value="List Page"  onclick="location.href='list.do' "> &nbsp;&nbsp;
    <input type="button" value="Write Page"  onclick="location.href='writeform.do' ">

</form>
</body>
</html>

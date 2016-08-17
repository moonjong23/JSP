<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;font-size:80px">에러 발생</h1>
<%=exception.getMessage() %> <!--exception : 내장 객체-->
</body>
</html>
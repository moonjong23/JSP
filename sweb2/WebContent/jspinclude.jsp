<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include연습</title>
</head>
<body>
<%@include file="top.jsp" %> <!--처리과정 : 소스를 가져와서 실행한다-->
<h1>나의 페이지</h1>
<pre>
문서의 본문
..
.
.
.
..
</pre>
 
<div style="color:blue;"> <!--jsp action tag 사용-->
	<jsp:include page="in_action1.jsp"/> <!--처리과정: 실행한 결과를 가져온다.-->
</div>

<div style="color:cyan;">
	<jsp:include page="in_action2.jsp"> 
		<jsp:param value="korea" name="msg"/>
	</jsp:include> 
	<!--parameter를 넘길 수도 있다. include문 안에 주석 값 들어가면 오류가 나네...-->
</div>
<%@include file="bottom.jsp" %>
</body>
</html>
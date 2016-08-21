<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
안녕 나는 jsp 문서야
<br>
<%   //scriptlet : 자유롭게 자바의 코드를 기술하는 곳 
String ir = "홍길동";   //지역변수: jsp라는 메소드안에 선언됐기 때문에
out.println(ir + "의 홈페이지!");   //out : 클라이언트에 자료를 내보내는 내장객체(JSP의 9개의 내장객체중 하나)
for(int i=1; i < 7; i++){
   out.print("<h" + i + ">" + "자바를 이용한 태그처리" + "</h" + i + ">" );
}
out.println("자료 출력");
%>
<br>
<%="자료 출력(표현식)" %> <!-- 출력용 태그(out.print와 똑같음)  -->
<%out.println("자료출력"); %>
<br>
<%= new java.util.Date() %>
<br>
<%
int a = 0, sum = 0;
do{
   a++;
   sum +=a;
}while(a < 10);
%>
<%="10까지의 합: " + sum %>
<br>
<%= ir + "님의 전화번호는 " + tel %>
<%! String tel = "111-1234"; //선언 : 클래스의 멤버필드(전역 변수), *(jsp는 전체가 서비스메소드이다)%>

<br>
<%!
public int add(int m, int n){   //멤버 메소드
   return m + n;
}
%>
<%=add(100,200) %>
</body>
</html>
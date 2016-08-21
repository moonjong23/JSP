<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String msg= request.getParameter("msg");
%>
머리 아프다.<br>
<%="넘어온 값은 " + msg %>

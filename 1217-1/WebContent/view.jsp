<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="user" value="${userinfo}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
	<h1 class="text-center">${user.name}님의 정보</h1>
	<ul>
		<li>ID : ${user.userid}</li>
		<li>Age : ${user.age }</li>
		<li>Gender : ${user["gender"]}</li>
		<li>City : ${user["city"]}</li>
	</ul>
</body>
</html>
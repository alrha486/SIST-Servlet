<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
	<div class="text-center"><img src="images/membership.jpg" /></div>
	<h1 class="text-center">Member List</h1>
	<h3 class="text-center">[<a href="join.do">Join</a>]</h3>
	<div class="container">
		<div class="row">
		<table class="table table-hover col-lg-6">
			<thead>
				<tr>
					<th>ID</th><th>Name</th><th>Age</th><th>Gender</th><th>City</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="member">
					<tr>
						<td><a href="view.do?userid=${member.userid}">${member.userid}</a></td><td>${member.name}</td>
						<td>${member.age}</td><td>${member.gender}</td>
						<td>${member.city }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>
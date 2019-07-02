<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<h1>메인페이지</h1>
	
	<p>${message }</p>
	
	<h3>검색어 순위</h3>
	
	<ol>
		<c:forEach var="keyword" items="${rankings }">
			<li>${keyword }</li>
		</c:forEach>
	</ol>
</body>
</html>
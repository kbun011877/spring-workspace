<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>Bootstrap Example</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="../common/nav.jsp" %>
	<div class="container">
		<div class="page-header">
			<h1>자유게시판</h1>
		</div>
		<div class="table-responsive">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>생성일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>abc</td>
						<td>xx</td>
						<td>2019.07.05</td>
					</tr>
					<tr>
						<td>2</td>
						<td>def</td>
						<td>xx</td>
						<td>2019.07.05</td>
					</tr>
					<tr>
						<td>3</td>
						<td>gh</td>
						<td>xx</td>
						<td>2019.07.05</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
</body>
</html>
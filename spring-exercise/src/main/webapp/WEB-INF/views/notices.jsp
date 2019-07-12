<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="common/nav.jsp" %>
<div class="container">
	<div class="page-header">
		<h1>공지사항</h1>
	</div>
	<div class="row">
		<div class="col-sm-12">
			<table class="table" id="notice-table">
				<colgroup>
					<col width="7%">
					<col width="*">
					<col width="10%">
				</colgroup>
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>등록일</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="notice" items="${notices }">
				
					<tr>
						<td>${notice.no }</td>
						<td>${notice.title }</td>
						<td><fmt:formatDate value="${notice.createDate }"/> </td>
					</tr>
					<tr>
						<td></td>
						<td>
						${notice.contents }
						</td>
						<td></td>
					</tr>
				</c:forEach>
					
				</tbody>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function() {
		$("#notice-table tbody tr:odd").hide();
		
		// 제목행을 클릭하면 그 아래의 내용행이 표시되도록 합니다.
		// 제목행을 다시 클릭하면  내용행이 사라집니다.
	})
	
	$("#notice-table tbody tr:even").click(function(event) {
		$(this).next().toggle();
	})
	
</script>
</body>
</html>
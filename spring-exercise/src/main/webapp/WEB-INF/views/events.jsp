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
<c:set var="current" value="event"/>
<%@ include file="common/nav.jsp" %>
<div class="container">
	<div class="page-header">
		<h1>이벤트 목록</h1>
	</div>
	
	<div class="row">
		<div class="col-sm-12">
			<table class="table" id="event-table">
				<colgroup>
					<col width="7%">
					<col width="*">
					<col width="10%">
					<col width="10%">
				</colgroup>
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>등록일</th>
						<th>상태</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="event" items="${events }">
					<tr>
						<td>${event.no }</td>
						<td>${event.title }</td>
						<td><fmt:formatDate value="${event.createDate }"/> </td>
						<td>
						<c:choose>
							<c:when test="${event.active eq 'Y' }">
								<span class="label label-success">진행중</span>
							</c:when>
							<c:otherwise>
								<span class="label label-default">종료</span>
							</c:otherwise>
						</c:choose>
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2">${event.contents }</td>
						<td></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<script>
	$(function() {
		$("#event-table tbody tr:odd").hide();
		
		$("#event-table tbody tr").click(function() {
			if ($(this).prev().hasClass('active')) {
				return false;
			}
			
			if ($(this).hasClass('active')) {
				$(this).removeClass('active')
				       .next().hide();
			} else {
				$(this).addClass('active')
					   .next().show();
			}
		});
	})
</script>
</body>
</html>
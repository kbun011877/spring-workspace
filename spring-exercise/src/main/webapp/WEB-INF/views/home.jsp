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
<c:set var="current" value="home"/>
<%@ include file="common/nav.jsp"%>
<div class="container">
	<div class="page-header">
		<h1>홈 페이지</h1>
	</div>

	<div class="row">
		<div class="col-sm-6">
			<h4>
				진행중인 이벤트 <a href="events.do" class="btn btn-default btn-xs pull-right">더보기</a>
			</h4>
			<table class="table">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>등록일</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="event" items="${events }">
					<tr>
						<td>${event.no }</td>
						<td>${event.title }</td>
						<td><fmt:formatDate value="${event.createDate }" /> </td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-sm-6">
			<h4>
				공지사항 <a href="notices.do" class="btn btn-default btn-xs pull-right">더보기</a>
			</h4>
			<table class="table">
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
						<td><fmt:formatDate value="${notice.createDate }" /> </td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<div class="row">
		<div class="col-sm-12">
			<div class="panel panel-default">
				<div class="panel-heading">신규 상품</div>
				<div class="panel-body">
					<div class="row">
					<c:forEach var="product" items="${homeProductItems.newProducts }">
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="detail.do"> 
									<img src="resources/images/${product.imgName }" style="width: 100%">
								</a>
								<div class="caption">
									<h4>${product.name }</h4>
									<p><fmt:formatNumber value="${product.price }"/> 원</p>
									<c:if test="${not empty LOGIN_USER}">
										<c:choose>
											<c:when test="${product.soldOut eq 'N' }">
												<div class="text-center"><a href="addcart.do?no=${product.no }" class="btn btn-primary">담기</a></div>
											</c:when>
											<c:otherwise>
												<div class="text-center"><a href="#" class="btn btn-primary disabled" >담기</a></div>
											</c:otherwise>
										</c:choose>
									</c:if>
								</div>
							</div>
						</div>
					</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="row">
		<div class="col-sm-12">
			<div class="panel panel-default">
				<div class="panel-heading">추천 상품</div>
				<div class="panel-body">
					<div class="row">
					<c:forEach var="product" items="${homeProductItems.recommendProducts }">
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="detail.do"> 
									<img src="resources/images/${product.imgName }" style="width: 100%">
								</a>
								<div class="caption">
									<h4>${product.name }</h4>
									<p><fmt:formatNumber value="${product.price }"/> 원</p>
									<c:if test="${not empty LOGIN_USER}">
										<c:choose>
											<c:when test="${product.soldOut eq 'N' }">
												<div class="text-center"><a href="addcart.do?no=${product.no }" class="btn btn-primary">담기</a></div>
											</c:when>
											<c:otherwise>
												<div class="text-center"><a href="#" class="btn btn-primary disabled" >담기</a></div>
											</c:otherwise>
										</c:choose>
									</c:if>
								</div>
							</div>
						</div>
					</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
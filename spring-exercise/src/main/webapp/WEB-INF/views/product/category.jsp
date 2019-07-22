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
<c:set var="current" value="category"/>
<%@ include file="../common/nav.jsp" %>
<div class="container">
	<div class="page-header">
		<h1>카테고리별 상품</h1>
	</div>
	
	<div class="row">
		<div class="col-sm-3">
			<div class="panel panel-default">
				<div class="panel-heading">
					카테고리
				</div>
				<ul class="nav nav-pills nav-stacked">
					<li class="${empty param.keyword or keyword eq 'NEW' ? 'active' : '' }"><a href="category.do?opt=type&keyword=NEW">신상품</a></li>
					<li class="${param.keyword eq 'RECOMMEND' ? 'active' : '' }"><a href="category.do?opt=type&keyword=RECOMMEND">추천상품</a></li>
					<c:forEach var="category" items="${categories }">
						<li class="${param.keyword eq category.id ? 'active' : '' }"><a href="category.do?opt=category&keyword=${category.id }">${category.name }</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="col-sm-9">
			<div class="row">
			<c:forEach var="product" items="${products }">
				<div class="col-md-4">
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
</body>
</html>
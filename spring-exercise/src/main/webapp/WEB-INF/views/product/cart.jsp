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
    <style>
    	.table td {
    		vertical-align: middle !important;
    	}
    </style>
</head>
<body>
<%@ include file="../common/nav.jsp" %>
<div class="container">
  	<div class="page-header">
  		<h1>장바구니</h1>
  	</div>
  	
  	<div class="row">
  		<div class="col-sm-12">
  			<div class="panel panel-default">
  				<div class="panel-heading">
  					홍길동님의 장바구니 목록입니다.
  				</div>
  				<div class="panel-body">
  					<table class="table">
  						<thead>
  							<tr>
  								<th></th>
  								<th>상품명</th>
  								<th>가격</th>
  								<th>등록일</th>
  								<th></th>
  							</tr>
  						</thead>
  						<tbody>
  							<tr>
  								<td>
  									<img src="resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
  								</td>
  								<td>맥심 커피 믹스</td>
  								<td>5,400원</td>
  								<td>2019-02-10</td>
  								<td><a href="" class="btn btn-danger btn-sm">삭제</a></td>
  							</tr>
  							<tr>
  								<td>
  									<img src="resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
  								</td>
  								<td>맥심 커피 믹스</td>
  								<td>5,400원</td>
  								<td>2019-02-10</td>
  								<td><a href="" class="btn btn-danger btn-sm">삭제</a></td>
  							</tr>
  							<tr>
  								<td>
  									<img src="resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
  								</td>
  								<td>맥심 커피 믹스</td>
  								<td>5,400원</td>
  								<td>2019-02-10</td>
  								<td><a href="" class="btn btn-danger btn-sm">삭제</a></td>
  							</tr>
  						</tbody>
  					</table>
  				</div>
  			</div>
  		</div>
  	</div>
</div>
</body>
</html>
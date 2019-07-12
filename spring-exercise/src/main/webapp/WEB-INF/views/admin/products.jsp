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
		<h1>상품관리 <button class="btn btn-default pull-right" id="btn-open-modal">등록</button></h1>
	</div>
	
	<div class="row">
		<div class="col-sm-12">
			<table class="table">
				<thead>
					<tr>
						<th></th>
						<th>카테고리</th>
						<th>상품명</th>
						<th>가격</th>
						<th>등록일</th>
						<th>절판여부</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<img src="/resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
						</td>
						<td>식료품</td>
						<td>맥심 커피 믹스</td>
						<td>5,400원</td>
						<td>2019-02-10</td>
						<td>
							<span class="label label-success">판매중</span>
							<span class="label label-default">절판</span>
						</td>
						<td><a href="" class="btn btn-danger btn-sm">판매중지</a></td>
					</tr>
					<tr>
						<td>
							<img src="/resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
						</td>
						<td>식료품</td>
						<td>맥심 커피 믹스</td>
						<td>5,400원</td>
						<td>2019-02-10</td>
						<td>
							<span class="label label-success">판매중</span>
							<span class="label label-default">절판</span>
						</td>
						<td><a href="" class="btn btn-danger btn-sm">판매중지</a></td>
					</tr>
					<tr>
						<td>
							<img src="/resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
						</td>
						<td>식료품</td>
						<td>맥심 커피 믹스</td>
						<td>5,400원</td>
						<td>2019-02-10</td>
						<td>
							<span class="label label-success">판매중</span>
							<span class="label label-default">절판</span>
						</td>
						<td><a href="" class="btn btn-danger btn-sm">판매중지</a></td>
					</tr>
					<tr>
						<td>
							<img src="/resources/images/coffee.jpg" alt="Nature" style="width: 120px; height:100px">
						</td>
						<td>식료품</td>
						<td>맥심 커피 믹스</td>
						<td>5,400원</td>
						<td>2019-02-10</td>
						<td>
							<span class="label label-success">판매중</span>
							<span class="label label-default">절판</span>
						</td>
						<td><a href="" class="btn btn-danger btn-sm">판매중지</a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
	<div id="product-form-modal" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">신규 상품 등록</h4>
				</div>
				<div class="modal-body">
					<form class="well" method="post" action="">
						<div class="form-group">
							<label>카테고리</label>
							<select class="form-control" name="category">
								<option value=""> 선택하세요</option>
								<option value="FOOD"> 식료품</option>
							</select>
						</div>
						<div class="form-group">
							<label>상품명</label>
							<input type="text" class="form-control" name="name"/>
						</div>
						<div class="form-group">
							<label>상품가격</label>
							<input type="number" class="form-control" name="price" value="0"/>
						</div>
						<div class="form-group">
							<label>상품구분</label>
							<div class="radio">
								<label><input type="radio" name="type" value="NEW" checked="checked"> 신규상품</label>
								<label><input type="radio" name="type" value="RECOMMEND"> 추천상품</label>
							</div>
						</div>
						<div class="form-group">
							<label>상품설명</label>
							<textarea rows="3" class="form-control" name="summary"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="btn-add-event">등록</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
				</div>
			</div>

		</div>
	</div>
</div>
<script type="text/javascript">
	$(function() {
		$("#btn-open-modal").click(function() {
			$("#product-form-modal").modal('show');
		});
	})
</script>
</body>
</html>
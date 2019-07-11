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
						<tr>
							<td>1</td>
							<td>이벤트 테스트입니다.</td>
							<td>2019.07.01</td>
						</tr>
						<tr>
							<td>1</td>
							<td>이벤트 테스트입니다.</td>
							<td>2019.07.01</td>
						</tr>
						<tr>
							<td>1</td>
							<td>이벤트 테스트입니다.</td>
							<td>2019.07.01</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-sm-6">
				<h4>
					공지사항 <a href="events.do" class="btn btn-default btn-xs pull-right">더보기</a>
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
						<tr>
							<td>1</td>
							<td>공지사항 테스트입니다.</td>
							<td>2019.07.01</td>
						</tr>
						<tr>
							<td>1</td>
							<td>공지사항 테스트입니다.</td>
							<td>2019.07.01</td>
						</tr>
						<tr>
							<td>1</td>
							<td>공지사항 테스트입니다.</td>
							<td>2019.07.01</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading">추천상품</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading">추천상품</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="detail.do"> 
										<img src="resources/images/coffee.jpg" alt="Nature" style="width: 100%">
									</a>
									<div class="caption">
										<h4>맥심 커피</h4>
										<p>5,000원</p>
										<div class="text-center"><a href="" class="btn btn-primary">담기</a></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
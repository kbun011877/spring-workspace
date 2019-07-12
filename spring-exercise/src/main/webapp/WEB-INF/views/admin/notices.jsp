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
<%@ include file="../common/nav.jsp" %>
<div class="container">
	<div class="page-header">
		<h1>공지사항 관리 <button class="btn btn-default pull-right" id="btn-open-modal">등록</button></h1>
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
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>직원을 모집합니다.</td>
						<td>2019-01-01</td>
						<td>
							<button class="btn btn-danger btn-xs">삭제</button>
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2">
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
						</td>
						<td></td>
					</tr>
					<tr>
						<td>1</td>
						<td>직원을 모집합니다.</td>
						<td>2019-01-01</td>
						<td>
							<button class="btn btn-danger btn-xs">삭제</button>
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2">
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
						</td>
						<td></td>
					</tr>
					<tr>
						<td>1</td>
						<td>직원을 모집합니다.</td>
						<td>2019-01-01</td>
						<td>
							<button class="btn btn-danger btn-xs">삭제</button>
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2">
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
						</td>
						<td></td>
					</tr>
					<tr>
						<td>1</td>
						<td>직원을 모집합니다.</td>
						<td>2019-01-01</td>
						<td>
							<button class="btn btn-danger btn-xs">삭제</button>
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2">
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
							이렇게 세계 곳곳에서 이상 현상이 나타나고 있는데, 현상은 달라도 이유는 하나였습니다. 온난화 때문입니다. 우리나라도 영향을 받을 것으로 보입니다.
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
	<div id="notice-form-modal" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">신규 공지사항 등록</h4>
				</div>
				<div class="modal-body">
					<form class="well" method="post" action="">
						<div class="form-group">
							<label>제목</label>
							<input type="text" class="form-control" name="title" />
						</div>
						<div class="form-group">
							<label>공지 내용</label>
							<textarea rows="3" class="form-control" name="conents"></textarea>
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
			$("#notice-form-modal").modal('show');
		});
	})
</script>
</body>
</html>
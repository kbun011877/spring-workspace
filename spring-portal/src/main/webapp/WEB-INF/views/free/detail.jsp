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

	<div class="container">
		<div class="page-header">
			<h1>게시글 상세보기</h1>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<table class="table">
					<tbody>
						<tr>
							<th>번호</th>
							<td>${board.no }</td>
							<th>제목</th>
							<td>${board.title }</td>
						</tr>
						<tr>
							<th>작성자</th>
							<td>${board.writer }</td>
							<th>작성일</th>
							<td>${board.createDate }</td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="3">${board.contents }</td>
						</tr>
						<tr>
							<th>첨부파일</th>
							<td>${board.filename1 } ${board.filename2 } ${board.filename3 }</td>
						</tr>
						
					</tbody>
				</table>
			</div>	
		</div>
		
		<div class="text-right">
			<a href="list.do" class="btn btn-default">목록</a>
		</div>
		
		<div class="row">
			<div class="col-sm-12" style="margin-top: 20px;" >
				<form method="post" action="addcomment.do">
				<input type="hidden" name="no" value="${board.no }" />
					<div class="form-group">
						<textarea rows="4" class="form-control" name="contents"></textarea>
					</div>
					<div class="text-right">
						<button type="button" id="btn-add-comment" class="btn btn-default btn-sm">등록</button>
					</div>
				</form>
			</div>
		</div>
		
		<div id="comments-box" class="row" style="margin-top: 20px">
			<c:forEach var="comment" items="${comments }">
				<div class="col-sm-12">
					<p>${comment.contents }</p>
					<p class="text-right"><span class='label label-info'>${comment.writer }</span></p>
				</div>
			</c:forEach>
		</div>
		
		<div id="user-detail-modal" class="modal fade" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">작성자 상세 정보</h4>
					</div>
					<div class="modal-body">
						<table class="table">
							<tbody>
								<tr>
									<th>이름</th><td id="name-cell"></td>
									<th>아이디</th><td id="id-cell"></td>
								</tr>
								<tr>
									<th>연락처</th><td id="phone-cell"></td>
									<th>이메일</th><td id="email-cell"></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">창 닫기</button>
					</div>
				</div>
			</div>
		</div>

	</div>
	<script type="text/javascript">
		$(function() {
			$("#btn-add-comment").click(function() {
				
				var contents = $("[name=contents]").val();
				if(contents == '') {
					alert("내용을 입력하세요");
					return false;
				}
				
				$.ajax({
					type:"GET",
					url:"addcomment.do",
					data:{no:$("[name=no]").val(), contents:contents},
					dataType:"json",
					success:function(result) {
						$("#comments-box").empty();
						
						$.each(result, function(index, item) {
							var html = "<div class='col-sm-12'>";
								html +="<p>"+item.contents+"</p>";
								html +="<p class='text-right'><span class='label label-info'>"+item.writer+"</span></p>";
								html +="</div>";
								html +="<hr />";
								
								$("#comments-box").append(html);
								
						});
					}
				})
			})

			$("#comments-box").on('click', '.label', function() {
				
				$.ajax({
					type:"GET",
					url:"../user/getUser.do",
					data:{name:$(this).text()},
					dataType:"json",
					success:function(result) {
						
						var user = result[0];
						
						$("#name-cell").text(user.name);
						$("#id-cell").text(user.id);
						$("#phone-cell").text(user.phone);
						$("#email-cell").text(user.email);
						
						$("#user-detail-modal").modal('show');
					}
				});
				
			})
		})
	</script>
</body>
</html>
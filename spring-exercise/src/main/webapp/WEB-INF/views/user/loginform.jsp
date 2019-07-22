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
<c:set var="current" value="loginform"/>
<%@ include file="../common/nav.jsp" %>
<div class="container">
	<div class="page-header">
		<h1>회원가입</h1>
	</div>
	
	<c:if test="${param.fail eq 'invalid' }">
		<div class="alert alert-danger">
			<strong>로그인 실패</strong>
			아이디 혹은 비밀번호가 올바르지 않습니다.
		</div>
	</c:if>
	<c:if test="${param.fail eq 'deny' }">
		<div class="alert alert-danger">
			<strong>로그인 필요</strong>
			요청한 서비스는 로그인 후 사용가능한 서비스 입니다.
		</div>
	</c:if>
	
	<div class="row">
		<div class="col-sm-12">
			<form class="well" method="post" action="login.do">
				<div class="form-group">
					<label>아이디</label>
					<input type="text" class="form-control" name="id" />
				</div>
				<div class="form-group">
					<label>비밀번호</label>
					<input type="text" class="form-control" name="password" />
				</div>
				<div class="text-right">
					<button type="submit" class="btn btn-primary">로그인</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직종 상세정보</h1>
	
	<div>
		<p>직종아이디:<strong>${job.id }</strong></p>
		<p>직종제목:<strong>${job.title }</strong></p>
		<p>최소급여:<strong>${job.minSalary }</strong></p>
		<p>최대급여:<strong>${job.maxSalary }</strong></p>
	</div>
	
</body>
</html>
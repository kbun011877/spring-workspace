<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="/home.do">마켓</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="${current eq 'home' ? 'active' : '' }"><a href="/home.do">홈</a></li>
			<li class="${current eq 'category' ? 'active' : '' }"><a href="/category.do">카테고리</a></li>
			<c:if test="${not empty LOGIN_USER }">
				<li class="${current eq 'cart' ? 'active' : '' }"><a href="/cart.do">장바구니</a></li>
			</c:if>
			<li class="${current eq 'event' ? 'active' : '' }"><a href="/events.do">이벤트</a></li>
			<li class="${current eq 'notice' ? 'active' : '' }"><a href="/notices.do">공지사항</a></li>
		</ul>
		<c:if test="${not empty LOGIN_USER and LOGIN_USER.id eq 'admin' }">
			<ul class="nav navbar-nav">
				<li class="dropdown ${current eq 'admin' ? 'active' : '' }">
	        		<a class="dropdown-toggle" data-toggle="dropdown" href="#">관리자 <span class="caret"></span></a>
	        		<ul class="dropdown-menu">
	          			<li><a href="/admin/events.do">이벤트 관리</a></li>
	          			<li><a href="/admin/notices.do">공지사항 관리</a></li>
	          			<li><a href="/admin/products.do">상품관리</a></li>
	        		</ul>
	      		</li>
			</ul>
		</c:if>
		
		<c:choose>
			<c:when test="${empty LOGIN_USER }">
				<ul class="nav navbar-nav navbar-right">
					<li class="${current eq 'loginform' ? 'active' : '' }"><a href="/loginform.do">로그인</a></li>
					<li class="${current eq 'registerform' ? 'active' : '' }"><a href="/registerform.do">회원가입</a></li>
				</ul>
			</c:when>
			<c:otherwise>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="/logout.do">로그아웃</a></li>
				</ul>
				<p class="navbar-text navbar-right"><strong>${LOGIN_USER.name }</strong>님 환영합니다.</p>
			</c:otherwise>
		</c:choose>
	</div>
</nav>
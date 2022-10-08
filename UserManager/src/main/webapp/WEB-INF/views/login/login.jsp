<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="../common/header.jsp" />

<script src="${pageContext.request.contextPath}/resources/js/login.js"></script>

<section class="login-area container">
	<section class="row h-100 p-5">
		<section class="login-form col-md-12">
			<h1 class="font-weight-bold mt-4 mb-5 pt-5">로그인</h1>
			
			<article class="user-form login-form">
				<input type="text" class="form-control" name="userId" placeholder="아이디" data-input-type="user-id" />
				<span class="error-message text-danger" data-message-for="user-id"></span>
				<div class="pb-3"></div>
				<input type="password" class="form-control" name="password" placeholder="비밀번호" data-input-type="password" />
				<span class="error-message text-danger" data-message-for="password"></span>
				<div class="pb-3"></div>
				<button type="button" class="btn btn-primary">Login</button>
				<button type="button" class="btn btn-warning float-right ml-1" data-forget-type="password">PW 찾기</button>
				<button type="button" class="btn btn-warning float-right ml-1" data-forget-type="id">ID 찾기</button>
			</article>
		</section>
	</section>
</section>

<jsp:include page="../common/footer.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="./header.jsp" />

<script src="${pageContext.request.contextPath}/resources/js/home.js"></script>

<section class="content-about-area container-fluid p-5">
	<section class="row h-100 p-5">
		<article class="col-md-6 pl-5 pr-5">
			<h1 class="font-weight-bold mt-4 mb-5 pt-5">회원관리 프로젝트 개요</h1>
			<div class="font-weight-light h4">
				<br/>
				<span class="text-primary font-weight-bold">회원관리 프로젝트(v0.0.1)</span>은
				범용적으로 사용할 수 있는<br/>회원관리 모듈을 개발하기 위한 프로토타입이다.
				<br/>
				<br/>
				프로토타입 작성을 통해 실무에서 사용할 수 있는 수준의<br/>회원관리 모듈로 확장해 나갈 예정이다.
				<br/>
				<br/>
				<br/>
				<div class="text-right font-weight-bolder">
					By In mook, Jeong
				</div>
			</div>
		</article>
		
		<article class="col-md-6 text-center">
			<img src="${pageContext.request.contextPath}/resources/images/default_image.jpg">
		</article>
	</section>
</section>

<jsp:include page="./footer.jsp" />
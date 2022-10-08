<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="../common/header.jsp" />

<script src="${pageContext.request.contextPath}/resources/js/login.js"></script>

<section class="login-area container">
	<section class="row h-100 p-5">
		<section class="terms-of-use-form col-md-6">
			<h1 class="font-weight-bold mt-4 mb-5 pt-5">회원가입</h1>
			
			<article class="terms-of-use">
				<h4>개인정보 제공 동의</h4>
				<textarea rows="" cols="">개인정보 제공 동의 내용을 작성합니다.</textarea>
			</article>
			
			<article class="terms-of-use">
				<h4>사이트 이용 약관</h4>
				<textarea rows="" cols="">사이트 이용 약관 내용을 작성합니다.</textarea>
			</article>
		</section>
		
		<section class="join-form col-md-6">
			<input type="text" class="form-control" name="userId" placeholder="(필수) 아이디를 입력하세요." />
			<input type="password" class="form-control" name="password" placeholder="(필수) 비밀번호를 입력하세요." />
			<input type="password" class="form-control" name="re-password" placeholder="(필수) 비밀번호를 다시 입력하세요." />
			<input type="radio" class="form-control" name="sex" value="m" /> 남자
			<input type="radio" class="form-control" name="sex" value="w" /> 여자
			<input type="text" class="form-control" name="phone" placeholder="(필수) 휴대전봐 번호를 입력하세요." />
			<input type="email" class="form-control" name="email" placeholder="(필수) 이메일을 입력하세요." />
			<input type="text" class="form-control" name="birth" placeholder="(필수) 생년월일을 입력하세요." />
			<input type="text" class="form-control" name="address" placeholder="(필수) 주소를 입력하세요." />
			
			<div class="btn btn-group">
				<button>가입</button>
				<button>홈으로</button>
			</div>
		</section>
	</section>
</section>

<jsp:include page="../common/footer.jsp" />
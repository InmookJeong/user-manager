<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
	<meta charset="UTF-8">
	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

	<header class="container-fluid border-bottom pt-2 pb-2 h-3-poring-5-rem">
		<section class="row">
			<section class="col-md-2 align-self-center font-weight-bold font-size-1-point-5-rem text-center">
				MOOK-USER
			</section>
			
			<section class="col-md-8">
				<button class="btn btn-secondary" data-btn-type="about">About</button>
				<button class="btn btn-secondary" data-btn-type="my-page">My Page</button>
				<button class="btn btn-secondary" data-btn-type="admin">관리자</button>
			</section>
			
			<section class="col-md-2 align-self-end">
				<button class="btn btn-success btn-sm">로그인</button>
				<button class="btn btn-success btn-sm">회원가입</button>
			</section>
		</section>
	</header>
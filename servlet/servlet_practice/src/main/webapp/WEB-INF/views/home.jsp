<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container-fluid p-5 bg-primary text-white text-center">
	<h1>연습 메인화면</h1>
	<p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container mt-5">
	<div class="row">
		<div class="col-sm-4">
			<h3>Column 3</h3>        
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
			<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
		</div>
	</div>
</div>
</body>
</html>
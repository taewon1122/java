<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container">
	<h1>게시글 상세</h1>
	<c:choose>
		<c:when test="${board != null }">
			<div class="mb-3 mt-3">
				<label class="form-label">게시판:</label>
				<input type="text" class="form-control" readonly="readonly" value="${board.community.co_name}">	
			</div>
			<div class="mb-3 mt-3">
				<label class="form-label">제목:</label>
				<input type="text" class="form-control" readonly="readonly" value="${board.bo_title}">
			</div>
			<div class="mb-3 mt-3">
				<label class="form-label">작성자:</label>
				<input type="text" class="form-control" readonly="readonly" value="${board.bo_me_id}">
			</div>
			<div class="mb-3 mt-3">
				<label class="form-label">조회수:</label>
				<input type="text" class="form-control" readonly="readonly" value="${board.bo_view}">
			</div>
			<div class="mb-3 mt-3">
				<label class="form-label">내용:</label>
				<textarea rows="10" class="form-control" readonly="readonly">"${board.bo_content}"</textarea>
			</div>
			<button type="submit" class="btn btn-outline-success col-12">게시글 등록</button>
		</c:when>
		<c:otherwise>
			<h1>없는 게시글이거나 삭제된 게시글입니다.</h1>
		</c:otherwise>
	</c:choose>
	<a href="<c:url value="/board/list"/>" class="btn btn-outline-primary">목록으로</a>
	<c:if test="${user.me_id == board.bo_me_id}">
		<a href="<c:url value="/board/delete?num=${board.bo_num}"/>" class="btn btn-outline-primary">삭제</a>
		<a href="<c:url value="/board/update?num=${board.bo_num}"/>" class="btn btn-outline-primary">수정</a>
	</c:if>	
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"/>
<div class="container">
	<form action="<c:url value="/board/insert"/>" method="post" enctype="multipart/form-data">
		<h1>게시글 등록</h1>
		<div class="mb-3 mt-3">
			<label for="community" class="form-label">게시판:</label>
			<select class="form-control" name="community" id="community">
				<c:forEach items="${list}" var="community">
					<option value="${community.co_num}">${community.co_name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="mb-3 mt-3">
			<label for="title" class="form-label">제목:</label>
			<input type="text" class="form-control" id="title" placeholder="제목" name="title">
		</div>
		<div class="mb-3 mt-3">
   			<label for="writer" class="form-label">작성자:</label>
   			<input type="text" class="form-control" id="writer" name="writer" value="${user.me_id}">
 		</div>
		<div class="mb-3 mt-3">
			<label for="content" class="form-label">내용:</label>
			<textarea class="form-control" id="content" name="content"></textarea>
		</div>
		<div class="mb-3 mt-3">
			<label for="content" class="form-label">첨부파일:</label>
			<input type="file" name="file" class="form-control">
			<input type="file" name="file" class="form-control">
			<input type="file" name="file" class="form-control">
		</div>
		<button class="btn btn-outline-success col-12">게시글 등록</button>
	</form>
</div>
<script type="text/javascript">
$('#content').summernote({
	placeholder:'내용',
	tabsize: 2,
	height: 400,
});
</script>
</body>
</html>
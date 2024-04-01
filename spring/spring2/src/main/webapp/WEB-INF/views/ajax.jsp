<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
	<title>ajax</title>
	<script src="//code.jquery.com/jquery-3.7.1.js"></script>
</head>
<body>
	<button class="btn1">json - json</button>
	<br>
	<button class="btn2">object - json</button>
	<br>
	<!--
	화면에서 이름과 나이를 입력받아 서버에 ajax로 전송하고,
	서버에서는 화면에서 보내준 이름과 나이를 콘솔에 출력하고,
	화면에 result값으로 "성공"을 전송.
	화면에서는 서버에서 보낸 result를 alert으로 출력
	1. 화면 구성
	2. 이벤트 등록
	3. 이벤트에서 ajax로 통신
		- 화면에 입력된 정보를 가져옴
		- ajax로 서버에 전송
		- 서버에서는 화면에서 보낸 정보를 받아서 콘솔에 출력
		- 서버에서 화면에 데이터를 전송
		- 화면에서는 서버에서 보낸 데이터를 alert으로 출력
	 -->
	<input type="text" name="name" placeholder="이름을 입력하세요.">
	<br>
	<input type="text" name="age" placeholder="나이를 입력하세요.">
	<br>
	<button type="button" class="btn3">전송</button>
	
	<script type="text/javascript">
		$(".btn1").click(function(){
			let name = "";
			//작업1
			$.ajax({
				//동기는 작업1이 다 끝날때까지 기다린 후 작업2가 실행
				//비동기는 작업1이 실행된 후, 끝날때까지 기다리지 않고 작업2가 실행
				async : true, //생략하면 true(비동기)
				url : '<c:url value="/ajax/json/json"/>', 
				type : 'post',
				data : JSON.stringify(obj), //객체를 json형태의 문자열로 변환 <-> JSON.parse
				//서버로 보내는 데이터의 타입. 위에 있는 data의 타입
				contentType : "application/json; charset=utf-8",
				//서버에서 화면으로 보내는 데이터의 타입. 아래에 있는 success의 data의 타입
				dataType : "json", 
				success : function (data){
					//서버에서 보낸 name과 회원 id, pw을 콘솔창에 출력하는 코드
					console.log(data.member.id);
					console.log(data.member.pw);
					console.log(data.name);
					$(this) //2번
					//1번 this와 2번 this는 같다?(x)
					//clickTest1의 return을 불러오지만					
					return data.name;
				}, 
				error : function(jqXHR, textStatus, errorThrown){

				}
			});
			//작업2
		});	
	</script>
	
	<script type="text/javascript">
		$(".btn2").click(function(){
			let obj = {
				id : "abc",
				name : "홍길동"
			}
			
			$.ajax({
				async : true,
				url : '<c:url value="/ajax/object/json"/>', 
				type : 'get', 
				data : obj, 
				dataType : "json", 
				success : function (data){
					console.log(data.age);
				}, 
				error : function(jqXHR, textStatus, errorThrown){

				}
			});
		});
	
	</script>

	<script type="text/javascript">
		$(".btn3").click(function(){
			let name = $("[name=name]").val();
			let age = $("[name=age]").val();
			let obj ={
					name, //name : name,
					age	//age : age
			}
			//vo가 따로 없기때문에 object -> json이 편리하다
			$.ajax({
				async : true,
				url : '<c:url value="/ajax/object/json2"/>', 
				type : 'get', 
				data : obj, 
				dataType : "json", 
				success : function (data){
					alert(data.result);
				}, 
				error : function(jqXHR, textStatus, errorThrown){

				}
			});
		})
		
	</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Include 디렉티브 태그를 head 위에 적용시 link가 제대로 작동이 안되는 이슈 확인. -->

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.6.2.min.js"></script>
<script type = "text/javascript" src="${pageContext.request.contextPath}/resources/js/main.js" defer></script>

<meta charset="UTF-8">
<title>DJMAX Achive-Site</title>
<link href="${pageContext.request.contextPath}/resources/css/Navbar.css" rel="stylesheet">
<link rel="icon" type="image/jpg" href="${pageContext.request.contextPath}/resources/Image/Favicon.jpg">
</head>
<body>

<%@ include file="./Navbar/Navbar.jsp"%>

<section id = "Content">
	<div class = "Content__Container">
	<!-- 클릭시 특정 변수 값을 변경 한 후 그 값을 가지고 온다. -->
	<% String Forward = "";
		if(Forward.equals("")){%>
		<jsp:include page="./Content/Home.jsp"></jsp:include>
		<%}else if(Forward.equals("achive")){%>
		<jsp:include page="./Content/Achive.jsp"></jsp:include>
		<%}else{%>
		<jsp:include page="./Content/About.jsp"></jsp:include>
	<%}%>
	</div>
</section>

</body>
</html>
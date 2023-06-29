<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="${pageContext.request.contextPath}/resources/css/Navbar.css" rel="stylesheet">
<script type = "text/javascript" src="${pageContext.request.contextPath}/resources/js/main.js" defer></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.6.2.min.js"></script>
<link rel="icon" type="image/jpg" href="${pageContext.request.contextPath}/resources/Image/Favicon.jpg">

<body>
<div id = "Sub__Menu">
	<ul class = " Login">
		<li class="Login__Item">로그인</li>
		<li class="Login__Item">홈페이지</li>
		<li class="Login__Item">회원가입</li>
	</ul>
</div>

<div id = "Navbar">
	<a class = "Navbar__Page" href="">
	<img src="${pageContext.request.contextPath}/resources/Image/Main/Main.jpg" class= "Navbar__Image" data-value="home">
	</a>
	<div class="Navbar__Menu">
		<ul class="Menu__Items">
			<li class="Menu__Item" data-value = "about">이용 방법</li>
			<li class="Menu__Item" data-value = "none">
				<form action = "Record.do" method="get">
					<input class ="Menu__Item Record" type="submit" value = "기록실">
				</form>
			</li>
			<li class="Menu__Item" data-value = "board">게시판</li>
			<li class="Menu__Item" data-value = "service">고객센터</li>
		</ul>
	</div>
</div>

<div id = "Blank"></div>

</body>
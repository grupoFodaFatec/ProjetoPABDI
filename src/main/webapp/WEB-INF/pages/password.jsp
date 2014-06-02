<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.min.css" />"/>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.css" />"/>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style.css" />"/>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/effect.css" />"/>

  <title>CereTeste</title>
</head>
<body>
	<div class="content">
		<div class="top">
			<img src="<c:url value="/resources/img/icone-com-cabeca-e-engrenagens-64x64.png" />" alt="CereTeste" />
			<span>CereTeste</span>
		</div>
		<div class="title">
			<span>Home</span>
		</div>
		<div class="buttons">
			<a href="">
				<button id="bt1"><i class="fa fa-gamepad fa-2x"></i><span>Start</span></button>
			</a>
			<a href="/ranking">
				<button id="bt2"><i class="fa fa-list-ol fa-2x"></i><span>Ranking</span></button>
			</a>
			<a href="/about">
				<button id="bt3"><i class="fa fa-exclamation-circle fa-2x"></i><span>About</span></button>
			</a>
			<a href="/index">
				<button id="bt4"><i class="fa fa-arrow-circle-o-right fa-2x"></i><span>Quit</span></button>
			</a>
		</div>
		<div class="footer">
			<i class="fa fa-html5"></i>
			<i class="fa fa-css3"></i>
			<i class="fa fa-trello"></i>
			<i class="fa fa-github-alt"></i>
			<i class="fa fa-android"></i>
			<i class="fa fa-apple"></i>
		</div>
	</div>
</body>
</html>
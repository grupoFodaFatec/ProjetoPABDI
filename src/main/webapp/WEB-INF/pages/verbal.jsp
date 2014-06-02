<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.min.css" />" />
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style2.css" />" />

	<script type="text/javascript" src="<c:url value="/resources/script/js/timer.js" />"></script>

  <title>CereTeste</title>
</head>
<body>
	<div class="Vebal">
		<h1 class="header">Raciocínio Verbal</h1>
		<div class="time">
			Tempo:
			<span id="timer">00:00:00</span>
		</div>
		<input onclick="startGame()" type="button" value="Começar" />
	</div>
	<div class="Question">
		<span>1. Frio está para Inverno como calor está para...</span>
		<div class="answer">
			<label>
				<input type="radio" name="answers">Dia
			</label>
			<label>
				<input type="radio" name="answers">Primavera
			</label>
			<label>
				<input type="radio" name="answers">Fogão
			</label>
			<label>
				<input type="radio" name="answers">Verão
			</label>
		</div>
	</div>
	<div name="scape"></div>
</body>
</html>
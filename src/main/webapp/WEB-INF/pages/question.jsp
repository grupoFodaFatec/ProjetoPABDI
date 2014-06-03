<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.min.css" />"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style2.css" />"/>

	<!--<meta name="MobileOptimized" content="320">-->
	<title>CereTeste</title>
</head>

<body>
	<div class="content">
		<h1 class="header">Adicionar Questão</h1>
		
		<form:form class="question" action="">
			<span style="vertical-align: top;">Questão:</span>
			<textarea id="question" type="text" maxlength="1000" size="100" style="height:100px; width:300px;"></textarea>
			<div class="answer">
				<input type="radio" name="answers">A.<span id="a"></span>
				<input type="radio" name="answers">B.<span id="b"></span>
				<input type="radio" name="answers">C.<span id="c"></span>
				<input type="radio" name="answers">D.<span id="d"></span>
			</div>
			<div id="btn-add">
				<button type="submit" id="submit">Cadastrar</button>
				<button id="reset" type="reset">Limpar</button>
				<a href="/main"><button id="cancel" type="button">Cancelar</button></a>
			</div>
		</form:form>
	</div>
</body>

</html>
﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
		<h1 class="header">Questões</h1>
		<br />
		<ul>
			<li><a href="/questionAdd">Adicionar nova questão de raciocínio verbal</a></li>
		</ul>
		<ul>
			<li><a href="/questionList">Listar todas as questões de raciocínio verbal</a></li>
		</ul>
	</div>
</body>
</html>
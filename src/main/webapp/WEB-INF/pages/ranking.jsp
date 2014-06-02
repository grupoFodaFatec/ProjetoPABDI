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
	<div class="ranking">
		<h1 class="header">Ranking</h1>
		<table>
			<tr class="table_top">
				<th id="name" style="width: 770px;">Nome</th>
				<th id="point" style="width: 200px;">Pontuação</th>
			</tr>
			<tr>
				<th><i class="fa fa-trophy" style="color: #FFD700; margin-right: 10px;"></i>Shang</th>
				<th>4500</th>
			</tr>
			<tr>
				<th><i class="fa fa-trophy" style="color: #CDCDCD; margin-right: 10px;"></i>Arthur</th>
				<th>4000</th>
			</tr>
			<tr>
				<th><i class="fa fa-trophy" style="color: #8B4513; margin-right: 10px;"></i>Gláucia</th>
				<th>2000</th>
			</tr>
		</table>
	</div>
	<div name="scape"></div>
</body>
</html>
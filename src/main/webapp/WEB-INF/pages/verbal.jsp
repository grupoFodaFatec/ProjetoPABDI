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

  <!--<meta name="MobileOptimized" content="320">-->
  <title>CereTeste</title>
</head>
<body>
  <div class="content">
    <h1 class="header">Raciocínio Verbal</h1>
    <div class="time">
      Tempo: 
      <span id="timer">00:00:00</span>
    </div>
    <input id="btn_start" onclick="startGame();" type="button" value="Começar">
    <div class="question" id="question" style="visibility: hidden;">
      <span>1. Frio está para Inverno como calor está para...</span>
      <div class="answer">
        <input type="radio" name="answers">A.<span id="a1">Dia</span>
        <input type="radio" name="answers">B.<span id="a2">Primavera</span>
        <input type="radio" name="answers">C.<span id="a3">Fogão</span>
        <input type="radio" name="answers">D.<span id="a4">Verão</span>
      </div>
    </div>
  </div>
</body>
</html>
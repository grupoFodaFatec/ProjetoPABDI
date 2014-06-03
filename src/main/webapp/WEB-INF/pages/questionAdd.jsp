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
    <form:form name="question" class="question" action="/question/add" method="post">
        <span style="vertical-align: top;">Questão:</span>
        <textarea name="question" type="text" maxlength="1000" size="100" style="height:100px; width:300px;"></textarea>
        <span style="vertical-align: top;">Tipo:</span>
        <input name="type" type="number" max="10" min="1" value="1">

        <div class="answer">
            <input type="radio" name="isCorrectAnswerA" checked="true">A.<input path="answerA" type="text"
                                                                                maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerB">B.<input name="answerB" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerC">C.<input name="answerC" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerD">D.<input name="answerD" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerE">E.<input name="answerE" type="text" maxlength="50" size="30">
        </div>
        <div id="btn-add">
            <button type="submit" id="submit">Cadastrar</button>
            <button id="reset" type="reset">Limpar</button>
            <a href="/question">
                <button id="cancel" type="button">Cancelar</button>
            </a>
        </div>
    </form:form>
</div>
</body>

</html>

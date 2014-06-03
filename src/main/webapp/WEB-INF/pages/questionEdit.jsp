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
    <h1 class="header">Editar Questão</h1>
    <form:form name="question" class="question" action="/question/save" method="post">
        <span style="vertical-align: top;">Questão:</span>
        <input name="question" type="text" value="${fakeQuestion.question}" maxlength="1000" size="100"
               style="height:100px; width:300px;">
        <span style="vertical-align: top;">Tipo:</span>
        <input name="type" type="number" max="10" min="1" value="${fakeQuestion.type}">

        <div class="answer">
            <input type="radio" name="isCorrectAnswerA" checked="${fakeQuestion.isCorrectAnswerA}">A.<input
                path="answerA" value="${fakeQuestion.answerA}" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerB" checked="${fakeQuestion.isCorrectAnswerB}">B.<input
                name="answerB" value="${fakeQuestion.answerB}" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerC" checked="${fakeQuestion.isCorrectAnswerC}">C.<input
                name="answerC" value="${fakeQuestion.answerC}" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerD" checked="${fakeQuestion.isCorrectAnswerD}">D.<input
                name="answerD" value="${fakeQuestion.answerD}" type="text" maxlength="50" size="30">
            <input type="radio" name="isCorrectAnswerE" checked="${fakeQuestion.isCorrectAnswerE}">E.<input
                name="answerE" value="${fakeQuestion.answerE}" type="text" maxlength="50" size="30">
        </div>
        <input name="fakeid" type="hidden" value="${fakeQuestion.fakeid}">
        <input name="fakeidA" type="hidden" value="${fakeQuestion.fakeidA}">
        <input name="fakeidB" type="hidden" value="${fakeQuestion.fakeidB}">
        <input name="fakeidC" type="hidden" value="${fakeQuestion.fakeidC}">
        <input name="fakeidD" type="hidden" value="${fakeQuestion.fakeidD}">
        <input name="fakeidE" type="hidden" value="${fakeQuestion.fakeidE}">

        <div id="btn-add">
            <button type="submit" id="submit">Salvar</button>
            <button id="reset" type="reset">Limpar</button>
            <a href="/question">
                <button id="cancel" type="button">Cancelar</button>
            </a>
        </div>
    </form:form>
</div>
</body>

</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.min.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style2.css" />"/>

    <script>
        function mensagemOperacao(){
            alert("Questão salva com sucesso!!!");
        }
    </script>

    <!--<meta name="MobileOptimized" content="320">-->
    <title>CereTeste</title>
</head>

<body>
<div class="content">
    <h1 class="header">Editar Questão</h1>
    <form:form name="question" class="question" action="/question/save" method="post">

        <span style="vertical-align: top;">Questão:</span>
        <input name="question" type="text" value="${fakeQuestion.question}" maxlength="1000" size="100"
               style= "width:600px;">
        <span style="vertical-align: top;">Tipo:</span>
        <input name="type" type="number" max="10" min="1" value="${fakeQuestion.type}">
        <br>
        <br>

        <div>
            <input type="checkbox" name="isCorrectAnswerA" value="1" ${fakeQuestion.isCorrectAnswerA == 1 ? "checked":""}>A.</input>
            <input name="answerA" value="${fakeQuestion.answerA}" type="text" maxlength="500" size="50" />
            <p/>
            <input type="checkbox" name="isCorrectAnswerB" value="1" ${fakeQuestion.isCorrectAnswerB == 1 ? "checked":""}>B.</input>
            <input name="answerB" value="${fakeQuestion.answerB}" type="text" maxlength="50" size="50" />
            <p/>
            <input type="checkbox" name="isCorrectAnswerC" value="1" ${fakeQuestion.isCorrectAnswerC == 1 ? "checked":""}>C.</input>
            <input name="answerC" value="${fakeQuestion.answerC}" type="text" maxlength="50" size="50" />
            <p/>
            <input type="checkbox" name="isCorrectAnswerD" value="1" ${fakeQuestion.isCorrectAnswerD == 1 ? "checked":""}>D.</input>
            <input name="answerD" value="${fakeQuestion.answerD}" type="text" maxlength="50" size="50" />
            <p/>
            <input type="checkbox" name="isCorrectAnswerE" value="1" ${fakeQuestion.isCorrectAnswerE == 1 ? "checked":""}>E.</input>
            <input name="answerE" value="${fakeQuestion.answerE}" type="text" maxlength="50" size="50" />
            <p/>
        </div>
        <div>
        <input name="fakeid" type="hidden" value="${fakeQuestion.fakeid}">
        <input name="fakeidA" type="hidden" value="${fakeQuestion.fakeidA}">
        <input name="fakeidB" type="hidden" value="${fakeQuestion.fakeidB}">
        <input name="fakeidC" type="hidden" value="${fakeQuestion.fakeidC}">
        <input name="fakeidD" type="hidden" value="${fakeQuestion.fakeidD}">
        <input name="fakeidE" type="hidden" value="${fakeQuestion.fakeidE}">
        </div>
        <div id="btn-add">
            <br>
                <button type="submit" id="submit" onclick="mensagemOperacao()">Salvar</button>
                <a href="/question">
                    <button id="cancel" type="button">Cancelar</button>
                </a>
        </div>
    </form:form>
</div>
</body>

</html>

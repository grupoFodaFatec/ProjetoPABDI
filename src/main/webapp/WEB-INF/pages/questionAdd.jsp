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

            //alert("Questão cadastrada com sucesso!!!");
        }
    </script>

    <!--<meta name="MobileOptimized" content="320">-->
    <title>CereTeste</title>
</head>

<body>
<div class="content">
    <h1 class="header">Adicionar Questão</h1>
    <form:form name="question" class="question" action="/question/save" method="post">
        <span style="vertical-align: top;">Questão:</span>
        <textarea name="question" type="text" maxlength="1000" size="100" style="min-height:50px;min-width:600px;max-height:100px; max-width:600px;" required></textarea>
        <span style="vertical-align: top;">Tipo:</span>
        <input name="type" type="number" max="10" min="1" value="1" style="vertical-align: top;">

        <div class="answer">
            <input type="checkbox" name="isCorrectAnswerA" value="1">A.</input>
            <input name="answerA" type="text" maxlength="50" size="20" title="Por favor, preencha a resposta" required />
            <input type="checkbox" name="isCorrectAnswerB" value="1">B.</input>
            <input name="answerB" type="text" maxlength="50" size="20" title="Por favor, preencha a resposta" required />
            <input type="checkbox" name="isCorrectAnswerC" value="1">C.</input>
            <input name="answerC" type="text" maxlength="50" size="20" title="Por favor, preencha a resposta" required />
            <input type="checkbox" name="isCorrectAnswerD" value="1">D.</input>
            <input name="answerD" type="text" maxlength="50" size="20" title="Por favor, preencha a resposta" required />
            <input type="checkbox" name="isCorrectAnswerE" value="1">E.</input>
            <input name="answerE" type="text" maxlength="50" size="20" title="Por favor, preencha a resposta" required />
        </div>

        <div id="btn-add">
            <button type="submit" id="submit" onclick="mensagemOperacao()">Cadastrar</button>
            <button id="reset" type="reset">Limpar</button>
            <a href="/question">
                <button id="cancel" type="button">Cancelar</button>
            </a>
        </div>
    </form:form>
</div>
</body>

</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style2.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/effect2.css" />"/>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1,width=device-width">
    <meta name="MobileOptimized" content="320">
    <title>CereTeste</title>
</head>

<body>
<div class="background"></div>
<div class="content">
    <div class="form">
        <h2 class="form-heading">CADASTRO</h2>

        <form class="add" action="" method="">
            <div class="form-wrap-add">
                <input id="name" type="text" maxlength="50" placeholder="Primeiro Nome"
                       title="Por favor, preenche seu nome!" required autofocus>
                <input id="surname" type="text" placeholder="Sobrenome" title="Por favor, preenche seu Sobrenome!"
                       required>
                <input id="email" type="email" placeholder="E-Mail" title="Por favor, preenche seu E-mail!" required>
                <input id="name-user" type="text" placeholder="Nome do Usuário"
                       title="Por favor, preenche seu Nome do Usuário!" required>
                <input id="pass" type="password" placeholder="Senha" title="Por favor, preeche sua Senha!" required>
                <input id="re-pass" type="password" placeholder="Confirma Senha"
                       title="Por favor, preeche sua Confirma Senha!" required>

                <div class="radios">
                    <input type="radio" name="sexo" value="Feminino" title="Por favor, selecione seu Sexo!" required>
                    Feminino
                    <input type="radio" name="sexo" value="Masculino" required> Masculino
                </div>

                <div id="btn-add">
                    <button id="submit" type="submit">Cadastrar</button>
                    <button id="reset" type="reset">Limpar</button>
                    <a href="index.html">
                        <button id="cancel" type="button">Cancelar</button>
                    </a>
                </div>
            </div>
        </form>
    </div>
</div>

<div class="footer">
    <i class="fa fa-html5"></i>
    <i class="fa fa-css3"></i>
    <i class="fa fa-trello"></i>
    <i class="fa fa-github-alt"></i>
    <i class="fa fa-android"></i>
    <i class="fa fa-apple"></i>
</div>
</body>

</html>
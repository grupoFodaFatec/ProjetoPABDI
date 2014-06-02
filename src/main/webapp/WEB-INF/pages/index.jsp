<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/normalize.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style2.css" />"/>

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/media.css" />" media="screen"/>
    <!--<link rel="stylesheet" type="text/css" href="style/effect2.css"/>-->
    <meta name="viewport" content="initial-scale=1, maximum-scale=1,width=device-width">
    <meta name="MobileOptimized" content="320"/>
    <title>CereTeste</title>
</head>
<body>
<div class="background"></div>

<div class="content">
    <div class="form">
        <h2 class="form-heading">ACESSE</h2>

        <div class="form-wrap">
            <form:form class="sign" action="/login" commandName="user">

                <label><i class="fa fa-user fa-fw"></i></label>
                <input id="login" name="login" type="text" maxlength="60" placeholder="Login" title="Por favor, preencha seu login"
                       required autofocus autocomplete="off">

                <label><i class="fa fa-key fa-fw"></i></label>
                <input id="pass" name="password" type="password" maxlength="20" placeholder="Senha"
                       title="Por favor, preencha sua senha" required>
                <!--<div class="input-group">
                    <span><i class="fa fa-user fa-fx"></i></span>
                    <input id="login" class="form-control" type="text" maxlength="100" placeholder ="Login" title="Por favor, preencha seu login." required autofocus autocomplete="off">
                </div>
                <br/>
                <br/>

                <span><i class="fa fa-key fa-fw fa-fw"></i></span>
                <input id="pass" type="password" maxlength="100" placeholder="Senha" title="Por favor, preencha sua senha." required >

                <br/>
                <br/>
                -->
                <div class="buttons">
                    <button id="submit1" type="submit">Entrar</button>
                </div>

                <p>
                    <a href="#modal">Esqueceu a sua Senha?</a><br/><br/>
                    Ainda não é CADASTRADO? <a href="/user/add">Clique Aqui!</a>
                </p>
            </form:form>
        </div>
    </div>
    <div name="scape"></div>
</div>

<div id="modal">
    <div class="modal-content">
        <div class="modal-header">
            <a href="index.html"><i class="fa fa-times"></i></a>

            <h2 class="modal-heading">Esqueceu a sua senha ?</h2>
        </div>
        <div class="modal-body">
            <p>Digite o e-mail cadastrado.</p>
            <input type="text" name="email" placeholder="E-Mail">
        </div>
        <div class="modal-footer">
            <a href="index.html">
                <button id="cancel" type="button">Cancelar</button>
            </a>
            <button id="submit2" type="submit">Enviar</button>
        </div>
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
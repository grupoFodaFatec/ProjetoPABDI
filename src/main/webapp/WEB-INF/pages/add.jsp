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
        <h2 class="form-heading">Cadastro de Uusários</h2>
        <form:form class="add" action="/user/create" commandName="user">
          <div class="form-wrap-add">
            <input id="name" name="name" type="text" maxlength="60" placeholder="Nome"
                   title="Por favor, preencha seu nome" required autofocus>
            <input id="text" type="text" name="login" maxlength="60" placeholder="Login"
                   title="Por favor, preencha seu login" required>
            <input id="password" name="password" type="password" maxlength="20" placeholder="Senha"
                   title="Por favor, preecha sua senha" required>
            <div id="btn-add">
              <button id="submit" type="submit">Cadastrar</button>
              <button id="reset" type="reset">Limpar</button>
              <a href="/index">
                <button id="cancel" type="button">Cancelar</button>
              </a>
            </div>
          </div>
        </form:form>
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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.min.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style3.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/effect.css" />"/>
    <title>Teste</title>
</head>

<body>
<div class="background"></div>
<div class="content">
    <div class="nav-holder">
        <div class="navbar-header">
            <img src="<c:url value="/resources/img/icone-com-cabeca-e-engrenagens-64x64.png" />" alt="CereTeste">
            <span>CereTeste</span>
        </div>
        <ul class="nav nav-pills nav-stacked">
            <li id="nav1">
                <a href=""><i class="fa fa-gamepad fa-2x"></i>Start</a>
            </li>
            <li id="nav2">
                <a href="ranking.html" target="iframe"><i class="fa fa-list-ol fa-2x"></i>Ranking</a>
            </li>
            <li id="nav3">
                <a href="about.html" target="iframe"><i class="fa fa-exclamation-circle fa-2x"></i>About</a>
            </li>
            <li id="nav4">
                <a href="index.html"><i class="fa fa-arrow-circle-o-right fa-2x"></i>Quit</a>
            </li>
        </ul>
    </div>
    <div class="content-holder">
        <iframe name="iframe" marginwidth="0" marginheight="0" align="top" scrolling="no" frameborder="0" hspace="0"
                vspace="0"></iframe>
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
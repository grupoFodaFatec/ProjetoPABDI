<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1 class="header">Questões</h1>

    <table>
        <thead>
        <tr>
            <th width="10%">ID</th>
            <th width="45%">Name</th>
            <th width="10%">Ação</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${questions}">
            <tr>
                <td>${item.idQuestion}</td>
                <td>${item.question}</td>
                <td>
                    <a href="/questionEdit/${item.idQuestion}">Edit</a>
	                  <br />
                    <a href="/questionDelete/${item.idQuestion}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
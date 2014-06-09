<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/font-awesome.min.css" />" />
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style2.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/script/js/jquery.js" />"></script>
  <script type="text/javascript" src="<c:url value="/resources/script/js/timer.js" />"></script>
	<script>
		function next() {
			/*var time = $("#formTimer span").innerHTML;
			alert(time);
			var time2 = $("#formTimer span").html.timerId;
			alert(time2);
			var time3 = $("#formTimer span").html.timers;
			alert(time3);
			var time4 = $("#formTimer span").html.formTimer;
			alert(time4);*/

			//var choice = $("#formAnswers input:checked").value;
			$.ajax({
				type: "POST",
				url: "/verbal/next",
				data: "",//"answer=" + choice, + "&time=" + time,
				success: function (data) {
					if (data != null) {
						var json = jQuery.parseJSON(data);
						$('#question').text(json.question);
						$('#answer0').text(json.answer0);
						$('#answer1').text(json.answer1);
						$('#answer2').text(json.answer2);
						$('#answer3').text(json.answer3);
						$('#answer4').text(json.answer4);
						$('#answer0').removeAttr("checked");
						$('#answer1').removeAttr("checked");
						$('#answer2').removeAttr("checked");
						$('#answer3').removeAttr("checked");
						$('#answer4').removeAttr("checked");
					}
				},
				error: function (e) {
					redirectRanking();
				}
			});
		}
		function redirectRanking() {
			window.location = "/verbal/finish"
		}
	</script>

  <!--<meta name="MobileOptimized" content="320">-->
  <title>CereTeste</title>
</head>
<body>
  <div class="content">
    <h1 class="header">Raciocínio Verbal</h1>
	  <form id="formTimer" name="formTimer">
	    <div class="time">
	      Tempo:
	      <span id="timer">00:00:00</span>
	    </div>
	  </form>
    <input id="btn_start" onclick="startGame();" type="button" value="Começar">
    <div class="question" id="questions" style="visibility: hidden;" >
	    <div id="questionDiv">
        <span id="question">${question.question}</span>
		  </div>
	    <form id="formAnswers" name="formAnswers">
		    <input type="radio" name="answers" id="a" value="A" />A. <span id="answer0">${answers[0].answer}</span><br />
		    <input type="radio" name="answers" id="b" value="B" />B. <span id="answer1">${answers[1].answer}</span><br />
		    <input type="radio" name="answers" id="c" value="C" />C. <span id="answer2">${answers[2].answer}</span><br />
		    <input type="radio" name="answers" id="d" value="D" />D. <span id="answer3">${answers[3].answer}</span><br />
		    <input type="radio" name="answers" id="e" value="E" />E. <span id="answer4">${answers[4].answer}</span><br />
		    <br />
		    <input type="button" value="Próximo" onclick="next();">
	    </form>
		 
    </div>
  </div>
</body>
</html>

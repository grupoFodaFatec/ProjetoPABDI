var milliSeg = 0;
var seg = 0;
var min = 0;
var interval = undefined;

function checkTime( time ){
		x = (time < 10 ? "0" : "") + time;
		return x;
	}
	
function formatTimer(){
	
	//seg = (milliSeg / 100) % 60;
	//min = seg / 60;
	
	if(milliSeg == 100){
		milliSeg = 0;
		seg += 1;
	}

	if(seg == 60){
		seg = 0;
		min += 1;
	}
	strMin = checkTime(min);
	strSeg = checkTime(seg);
	strMilliSeg = checkTime(milliSeg);
	
	t = strMin + ":" + strSeg + ":" + strMilliSeg;
	return t;
}	

function conta(){
	milliSeg++;
	//min++
	//console.log(milliSeg);
	document.getElementById("timer").innerHTML = formatTimer();
}

function startGame(){	
	interval = setInterval(conta, 10);
	/*else {
		clearInterval( interval );
		interval = undefined;
	}*/		
}
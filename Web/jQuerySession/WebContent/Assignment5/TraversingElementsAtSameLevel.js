$(document).ready(function(){
	
	 $("#buttonForSiblings").click(siblings1);   
	 $("#buttonForNext").click(next1);
	 $("#buttonForNextAll").click(nextAll1);
	 $("#buttonForNextUntil").click(nextUntil1);
	 $("#buttonForPrev").click(prev1);
	 $("#buttonForPervAll").click(prevAll1);
	 $("#buttonForPrevUntil").click(prevUntil1);
	    
});

function siblings1(){
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").siblings().css({"color": "red", "border": "2px solid red"});
}

function next1(){
	//defaultCondition();
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").next().css({"color": "red", "border": "2px solid red"});
} 

function nextAll1(){
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").nextAll().css({"color": "red", "border": "2px solid red"});
}

function nextUntil1(){
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").nextUntil("h5").css({"color": "red", "border": "2px solid red"});
}

function prev1(){
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").prev().css({"color": "red", "border": "2px solid red"});
}
function prevAll1(){
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").prevAll().css({"color": "red", "border": "2px solid red"});
}
function prevUntil1(){
	$("div").children().css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h3").prevUntil("span").css({"color": "red", "border": "2px solid red"});
}
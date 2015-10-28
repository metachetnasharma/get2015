$(document).ready(init);

function init(){
	$("#hide").on('click',hide1);    
    $("#show").on('click',show1);     
    $("#myButton").on('click',myButton1);   
}

function hide1(){
    $("#span").hide();
    $('#myButton').val('show');
}

function show1(){
    $("#span").show();
    $('#myButton').val('hide');
}

function myButton1(){
	if($('#myButton').val() == 'hide'){
		 $(hide1());
	}
	else
		 $(show1());
}
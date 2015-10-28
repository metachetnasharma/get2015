function show() {
	var s = document.getElementById("span").style.visibility = "visible";
	myButton.value = "hide";
}

function hide() {
	var h = document.getElementById("span").style.visibility = "hidden";
	myButton.value = "show";
}

function change(){
	if(document.getElementById("myButton").value == "hide")
		hide();
	else
		show();
}

/*document.getElementById("demo").onkeypress = function() {myFunction()};
function myFunction() {
    document.getElementById("demo").style.backgroundColor = "red";
}*/
function keypress_noespace(evt) {
	var inputValue = event.which;
	// allow letters
	// if (!(inputValue >= 65 && inputValue <= 120) && (inputValue != 0)) {
	if (!(inputValue >= 65 && inputValue <= 122) && (inputValue != 0)) {
		event.preventDefault();
	}
}
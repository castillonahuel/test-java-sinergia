function myFunction() {
    var x = document.getElementById("myDIV");
    var c = document.getElementById("boton");
    if (x.style.display === "none") {
        x.style.display = "block";
		c.style.display = "none";
    } else {
        x.style.display = "none";
		c.style.display = "block";
    }
}

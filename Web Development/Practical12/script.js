/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

function checkUsername(name) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() {
        if(this.readyState == 4 && this.status == 200) {
            if(this.responseText == '0') {
                document.getElementById('error').innerHTML = "";
            } else {
                document.getElementById('error').innerHTML = "Email Already Exists";
            }
        }   
    };

    xmlHttp.open("GET", "script.php?username=" + name, true);
    xmlHttp.send();
}
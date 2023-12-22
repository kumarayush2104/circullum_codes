var today = new Date();
var day = today.getDate();
var month = today.getMonth() + 1;
var year = today.getFullYear();

if (day < 10) day = '0' + day;
if (month < 10) month = '0' + month;
var date = year + "-" + month + "-" + day;
document.getElementById("isd").setAttribute("max", date);


var seday = new Date(date);
seday.setDate(seday.getDate() + 7);

var day = seday.getDate();
var month = seday.getMonth() + 1;
var year = seday.getFullYear();

if (day < 10) day = '0' + day;
if (month < 10) month = '0' + month;
var date = year + "-" + month + "-" + day;
document.getElementById("red").setAttribute("max", date);



function validate() {
    var name = document.form1.name.value;
    var email = document.form1.mail.value;
    var dep = document.form1.dep.value;
    var enroll = document.form1.enroll.value;
    var boB = document.form1.boB.value;
    var inid = document.form1.inid.value;
    var retd = document.form1.retd.value;
    if (name == "" || name == null || !name.match("[a-zA-Z]")) {
        alert("Please enter your Name !");
    } else if (enroll == "" || enroll == null || !enroll.match("[0-9]{15}")) {
        alert("Please enter a valid Enrollment Number !");
    } else if (boB == "" || boB == null || !enroll.match("[0-9]{10}")) {
        alert("Please enter a valid Enrollment Number !");
    } else if (inid == "") {
        alert("Please enter a correct issue date !");
    } else if (retd == "") {
        alert("Please enter a correct return date !");
    } else if (!email.includes("@") || !email.includes(".") || email.includes(" ")) {
        alert("Please enter a correct email address !");
    } else if (dep == "") {
        alert("Please select your department !");
    } else {
        alert("Form Submitted");
    }
}

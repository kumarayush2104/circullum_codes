var today = new Date();
var day = today.getDate();
var month = today.getMonth() + 1;
var year = today.getFullYear();

if (day < 10) day = '0' + day;
if (month < 10) month = '0' + month;
var mdate = year + "-" + month + "-" + day;
$("#isd").attr("max", mdate);


var seday = new Date(mdate);
seday.setDate(seday.getDate() + 7);

var day = seday.getDate();
var month = seday.getMonth() + 1;
var year = seday.getFullYear();

if (day < 10) day = '0' + day;
if (month < 10) month = '0' + month;
var date = year + "-" + month + "-" + day;
$("#red").attr("max", date);

function validate() {
    if ($("#name").val().length < 1 || !$("#name").val().match("[a-zA-Z]")) {
        alert("Please enter your Name !");
    } else if ($("#enroll").val().length < 1 || !$("#enroll").val().match("[0-9]{15}")) {
        alert("Please enter a valid Enrollment Number !");
    } else if ($("#boB").val().length < 1 || !$("#boB").val().match("[0-9]{10}")) {
        alert("Please enter a Book Barcode Number !");
    } else if (!$("#mail").val().includes("@") || !$("#mail").val().includes(".") || $("#mail").val().includes(" ")) {
        alert("Please enter a valid email id !");
    } else if ($("#dep:checked").length < 1) {
        alert("Please select your department !");
    } else if ($("#isd").val() == "") {
        alert("Please enter issue date !");
    } else if ($("#red").val() == "" || ($("#red").val() < $("#isd").val())) {
        alert("Please enter a valid return date !");
    } else {
        alert("Form Submitted");
    }
}
<!--B.Tech Computer Science and Engineering-->
<!--Ayush Kumar-->
<!--202103103510253-->
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>Practical 5-b</title>
</head>
<body style="text-align: center; font-family:sans-serif">
<?php
echo "B.Tech Computer Science and Engineering<br>Ayush

Kumar<br>202103103510253<br>";
if(array_key_exists("imag_x", $_POST) && array_key_exists("imag_y",
$_POST)) {
if(13<$_REQUEST["imag_x"] && $_REQUEST["imag_x"]<287) {
if( 12<$_REQUEST["imag_y"] && $_REQUEST["imag_y"] < 290) {
header("location: place.php?where=2");
} elseif (291<$_REQUEST["imag_y"] && $_REQUEST["imag_y"] < 566) {
header("location: place.php?where=3");
} else {

header("location: place.php?where=5");

}
} elseif(288<$_REQUEST["imag_x"] && $_REQUEST["imag_x"]<564) {
if(12<$_REQUEST["imag_y"] && $_REQUEST["imag_y"] < 290) {

header("location: place.php?where=1");

} elseif (291<$_REQUEST["imag_y"] && $_REQUEST["imag_y"] <
566) {

header("location: place.php?where=4");

} else {

header("location: place.php?where=5");
}
} else {
header("location: place.php?where=5");
}
}
?>
<form method="post" action="">
<input type="image" src="graph.png" name="imag" />
</form>
</body>
</html>
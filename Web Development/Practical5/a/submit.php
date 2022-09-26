<!--B.Tech Computer Science and Engineering-->
<!--Ayush Kumar-->
<!--202103103510253-->
<html>
<body style="text-align: center">
<?php
echo "B.Tech Computer Science and Engineering<br>Ayush
Kumar<br>202103103510253<br>";
if(array_key_exists("picture", $_FILES)) {
$fName = $_FILES["picture"]["tmp_name"];
header('Content-type: image/jpeg');
header('Content-Disposition: attachment;
filename="'.basename($fName).'"');
readfile($fName);
}
move_uploaded_file($_FILES['picture']['tmp_name'], "file")
?>
<img src=<?php echo "file"?> height="190" width="170"/><br><br>
<?php
foreach($_POST as $key => $value) {
echo $key, " ", $value, "<br>";
}
?>
</body>
</html>
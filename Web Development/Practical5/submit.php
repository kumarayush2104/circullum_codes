<html>
<body style="text-align: center">
<?php
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

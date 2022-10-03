<?php
    ini_set("display_errors", "1");
    $conn = new mysqli('localhost', '', '', 'WD');
    $name = $_GET['username'];
    $result = $conn -> query('SELECT Email from UserDB where Email = "'.$name.'"');
    $row = $result -> fetch_assoc();
    if($row) {
        echo 1;
    } else {
        echo 0;
    }
?>

<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/
    ini_set("display_errors", "1");
    $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
    $name = $_GET['username'];
    $result = $conn -> query('SELECT Email from prac7 where Email = "'.$name.'"');
    $row = $result -> fetch_assoc();
    if($row) {
        echo 1;
    } else {
        echo 0;
    }
?>

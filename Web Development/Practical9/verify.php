<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/
    session_start();
    if($_SESSION['otp'] == $_REQUEST['otp']) {
        $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
        $conn -> query('INSERT INTO prac1 values("'.$_SESSION['tmp_data']['name'].'","'.$_SESSION['tmp_data']['email'].'","'.$_SESSION['tmp_data']['password'].'","'.$_SESSION['tmp_data']['contact'].'","'.$_SESSION['tmp_data']['gender'].'")');
        echo 1;
    } else {
        echo 0;
    }
?>
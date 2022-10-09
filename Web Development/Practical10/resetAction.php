<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

    session_start();
    if($_SESSION['otp'] == $_GET['otp']) {
        $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
        $conn -> query('UPDATE prac7 set password="'.$_REQUEST['pass'].'" where email = "'.$_SESSION['email'].'"');
        session_unset();
    } else {
        echo 0;
    }
?>
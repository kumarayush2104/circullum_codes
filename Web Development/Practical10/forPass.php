<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

    session_start();

    $conn = new mysqli('localhost', 'root', '282002', 'UserDb');

    $result = $conn -> query('SELECT * FROM prac7 where email="'.$_REQUEST['email'].'"');
    $row = $result -> fetch_assoc();
    $conn -> close();
    if($row) {
        include "sendmail.php";
        $mail->addAddress($_REQUEST['email']);
        $otp = rand(100000, 999999);
        $_SESSION['otp'] = $otp;
        $_SESSION['email'] = $_REQUEST['email'];
        $mail->Body = 'Your OTP for password reset is '.$otp;
        $mail->send();
    } else {
        echo 0;
    }
?>
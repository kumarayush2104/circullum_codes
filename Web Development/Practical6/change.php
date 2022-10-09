<?php
    $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
    $result = $conn -> query('SELECT Password FROM prac1 where Email="'.$_REQUEST['username'].'"');
    $row = $result -> fetch_assoc();

    if($_REQUEST['oldpassword'] == $row['password']) {
        $result = $conn -> query('UPDATE prac1 SET Password="'.$_REQUEST['password'].'" where="'.$_REQUEST['username'].'"');
        echo "Password updated Successfully";
    } else {
        header('location: login.php?err=2');
    }
?>
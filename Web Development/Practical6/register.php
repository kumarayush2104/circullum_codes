<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/
    if(!preg_match("/^[0-9A-Za-z]+$/",$_REQUEST['name'])) {
        header('location: index.php?err=2');
    } elseif(!str_contains($_REQUEST['email'], '@') && !str_contains($_REQUEST['email'], '.') && str_contains($_REQUEST['email'], ' ')) {
        header('location: index.php?err=3');
    } elseif(!preg_match("/^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@+!&])[a-zA-Z0-9+@!&]{8,}$/",$_REQUEST['password'])) {
        header('location: index.php?err=1');
    } elseif(!preg_match("/^[6789]\d{9}$/",$_REQUEST['contact'])) {
        header('location: index.php?err=4');
    } elseif($_REQUEST['gender'] == '') {
        header('location: index.php?err=5');
    } else {
        $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
        $conn -> query('CREATE TABLE IF NOT EXISTS prac1(Name varchar(50), Email varchar(50), Password varchar(50), Contact varchar(50), Gender ENUM("Male", "Female"))');
        $conn -> query('INSERT INTO prac1 values("'.$_REQUEST['name'].'","'.$_REQUEST['email'].'","'.$_REQUEST['password'].'","'.$_REQUEST['contact'].'","'.$_REQUEST['gender'].'")');
        header('location: login.php');
    }
?>
<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/
    session_start();
    if(isset($_REQUEST['logout'])) {
        setcookie('email', "" , -1, "/");
        session_destroy();
        header('location: index.php');
    } elseif(isset($_COOKIE['email'])) {
        $_POST['email'] = $_COOKIE['email'];
        $_POST['password'] = $_COOKIE['password'];
    } elseif(isset($_SESSION['email'])) {
        $_POST['email'] = $_SESSION['email'];
        $_POST['password'] = $_SESSION['password'];
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
</head>
<body style="display: flex; justify-content: center; flex-direction: column">
<?php
    $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
    
    $result = $conn -> query("Select * from prac7 where email='".$_POST['email']."' and password='".$_POST['password']."'");
    $row = $result -> fetch_assoc();

    if($row) {
        $conn -> query("update prac7 set first_login = 1 where email='".$_POST['email']."'");
        $result = $conn -> query("Select sum(first_login) as count from prac7");
        $row = $result -> fetch_assoc();
        echo "<p style='padding: 10px'>B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br></p>";
        echo 'Welcome: '.$_POST['email']."<br>User Count: ".$row['count']."<br>";
        $_SESSION['email'] = $_POST['email'];
        $_SESSION['password'] = $_POST['password'];
        setcookie('email', $_POST['email'] , time() + (86400 * 30), "/");
        setcookie('password', $_POST['password'] , time() + (86400 * 30), "/");
        echo '<form action=""><input type="submit" name="logout" value="Logout"></form>';
    } else {
        header('location: index.php?err=1');
    }
?>
</body>
</html>
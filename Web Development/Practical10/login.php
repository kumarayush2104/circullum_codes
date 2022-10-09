<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/
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
        header('location: https://google.com');
    } else {
        header('location: index.php');
    }
?>
</body>
</html>
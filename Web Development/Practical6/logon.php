<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

    $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
    
    $result = $conn -> query("Select * from prac1 where email='".$_POST['email']."' and password='".$_POST['password']."'");
    $row = $result -> fetch_assoc();
    $conn -> close();

    if($row) {
        header('location: update.php?username='.$_POST['email']);
    } else {
        header('location: login.php?err=1');
    }
?>
</body>
</html>
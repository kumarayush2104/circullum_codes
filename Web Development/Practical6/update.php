<?php

/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

    if(isset($_REQUEST['smb'])) {
        $conn = new mysqli('localhost', 'root', '282002', 'UserDb');
        $result = $conn -> query('SELECT Password FROM prac1 where Email="'.$_REQUEST['username'].'"');
        $row = $result -> fetch_assoc();

        if($_REQUEST['oldpassword'] == $row['Password']) {
            $result = $conn -> query('UPDATE prac1 SET Password="'.$_REQUEST['password'].'" where Email="'.$_REQUEST['username'].'"');
            header('location: login.php?err=6');
        } else {
            header('location: login.php?err=2');
        }
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<style>
    * {
        font-family: Arial, Helvetica, sans-serif;
    }
    th {
        text-align: left;
    }

    td , form{
        text-align: center;
    }

    body {
        height: 100vh;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }

    table {
        padding: 10px 20px;
        border-spacing: 10px;
    }

    form {
        border: 1px solid black;
    }
</style>
<body>
    <?php echo "B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br>"; ?>
    <form action='' method='POST'>
        <h2>Change Password</h2>
        <table>
            <tr>
                <th>Old Password: </th>
                <td><input type="password" name="oldpassword" placeholder="Old Password"></td>
            </tr>
            <tr>
                <th>New Password: </th>
                <td><input type="password" name="password" placeholder="New Password"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="smb" value="Change Password"></td>
            </tr>
        </table>
    </form>
</body>
</html>
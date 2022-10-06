<?php
    session_start();
    if(isset($_COOKIE['email']) || isset($_SESSION['email'])) {
        header('location: script.php');
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Practical 7</title>
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
        align-items: center;
        justify-content: center;
    }

    table {
        padding: 10px 20px;
    }

    form {
        border: 1px solid black;
    }
</style>
<body>
    <form action='script.php' method='POST'>
        <h2>Login</h2>
        <table>
            <tr>
                <th>Email: </th>
                <td><input type="email" name="email" placeholder="abc@xyz.com"></td>
            </tr>
            <tr>
                <th>Password: </th>
                <td><input type="password" name="password" placeholder="Password"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Login"></td>
            </tr>
            <tr>
                <td colspan="2"><?php if($_GET['err'] == 1) echo "Check your username or password"?></td>
            </tr>
        </table>
    </form>
</body>
</html>
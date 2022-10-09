<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

    if($_GET['err'] == 2) {
        $error = 'Username should consist only alphabets and number';
    } elseif($_GET['err'] == 1) {
        $error = 'Password should be 8 or more characters<br>with a Capital letter and symbol';
    } elseif($_GET['err'] == 3) {
        $error = 'Email id is invalid';
    } elseif($_GET['err'] == 4) {
        $error = 'Contact number is invalid';
    } elseif($_GET['err'] == 5) {
        $error = 'Please select your gender';
    } elseif($_GET['err'] == 6) {
        $error = 'Password updated successfully';
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Practical 6</title>
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
    }

    form {
        border: 1px solid black;
    }

</style>
<body>
    <?php echo "B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br>"; ?>
    <form action='register.php' method='POST'>
        <h2>Registration</h2>
        <table>
            <tr>
                <th>Username: </th>
                <td><input type="text" name="name" placeholder="John4213"></td>
            </tr>
            <tr>
                <th>Email: </th>
                <td><input type="email" name="email" placeholder="abc@xyz.com"></td>
            </tr>
            <tr>
                <th>Password: </th>
                <td><input type="password" name="password" placeholder="Password"></td>
            </tr>
            <tr>
                <th>Contact:</th>
                <td><input type="text" name="contact" placeholder="7800697852"></td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td><input type="radio" name="gender" value="Male"> Male <input type="radio" name="gender" value="Female"> Female</td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register"></td>
            </tr>
            <tr>
                <td colspan="2" style="color: red"><?php if(isset($error)) echo $error?></td>
            </tr>
        </table>
    </form>
</body>
</html>

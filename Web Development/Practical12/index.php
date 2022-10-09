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
    <title>Practical 12</title>
</head>
<style>
    th {
        text-align: left;
    }

    td {
        text-align: center;
    }
</style>
<body>
    <?php echo "<p style='padding: 10px'>B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br></p>"; ?>
    <h2>Registration Form</h2>
    <form>
        <table>
            <tr>
                <th>Email: </th>
                <td><input type="email" name="email" onkeyup="checkUsername(this.value)" placeholder="abc@xyz.com"/></td>
            </tr>
            <tr>
                <td colspan=2 id="error" style="color: red"></td>
            </tr>
            <tr>
                <th>Name: </th>
                <td><input type="text" name="name" placeholder="John"/></td>
            </tr>
            <tr>
                <th>Password: </th>
                <td><input type="password" name="password" placeholder="Minimum 8 Characters"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="Submit" value="Register"/></td>
            </tr>
        </table>
    </form>
    <script src="script.js"></script>
</body>
</html>
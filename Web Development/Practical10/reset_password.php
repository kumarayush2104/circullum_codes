<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/

    session_start();
    if(!isset($_SESSION['otp'])) {
        header('location: index.php');
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password</title>
</head>
<body>
<style>
        th {
            text-align: left;
        }

        td {
            text-align: center;
        }
        table {
            border-spacing: 10px;
        }
    </style>
</head>
<body style="display: flex; align-items: center; justify-content: center; height: 100vh">
    <?php echo "<p style='padding: 10px'>B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br></p>"; ?>
    <form method="POST" style="padding: 30px; border: 1px solid black; text-align: center">
    <h3>Reset Password</h3>
        <table>
            <tr>
                <th>OTP: </th>
                <td><input type="text" id="otp" name="otp" placeholder="OTP"/></td>
            </tr>
            <tr>
                <th>Password: </th>
                <td><input type="password" id="password" name="password" placeholder="Password"/></td>
            </tr>
            <tr>
                <th>Retype Password: </th>
                <td><input type="password" id="repassword" name="repassword" placeholder="Password"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="button" onclick="checkPass()" name="submit" value="Reset"/></td>
            </tr>
        </table>
    </form>
    <script>

        function checkPass() {
            if(document.getElementById('password').value  == document.getElementById('repassword').value) {
                resetPass(document.getElementById('otp').value, document.getElementById('password').value);
            } else {
                alert('Passwords do not match');
            }
        }
        function resetPass(otp, password) {
            var password = document.getElementById('password').value;
            var repassword = document.getElementById('repassword').value;
            var otp = document.getElementById('otp').value
            
            if(password != "" && otp != "" && repassword != "") {
                var xmlHttp = new XMLHttpRequest();
                xmlHttp.onreadystatechange = function() {
                    if(this.readyState == 4 && this.status == 200) {
                        if(this.responseText == '0') {
                            alert("Invalid OTP !!");
                        } else {
                            location.replace('index.php');
                        }
                    }   
                };
            
                xmlHttp.open("GET", "resetAction.php?otp=" + otp + "&pass=" + password, true);
                xmlHttp.send();
            }
        }
    </script>
</body>

</body>
</html>
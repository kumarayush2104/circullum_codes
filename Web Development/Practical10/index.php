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
    <title>Practical 10</title>
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
    <form method="POST" action="login.php" style="padding: 30px; border: 1px solid black; text-align: center">
    <h3>Login</h3>
        <table>
            <tr>
                <th>Email: </th>
                <td><input type="email" id='email' name="email" placeholder="abc@xyz.com"/></td>
            </tr>
            <tr>
                <th>Password: </th>
                <td><input type="password" name="password" placeholder="Password"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="button" id='forpass' name="forPass" onclick="resetPass(document.getElementById('email').value)" value="Forget Password"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"  id='login' name="submit" value="Login"/></td>
            </tr>
        </table>
    </form>
    <script>
        function resetPass(name) {
            if(name != "") {
                document.getElementById('login').setAttribute('disabled', '');
                document.getElementById('forpass').setAttribute('disabled', '');
                var xmlHttp = new XMLHttpRequest();
                xmlHttp.onreadystatechange = function() {
                    if(this.readyState == 4 && this.status == 200) {
                        if(this.responseText == 0) {
                            alert("No such username exists !!");
                        } else {
                            location.replace('reset_password.php');
                        }           
                    }   
                };
                
                document.getElementById('login').removeAttribute('disabled');
                document.getElementById('forpass').removeAttribute('disabled');
                xmlHttp.open("GET", "forPass.php?email=" + name, true);
                xmlHttp.send();
            }
        }
    </script>
</body>
</html>
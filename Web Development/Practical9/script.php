<?php
/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/
    session_start();
    include "sendmail.php";
    $mail->addAddress($_REQUEST['email']);
    $otp = rand(100000, 999999);
    $_SESSION['otp'] = $otp;
    $_SESSION['tmp_data'] = $_POST;
    $mail->Body = 'Your OTP for account verification '.$otp;
    $mail->send();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Confirm</title>
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
        flex-direction: column;
    }

    table {
        padding: 0px 20px;
        border-spacing: 10px;
    }

    form {
        border: 1px solid black;
    }
</style>
<body>
    <?php echo "<p style='padding: 10px'>B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br></p>"; ?>
    <form  method='POST'>
        <h3>Confirm your account</h3>
        <table>
            <tr>
                <th>OTP: </th>
                <td><input type="text" name="otp" id='otp' placeholder="Enter OTP"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="button" id='reg' onclick="registration(document.getElementById('otp').value)" value="Confirm"></td>
            </tr>
            <tr>
                <td colspan="2" id='error'></td>
            </tr>
        </table>
    </form>
    <script>
        function registration(otp) {
            if(otp != "") {
                //document.getElementById('reg').setAttribute('disabled', '');
                var xmlHttp = new XMLHttpRequest();
                xmlHttp.onreadystatechange = function() {
                    if(this.readyState == 4 && this.status == 200) {
                        if(this.responseText == 1) {
                            alert('Registration Successful');
                        } else {
                            document.getElementById('error').innerHTML = "Invalid OTP";
                        }
                    }   
                };
                
                //document.getElementById('reg').removeAttibute('disabled');
                xmlHttp.open("GET", "verify.php?otp=" + otp, true);
                xmlHttp.send();
            }
        }
    </script>
</body>
</html>
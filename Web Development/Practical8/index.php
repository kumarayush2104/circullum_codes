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
    <title>Practical 8</title>
</head>
<body>
    <?php echo "B.Tech Computer Science and Engineering<br>Ayush Kumar<br>20210103510253<br>"; ?>
    <p>JPG, PHP, PDF (&lt;=400KB only)</p>
    <form action="script.php" method="POST" enctype="multipart/form-data">
        <input type="file" name="myFile"><br><br>
        <input type="submit" value="Submit"><br><br>
    </form>
</body>
</html>
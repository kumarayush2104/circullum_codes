<?php

/*
    B.Tech Computer Science and Engineering
    Ayush Kumar
    20210103510253
*/  

    $mime = ['application/pdf', 'image/png', 'application/x-php'];
    if(in_array($_FILES['myFile']['type'], $mime) && $_FILES['myFile']['size'] <= 400*1024) {
        move_uploaded_file($_FILES['myFile']['tmp_name'], "uploads/".$_FILES['myFile']['name']);
        header('Content-Disposition: attachment; filename="'.$_FILES['myFile']['name'].'"');
        readfile("uploads/".$_FILES['myFile']['name']);
    } else {
        echo "Check your file and try again<br>";
        echo "<br><a href='index.php'><Button>Back</Button></a><br>";
    }
?>
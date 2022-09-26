<?php
    $mime = ['application/pdf', 'image/png', 'application/x-php'];
    if(in_array($_FILES['myFile']['type'], $mime) && $_FILES['myFile']['size'] <= 400*1024) {
        move_uploaded_file($_FILES['myFile']['tmp_name'], "uploads/".$_FILES['myFile']['name']);
        foreach($_FILES['myFile'] as $key => $value) {
            echo $key.': '.$value."<br>";
        }
        echo "<br><a href='uploads/".$_FILES['myFile']['name']."'><button>Download</button><br>";
    } else {
        echo "Check your file and try again<br><br>";
    }
?>
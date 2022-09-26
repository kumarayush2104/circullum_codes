<?php
/*
B.Tech Computer Science and Engineering
Ayush Kumar
202103103510253
*/
    echo "B.Tech Computer Science and Engineering<br>AyushKumar<br>202103103510253<br>";
    if(array_key_exists("where", $_GET)) {
        switch($_GET["where"]) {
            case 1:
                echo "You are in First Quadrant";
                break;
            case 2:
                echo "You are in Second Quadrant";
                break;
            case 3:
                echo "You are in Third Quadrant";
                break;
            case 4:
                echo "You are in Fourth Quadrant";
                break;
            default:
                echo "You should not be there !";
                break;
        }
    }
?>
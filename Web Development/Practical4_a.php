<?php
/*
    B.Tech Computer Science and Technology
    Ayush Kumar
    202103103510253
*/
    $users = [101 => "Ayush Kumar", 201 => "Balkrishna Mehta", 401 => "Neel Patel", 501 => "Jay Patel"];
    $employees = [101 => "Dhruv Patel", 201 => "Neel Patel", 301 => "Jeel Desai"];
    
    echo "Users those are not employees:\n";
    
    foreach (array_diff($users, $employees) as $value) {
        echo "- ",$value, "\n";
    }
    
    echo "\n\nEmployees those are not users:\n";
    
    foreach (array_diff($employees, $users) as $value) {
        echo "- ",$value, "\n";
    }
?>

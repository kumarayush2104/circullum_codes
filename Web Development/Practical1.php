<?php
/*
	B.Tech Computer Science and Engineering
	Ayush Kumar
	20210103510253
*/
	echo "\n\nInteger\n";
	$num = PHP_INT_MAX; // Integer
	var_dump(is_int($num));

	echo "\n\nBoolean\n";
	$isTrue = true; // Boolean
	var_dump($isTrue);

	echo "\n\nFloat\n";
	$flt2 = 2.9e890; // Float
	var_dump(is_infinite($flt2));

	echo "\n\nString\n";
	$str1 = "8921.12"; // String
	var_dump((float)$str1);

	echo "\n\nObject\n";
	class work {}
	$workInstance = new work();
	var_dump($workInstance);

	echo "\n\nCase-Sensitive\n";
	define("PI", 3.14); // Defining constant
	echo PI, "\n";

	echo "\n\nCase-inSensitive\n";
	define("casePI", 3.14, true); // Defining case-insensitive constant
	echo casePI, "\n";
	echo casePI, "\n";
?>

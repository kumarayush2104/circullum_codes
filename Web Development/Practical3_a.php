<?php
/*
	B.Tech Computer Science and Engineering
	Ayush Kumar
	20210103510253

*/
	$i = 3;
	$term1 = 0;
	$term2 = 1;
	$nextTerm = $term1 + $term2;
	echo "Fibonacci Series: ", $term1, " ", $term2;
	do {
		echo " ", $nextTerm;
		$term1 = $term2;
		$term2 = $nextTerm;
		$nextTerm = $term1 + $term2;
		++$i;
	} while($i <= 20);
	echo "\n";
?>

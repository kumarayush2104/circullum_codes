<?php
/*
	B.Tech Computer Science and Engineering
	Ayush Kumar
	20210103510253

*/
	$limit = readline("Enter range of prime number: ");
	pattern($limit);

	function pattern(int $limit) {
		$sum = 0;
		$i = 2;
		do {
			$j=2;
			$key = 0;
			do {
				if($i == 2) break;
				elseif($i % $j == 0) {
					$key=1;
					break;
				}
			$j++;
			} while($j < $i);
			if($key == 0) {
				$sum += $i;
			}
			$i++;
		} while($i < $limit);
		echo "Sum of Prime Numbers between 1 to ", $limit, ": ", $sum, "\n";
	}
?>

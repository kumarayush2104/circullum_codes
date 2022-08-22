<?php
	$coef = 1;
	$i = 0;
	do {
		$j = 0;
		$space = 0;
		do {
			echo "  ";
			$space++;
		}while($space <= 5-$i);

		do {
			if ($j == 0 || $i == 0) $coef = 1;
			else
		            $coef = $coef * ($i - $j + 1) / $j;
			echo "   ", $coef;
			$j++;
		} while($j <=$i);
		echo "\n";
		$i++;
	} while($i<5);
?>

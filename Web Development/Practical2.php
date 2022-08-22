<?php
/*
	B.Tech Computer Science and Engineering
	Ayush Kumar
	202103103510253

*/

	$result = [[],[],[]];

	for($i = 0; $i < 3; $i++) {
		printf("\n\nEnter result of %d student\n", ($i+1));
		for($j = 0; $j < 3; $j++) {
			$result[$i][$j] = readline("Enter Result: ");
		}
	}
		

	function selectStudent($choice) {
		global $result;
		switch($choice) {
			case "1":
				$avg = ($result[0][0] + $result[0][1] + $result[0][2])/3;
				checkGrade($avg);
				break;
			case "2":
				$avg = ($result[1][0] + $result[1][1] + $result[1][2])/3;
				checkGrade($avg);
				break;
			case "3":
				$avg = ($result[2][0] + $result[2][1] + $result[2][2])/3;
				checkGrade($avg);
				break;
			default:
				echo "Student doesn't exist\n";
		}
	}

	function checkGrade($avg) {
		if($avg > 80) {
			echo "You got A grade\n";
		} elseif(80 > $avg || $avg > 60) {
			echo "You got B grade\n";
		} elseif(60 > $avg || $avg > 40) {
			echo "You got C grade\n";
		} else {
			echo "You got D grade\n";
		}
	}
	
	$roll = readline("Enter your roll no.: ");
	selectStudent($roll);
?>

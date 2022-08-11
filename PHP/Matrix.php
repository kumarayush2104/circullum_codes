<?php
	$mat1 = [[],[],[]]; 
    $mat2 = [[],[],[]];
    $out=0;
    
    $i=0;
	printf("\n\t\tMatrix-1\n");
	do {
    	$j = 0;
    	do{
			$mat1[$i][$j] = readline("Enter element: ");
            $j++;
		} while($j<3);
    $i++;
	} while($i<3);
    
	$i=0;
	printf("\n\t\tMatrix-2\n");
	do {
    	$j = 0;
    	do{
			$mat2[$i][$j] = readline("Enter element: ");
            $j++;
		} while($j<3);
    $i++;
	} while($i<3);
    
    $i=0;
	printf("\n\t\tMatrix-1\n");
	do {
    	$j=0;
		printf("| ");
		do {
			if($mat1[$i][$j]<10) printf("0");
			printf("%d ", $mat1[$i][$j]);
            $j++;
		} while($j < 3);
		printf("|\n");
        $i++;
	} while($i<3);
    
	$i=0;
	printf("\n\t\tMatrix-2\n");
	do {
    	$j=0;
		printf("| ");
		do {
			if($mat2[$i][$j]<10) printf("0");
			printf("%d ", $mat2[$i][$j]);
            $j++;
		} while($j < 3);
		printf("|\n");
        $i++;
	} while($i<3);
    
    $i=0;
	printf("\n\t\tMatrix Multiplication\n");
	do {
    	$j = 0;
		printf("| ");
		do {
        	$k = 0;
			do {
				$out = $out + $mat1[$i][$k]*$mat2[$k][$j];
                $k++;
			} while($k<3);
			printf("%d ", $out);
			$out=0;
            $j++;
		}while($j<3);
		printf("|\n");
        $i++;
	} while($i<3);
?>

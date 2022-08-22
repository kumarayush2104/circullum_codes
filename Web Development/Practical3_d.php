<?php
/*
	B.Tech Computer Science and Engineering
	Ayush Kumar
	20210103510253

*/
	$userlist = [];

	for($i = 0; $i < 5; $i++) {
		echo "User", ($i+1), "\n";
		$username = readline("Enter Username: ");
		$password = readline("Enter Password: ");

		array_push($userlist, [$username => $password]);
		echo "\n";
	}

	foreach($userlist as $i) {
		print_r($i);
	}
?>

<!--B.Tech Computer Science and Engineering-->
<!--Ayush Kumar-->
<!--202103103510253-->
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>Practical 5-a</title>
</head>
<body style="text-align: center; font-family:sans-serif">
<?php echo "B.Tech Computer Science and Engineering<br>Ayush
Kumar<br>202103103510253<br>"; ?>
<h3>User Details</h3>
<form method="post" action="submit.php" enctype="multipart/form-data">
<input type="text" placeholder="Enter your name" name="Name:"/> <br />

<br />

<input type="tel" placeholder="Enter your contact number"

name="Contact Number:"/> <br /><br />

<input type="email" placeholder="Enter your email address" name="Email

Address:"/> <br /><br />

<input type="text" max="65" min="18" placeholder="Enter your age"

name="Age:"/> <br /><br />

<input type="radio" value="Male" name="Gender:" /><label>Male </label>

<input type="radio" value="Female" name="Gender:" /> <label> Female
</label><br /><br />

<textarea placeholder="Enter your address" name="Address:">

</textarea><br /><br />

<input type="checkbox" required/><label>You agree to our term and

conditions</label><br /><br />

<input type="checkbox" /><label>You would like to join our user

improvement program</label> <br /><br />

<label>Select your profile picture: </label><input type="file"

accept=".jpeg, .png" name="picture"/> <br /> <br />

<input type="submit" value="Submit" /> <input type="reset"

value="Reset" />
</form>
</body>
</html>
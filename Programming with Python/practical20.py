# B.Tech Ccomputer Science and Engineering
# Ayush Kumar
# 202103103510253

while(1):
	try:
		opr=input("This program will throw exception and quit while entering anything other than integer: ")
		int(opr)
	except ValueError:
		print("Enter a valid number, Press ctrl+c to quit the loop")
	except KeyboardInterrupt:
		print("")
		break


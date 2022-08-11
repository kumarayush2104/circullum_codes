# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

fileName = input("Enter Filename: ")
file = open(fileName, "r")
lines = file.readlines()
opr = int(input("Enter Number of lines to be printed: "))

for i in range(opr+1):
	if(lines[i] == "\n"):
		continue
	print(lines[i], end="")


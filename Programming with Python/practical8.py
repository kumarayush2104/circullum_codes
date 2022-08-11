# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

lst = []
while(1):
	num = input("Enter number (enter exit to quit): ")
	if num=="exit": break;
	try:
		lst.append(int(num))
	except:
		print("Enter a valid number")


def func(*lst):
	large = lst[0]
	small = lst[0]
	for i in range(len(lst)):
		if large < lst[i]: large = lst[i]
		if small > lst[i]: small = lst[i]
	return "Largest Number: " + str(large) + "\nSmallest Number: " + str(small)


print(func(*lst))

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
while(1):
    if(len(lst)==0):
        break
    for i in lst:
        print(i, "occurs", lst.count(i), "times.")
        for j in range(lst.count(i)):
            lst.remove(i)

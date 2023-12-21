# B.Tech Computer Science and Engineering
# Ayush Kumar
# 2021031035101253

print("Create a new List")
my_list = list()
print(my_list, end="\n\n")

print("Append items in the list")
my_list.append(1)
my_list.append(2)
my_list.append(3)
my_list.append(3)
print(my_list, end="\n\n")

print("Join another list with th existing list")
my_list.extend([4, 5, 6])
print(my_list, end="\n\n")

print("Insert an item in middle of the list")
my_list.insert(2, 190)
print(my_list, end="\n\n")

print("Sort the list")
my_list.sort()
print(my_list, end="\n\n")

print("Reverse the list")
my_list.reverse()
print(my_list, end="\n\n")

print("Number of items in the list:", len(my_list), end="\n\n")

print("Number of 3 in the list:", my_list.count(3), end="\n\n")

print("Remove last item of the list")
my_list.pop()
print(my_list, end="\n\n")

print("Removing an item from the specific index")
my_list.remove(2)
print(my_list, end="\n\n")

print("Checking item's index:", my_list.index(190), end="\n\n")

print("Clear all the elements of the list")
my_list.clear()
print(my_list)

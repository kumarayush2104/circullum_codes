# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

print("\nCreate of dictionary in python")
dict = { "name":"xyz", "age":18, "branch":"B.tech CSE" }
print(dict)

print("\nOverwriting of values (using index name)")
dict["name"] = "abc"
print(dict)

print("\ncopy(), copies the dictionary")
dict_cp = dict.copy()
print(dict_cp)

print("\nget(), used to find out element or value of the given index name")
print(dict.get("name"))

print("\nitems(), lists index names with its values/elements")
print(dict.items())

print("\nkeys(), prints indexes of the element")
print(dict.keys())

print("\npopitem(), removes last element of the dict")
dict.popitem()
print(dict)

print("\nvalues(), prints all the elements of the dictionary without their index name")
print(dict.values())

print("\nclear(), removes everything from the dictionary")
dict.clear()
print(dict)

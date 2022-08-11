# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

inp = int(input("Enter any number between 1 to 10: "))
if(inp<1 or inp>10):
    raise Exception("You are supposed to enter a number between 1 to 10")
else:
    for i in range(inp):
        print(i+1)

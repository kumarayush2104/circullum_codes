# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

punc = [ "!", "]", "[", ".", ",", "{", "}", "(", ")" ]
fname = input("Enter filename: ")
fopen = open(fname, "r")
fread = fopen.read()
for i in punc:
	fread = fread.replace(i, " ")

nowords = fread.split(" ")
for i in range(nowords.count("")):
	nowords.remove("")
print(nowords)
print(len(nowords))

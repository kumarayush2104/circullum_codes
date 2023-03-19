let myData = [1, 45, 2, 90, 23]

var large = myData[0]

for i in myData {
  if i > large {
    large  = i
  }
}

print(large)
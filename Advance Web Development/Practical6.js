var arr = Array()
for (let i = 0; i < 5; i++) {
  let number = prompt("Enter a number: ")
  if(number != "null") arr.push(parseInt(number))
}

arr.forEach((element) => {
  str = ""
  let num1 = 0
  let num2 = 1
  for(let i = 0; i < element; i++) {
    str += num1 + " "
    num2 += num1
    num1 = num2 - num1
  }
  console.log(str)
})
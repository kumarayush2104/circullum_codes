var arr = Array()
for (let i = 0; i < 5; i++) {
  let number = prompt("Enter a number: ")
  if(number != "null") arr.push(parseInt(number))
}

function iterative(element) {
  factorial = 1
  for(let i = 1; i <= element; i++) {
    factorial *= i
  }
  return factorial
}

function recursion(element) {
  if(element <= 1) {
    return 1
  } else {
    return element * recursion(element - 1)
  }
}

console.log(arr.map(iterative))


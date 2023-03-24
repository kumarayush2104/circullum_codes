var arr1 = [0, 1, 2, 3, 4, 5]
var arr2 = [6, 7, 8]

console.log(arr1.concat(arr2)) // [0, 1, 2, 3, 4, 5, 6, 7, 8]

for(let each of arr1.entries()) {
  console.log(each)
}

console.log(arr1.every((element) => {
  return element < 3
})) // false

console.log(arr1.filter((element) => {
  return element < 3
})) // [0, 1, 2]

console.log(arr1.find((element) => {
  return element > 3
})) // 4

console.log(arr1.findIndex((element) => {
  return element > 2
})) // 3

arr1.forEach((element) => {
  console.log(element)
})

console.log(arr1.includes(6)) // false

console.log(arr1.indexOf(3)) // 3

for(element of arr1.keys()) {
  console.log(element)
}

console.log(arr1.length) // 6

console.log(arr1.map((element) => {
  return element > 2
})) // [false, false, false, true, true]

arr1.pop()
console.log(arr1) // [0, 1, 2, 3, 4]

arr1.push(-1)
console.log(arr1) // [0, 1, 2, 3, 4, -1]

console.log(arr1.reverse()) // [-1, 4, 3, 2, 1, 0]

console.log(arr1.slice(0, 3)) // [-1, 4, 3]

console.log(arr1.some((element) => {
  return element > 2
})) // true

console.log(arr1.sort()) // [-1, 0, 1, 2, 3, 4]

console.log(arr1.toString()) // -1, 0, 1, 2, 3, 4

arr1.shift() // [0, 1, 2, 3, 4]
console.log(arr1)
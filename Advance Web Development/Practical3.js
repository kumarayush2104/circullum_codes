var date = new Date()

console.log(date.toString()) // Tue Feb 21 2023 10:45:17 GMT+0000 (Coordinated Universal Time)
console.log(date.getDate()) // 21
console.log(date.getDay()) // 2
console.log(date.getFullYear()) // 2023
console.log(date.getHours()) // 10
console.log(date.getMonth()) // 1
console.log(date.getSeconds()) // 17
console.log(date.getTime()) // 1676976405444
date.setDate(28)
date.setFullYear(2021)
date.setMonth(8)
console.log(date.toDateString()) // Tue Sep 28 2021
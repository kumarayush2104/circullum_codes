var string = "Hello JS"
var string2 = "         STRING         "

console.log(string.length) // 8
console.log(string.slice(0, 5)) // Hello
console.log(string.substring(0, 5)) // Hello
console.log(string.substr(0, 5)) // Hello
console.log(string.replace('H', "h")) // hello JS
console.log(string.replaceAll("l", "L")) // HeLLo JS
console.log(string.toUpperCase()) // HELLO JS
console.log(string.toLowerCase()) // hello js
console.log(string.concat("cript")) // Hello JScript
console.log(string2.trim()) // STRING
console.log(string2.trimStart()) // "STRING         "
console.log(string2.trimEnd()) // "         STRING"
console.log(string.padStart(15, "*")) // *******Hello JS
console.log(string.padEnd(15, "*")) // Hello JS*******
console.log(string.charAt(0)) // H
console.log(string.charCodeAt(0)) // 72
console.log(string.split(" ")) // [ 'Hello', 'JS' ]
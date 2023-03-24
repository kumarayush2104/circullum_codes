// Map Object

var mapObject = new Map()
mapObject.set("name", "UTU")
mapObject.set("place", "Bardoli")
mapObject.set("esttYear", "2011")

console.log(mapObject)
console.log(mapObject.get("name"))
console.log(mapObject.size)

mapObject.delete("place")
console.log(mapObject)

// Weak Map Object

var weakMapObject = new WeakMap()
var strObject = {name: "String"}
var intObject = {name: "Int"}
var objObject = {name: "Object"}

weakMapObject.set(strObject, "Hello World")
weakMapObject.set(intObject, 96)
weakMapObject.set(objObject, mapObject)

console.log(weakMapObject.get(strObject))
console.log(weakMapObject.delete(objObject))

// Typed Array

var arrayBuffer = new ArrayBuffer(16)
var x32Array = new Int32Array(arrayBuffer)
x32Array[0] = 0
x32Array[1] = 1
x32Array[2] = 2
x32Array[3] = 3
console.log(x32Array)
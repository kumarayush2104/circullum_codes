// Function internals

function internals() {
  console.log("This function is called by: ")
  console.log(internals.caller)
  console.log("with parameters: ")
  console.log(arguments)

  if(arguments.length === 1) return call(arguments[0])
  else return apply(arguments[0], arguments[1])
}

console.log(internals(10, 12))

// Apply

function rectangleArea(height, width) { 
  return height * width;
}

function apply(height, width) {
  return rectangleArea.apply(this, [height, width]);
}
console.log(apply(10, 10));

// Call

function circleArea(circumference) { 
  return Math.PI * circumference * circumference
}
function simpleCall(circumference) {
  return circleArea.call(this, circumference);
}
console.log(simpleCall(10))


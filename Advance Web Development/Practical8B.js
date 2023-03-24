function area() {
  if(arguments.length == 1) {
    return Math.PI * arguments[0] * arguments[0]
  } else if(arguments.length == 2) {
    return 0.5 * arguments[0] * arguments[1]
  }
}

console.log(area(2, 3))
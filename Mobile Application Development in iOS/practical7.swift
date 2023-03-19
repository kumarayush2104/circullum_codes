func printNumber(_ from: Int, _ to: Int) {
  var index = from
  while(index <= to) {
    print(index, terminator: " ")
    index += 1
  }
}

func printNumberWithRepeatWhileLoop(_ from: Int, _ to: Int) {
  var index = from
  repeat {
    print(index, terminator: " ")
    index += 1
  } while(index <= to)
}

printNumberWithRepeatWhileLoop(1, 10)
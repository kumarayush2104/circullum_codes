func factorial(_ number: Int) -> Int {
  if(number == 1) {
    return 1
  } else {
    return number * factorial(number - 1)
  }
}

func fibonacci(_ number: Int) -> Int {
  if (0...1).contains(number) {
    return number
  } else {
    return fibonacci(number - 1) + fibonacci(number - 2)
  }
}

for i in 0...10 {
  print(fibonacci(i), terminator: " ")
} 
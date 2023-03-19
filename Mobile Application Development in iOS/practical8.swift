func parityChecker(_ number: Int) -> Bool {
  return (number % 2 == 0)
}

func palindromeChecker(_ string: String) -> Bool {
  let sentence = string.lowercased()
  return (sentence == String(sentence.reversed()))
}

func primeNumberPrinter(_ from: Int, _ to: Int) {
  
  for i in from ... to {
    switch i {
      case ..<2: continue
      case 2:
        print("Prime Number Detected: \(i)")
        continue
      default:
        var key = true
        for j in 2 ..< i {
          if(i % j == 0) {
            key = false
            break
          }
        }
        if(key) {
          print("Prime Number Detected: \(i)")
        }
    }
  }
}

func floydTriangle(_ row: Int) {
  var count = 1
  for i in 1...row {
    for _ in 1...i {
      print(count, terminator: " ")
      count += 1
    }
    print("")
  }
}

floydTriangle(5)
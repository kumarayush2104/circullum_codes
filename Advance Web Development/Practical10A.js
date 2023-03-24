var student = {
  name: "David Rayy",
  sclass: "VI",
  rollno: 12
}

function generator(obj) {
  obj[Symbol.iterator] = function*() {
    yield* Object.keys(this)
  }

  return student[Symbol.iterator]()
}

function iterator(obj) {
  obj.keys = Object.keys(obj)
  obj.index = 0
  obj.next = function() {
    if(obj.index > obj.keys.length) {
      return "{ value: " + undefined + ", done: " + true + " }"
    } else {
      return "{ value: " + obj.keys[obj.index++] + ", done: " + false + " }"
    }
  }
  return obj
}


function Practical10() {
  let student = {}
  Object.defineProperties(student, {
    name: {
      value: "David Rayyy"
    },

    rollno_: {
      value: 12
    },

    sclass_: {
      value: "VI"
    },

    rollno: {
      set(value) {
        this.rollno_ = value
      },
      get() {
        return this.rollno_
      }
    },

    sclass: {
      get() {
        return this.sclass_
      }
    }
  })

  if (student.sclass == "4A") {
    console.log(student.rollno)
    student.rollno = 12
    console.log(student.rollno)
  }
}
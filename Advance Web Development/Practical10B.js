function Practical10() {
  let student = {name: "David Rayyy", rollno_: 12, sclass_: "VI"}
  Object.defineProperties(student, {
    rollno: {
      set(value) {
        this.rollno_ = value
      },
      get() {
        return this.rollno_
      }
    },

    sclass: {
      set(value) {
        this.sclass_ = value
      },
      get() {
        return this.sclass_
      }
    }
  })

  console.log(student)
  delete student.name
  student.sclass = "V"
  console.log(student)
}
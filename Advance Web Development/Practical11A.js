function Cylinder(height, radius) {
  this.height = height
  this.radius = radius
  this.volumne = () => {
    return Math.PI * radius * radius * height
  }
}

var cylinder1 = new Cylinder(12, 12)
console.log(cylinder1.volumne())
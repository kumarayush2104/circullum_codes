function Table(id, capacity) {
  this.id = id;
  this.capacity = capacity
}

Table.prototype.getTableId = function() {
  return this.id
}

Table.prototype.getTableCapacity = function() {
  return this.capacity
}

function Bill(tableId, tableCapacity, amount, tax) {
  Table.call(this, tableId, tableCapacity)
  this.amount = amount;
  this.tax = tax;
}

Bill.prototype = new Table();

Bill.prototype.getAmount = function() {
  return this.amount
}

Bill.prototype.getTaxes = function() {
  return this.tax
}

Bill.prototype.getBill = function() {
  return this.amount + (this.amount * (this.tax / 100))
}

function Tip(tableId, capacity, amount, tax) {
  Bill.call(this,tableId, capacity, amount, tax);
  if (this.getBill() < 5000) {
    this.tip = this.amount * 0.01;
  } else if (5000 > this.getBill() && this.getBill() < 10000) {
    this.tip = this.amount * 0.05;
  } else {
    this.tip = this.amount * 0.1;
  }
}

Tip.prototype = new Bill();

Tip.prototype.getTipDetails = function() {
  return this.tip;
}

Tip.prototype.getAllDetails = function() {
  return {
    tableId: this.getTableId(),
    tableCapacity: this.getTableCapacity(),
    amount: "$" + this.getAmount(),
    taxPercent: this.getTaxes() + "%",
    totalBill: "$" + this.getBill(),
    perPersonSplit: "$" + (this.getBill() / this.getTableCapacity()),
    totalTip: "$" + this.getTipDetails(),
    grandTotal: "$" + (this.getBill() + this.getTipDetails())
  }
}

let instance1 = new Tip("1221", 2, 1000, 18);
console.log(instance1.getAllDetails())


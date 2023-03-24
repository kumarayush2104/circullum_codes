function Bill() {
  var groceries = {
    discount: 0.1,
    tomato: 50,
    apple: 100,
  }

  var apparels = {
    discount: 0.2,
    shirt: 500,
    pant: 1000,
  }

  var accessories = {
    discount: 0.05,
    scissors: 50,
    watch: 500,
  }

  var gadgets = {
    discount: 0.5,
    television: 10000,
    laptop: 30000,
    mobile: 5000
  }

  var bill = (clothes.shirt * 10 + clothes.pant * 10) * clothes.discount
  var bill2 = accessories.scissors * 10 - ((accessories.scissors * 10) * accessories.discount)

  console.log(bill2)
}
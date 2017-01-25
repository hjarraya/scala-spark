package com.tophatdata.interview


/**
  * We have the following data model for our warehouse, a User has a name and
  * a list of orders. An order is composed of an ID and a list of products, where
  * a product is defined by an id, it has a price and an optional Category
  */

case class User(name: String, orders: List[Order])

case class Order(id: Int, products: List[Product])

case class Product(id: Int, price: Double, category: Option[String])


object ScalaInterview {

  val product1 = Product(1, 9.95, Some("electronic"))
  val product2 = Product(2, 15.00, Some("electronic"))
  val product3 = Product(3, 45.00, None)
  val product4 = Product(3, 45.00, Some("food"))

  val order1 = Order(1001, List(product1, product1))
  val order2 = Order(1001, List(product2))

  val bob = User("Bob", List(order1, order2))


  // 1- for an order1 get the total price
  // They need to solve it with map

  // 2- Given a User, get all distinct products?
  //solve with flatMap

  // 3- for a User calculate the total spent from our site
  // combination of map and flatMap

  // 4- for order1 get the total for category electronic
  // use filter

  // 5- for a given user group products in all orders by category => output Map[Category, List[Order]]
  // use groupBy, flatMap

}

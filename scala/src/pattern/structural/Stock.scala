package pattern.structural

class Stock(name: String, id: String, quantity: Int, price: Double, sector: String) extends Security(name, id, quantity, price) {
  override def description(): String = s"${super.description()}: ${sector}"
}

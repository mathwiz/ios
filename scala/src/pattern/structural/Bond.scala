package pattern.structural

class Bond(name: String, id: String, quantity: Int, price: Double, maturity: Int, btype: String) extends Security(name, id, quantity, price) {
  override def description()= {
    s"${btype} ${super.description()}"
  }
}

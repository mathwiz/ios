package pattern.structural

class Fund(name: String, id: String, quantity: Int, price: Double, family: String, sector: String, style: String) extends Security(name, id, quantity, price) {
  override def description() = {
    s"${family} ${super.description()}: ${sector} - ${style}"
  }
}


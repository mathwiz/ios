package pattern.structural

class Security(name: String, id: String, quantity: Int, price: Double) extends Asset(name, id) {
  override def value() = price * quantity

  override def containsSecurity(aSecurity: Asset): Boolean = aSecurity == this

  override def toString: String = s"${this.description()} $$${this.value()}"
}

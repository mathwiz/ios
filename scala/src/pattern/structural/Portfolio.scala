package pattern.structural

class Portfolio(name: String, id: String = "") extends CompositeAsset(name, id) {
  override def description(): String = {
    s"Portfolio: ${name}"
  }
}

package pattern.structural

class Account(name: String, id: String) extends CompositeAsset(name, id) {
  override def description(): String = {
    "Account: " + super.description()
  }
}

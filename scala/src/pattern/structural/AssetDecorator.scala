package pattern.structural

class AssetDecorator(val asset: Asset) extends Asset(name = "Decorator", id = "") {
  override def value() = {
    asset .value()
  }

  override def description() = {
    asset .description()
  }

  override def draw()= {
    asset .draw()
  }

  override def containerName()= {
    asset .containerName()
  }

  override def toString() = {
    println("toString in AssetDecorator " + asset .getClass())
    asset .toString()
  }
}

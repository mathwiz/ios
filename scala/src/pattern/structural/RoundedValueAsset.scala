package pattern.structural

class RoundedValueAsset(asset: Asset) extends AssetDecorator(asset) {
  override def value(): Double = {
    Math.round(asset .value())
  }

  override def toString(): String = {
    println("toString in RoundedValueAsset " + asset .getClass)
    asset .toString()
  }
}

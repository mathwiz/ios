package pattern.structural

class RoundedValueAsset(asset: Asset) extends AssetDecorator(asset) {
  override def value()= {
    Math.round(asset .value())
  }
}

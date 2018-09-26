package pattern.structural

class DrawableAsset(asset: Asset) extends AssetDecorator(asset) {
  override def draw() {
    println("drawing in Drawable " + asset .getClass())
    println(asset .toString())
  }
}

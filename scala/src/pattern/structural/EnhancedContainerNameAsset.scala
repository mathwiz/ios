package pattern.structural

class EnhancedContainerNameAsset(asset: Asset) extends AssetDecorator(asset) {
  override def containerName()= {
    s"The container of ${asset .name} is ${asset .containerName}"
  }

}

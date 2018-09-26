package pattern.structural

class CompositeAsset(name: String, id: String) extends Asset(name, id) {
  var assets = List[Asset]()

  def add(anAsset: Asset): Asset = {
    assets = assets :+ anAsset //just for this use. not performant
    anAsset.container = this
    this
  }

  def remove(anAsset: Asset) : Asset = {
    anAsset .container = null
    assets = assets .filter(_ == anAsset)
    this
  }

  override def value(): Double = {
    assets .foldLeft(0.0) { (sum, it) => sum + it.value() }
  }

  override def containsSecurity(aSecurity: Asset): Boolean = {
    assets .exists( it => it .containsSecurity(aSecurity) )
  }

  override def toString(): String = {
    assets .foldLeft(s"${this.description()} $$${this.value()}: ")
    { (str, it) => str + s"\n${it.padding()}|\n${it.padding()}+----" + it.toString() }
  }
}

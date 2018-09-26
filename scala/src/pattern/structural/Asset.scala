package pattern.structural

import pattern.SubclassResponsibility

class Asset(val name: String, val id: String) {
  var container: Asset = null

  def value() : Double = {
    throw new SubclassResponsibility()
  }

  def containsSecurity(aSecurity: Asset) : Boolean = {
    throw new SubclassResponsibility()
  }

  def description() : String = s"$name ($id)"

  def draw() = println(description())

  def depth() : Int = if (container == null) 0 else 1 + container.depth()

  def padding() : String = {
    (1 until depth() + 1) .foldLeft("") { (sum, it) => sum + "    " }
  }
}

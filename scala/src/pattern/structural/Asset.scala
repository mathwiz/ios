package pattern.structural

import pattern.SubclassResponsibility

class Asset(val name: String, val id: String) {
  var container: Asset = _

  def value() : Double = {
    throw SubclassResponsibility()
  }

  def containsSecurity(aSecurity: Asset) : Boolean = {
    throw SubclassResponsibility()
  }

  def description() : String = s"$name ($id)"

  def draw() : Unit = println(description())

  def depth() : Int = if (container == null) 0 else 1 + container.depth()

  def padding() : String = {
    (1 until depth() + 1) .foldLeft("") { (sum, it) => sum + "    " }
  }

  def containerName(): String = {
    if (container == null) "" else name
  }
}

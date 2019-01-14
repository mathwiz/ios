package sample

object Patterns {
  def main(args: Array[String]) : Unit = {
    args(0) match {
      case "composite" => CompositeExample1.doIt()
      case "decorator" => DecoratorExample1.doIt()
      case _ => println(args(0) + " not found")
    }
  }
}
 
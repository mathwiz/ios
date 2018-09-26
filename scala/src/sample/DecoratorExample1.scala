package sample

import pattern.structural._

object DecoratorExample1 {
  val apple = new Stock(name="AAPL", id="CUSIP32382", quantity=2, price=222.42, sector="Technology - Devices")
  val amazon = new Stock(name="AMZN", id="CUSIP30082", quantity=1, price=1955.95, sector="Technology - Internet")
  val treasury = new Bond(name="30 Year", id="CUSIP997", quantity= 1000, price= 9.324, maturity= 360, btype= "US Government")
  val sp500 = new Fund(name="SP500 Index", id="CUSIP00021", quantity= 200, price= 32.00, family= "Vanguard", sector= "Index", style= "Large Cap")
  val retirement = new Account(name= "IRA", id="Ret323")
  val trading = new Account(name= "Brokerage", id="Broke323")
  val portfolio = new Portfolio(name= "Yohan's Portfolio")

  def init(): Unit = {
    retirement.add(treasury)
    retirement.add(sp500)
    trading.add(apple)
    trading.add(amazon)
    portfolio.add(retirement)
    portfolio.add(trading)
  }

  def doIt() : Unit = {
    init()
    portfolio .draw()
    println()

    def enhanced = new DrawableAsset(asset= portfolio)
    enhanced .draw()
    println()

    def better = new RoundedValueAsset(asset= trading)
    println("Class of decorator: " + better .getClass())
    better .draw()
    println(better .value())
    println()

    def morebetter = new DrawableAsset(asset= better)
    println(better .getClass())
    println(morebetter .getClass())
    morebetter .draw() //does not do rounding. why?
    println()

    def wrapping = new EnhancedContainerNameAsset(asset= trading)
    def morewrapping = new RoundedValueAsset(asset= wrapping)
    def otherway = new EnhancedContainerNameAsset(asset= new RoundedValueAsset(asset= trading))
    println(trading .containerName() + ". value: " + trading .value())
    println(wrapping .containerName() + ". value: " + wrapping .value())
    println(morewrapping .containerName() + ". value: " + morewrapping .value())
    println(otherway .containerName() + ". value: " + otherway .value())
    println()
  }

}

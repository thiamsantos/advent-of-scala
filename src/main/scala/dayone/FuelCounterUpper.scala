package dayone

import scala.collection.immutable.List
import scala.io.Source

class FuelCounterUpper(val modules: List[Module]) {
  def totalFuel: Int = {
    modules.map((module) => module.fuelRequired).sum
  }
  def totalFuelConsideringFuelMass: Int = {
    modules.map((module) => module.fuelRequiredConsideringFuelMass).sum
  }
}

object FuelCounterUpper {
  def fromFile(filepath: String): FuelCounterUpper = {
    val source = Source.fromFile(filepath)

    try {
      val modules = source.getLines().map((line) => new Module(line.toInt)).toList

      new FuelCounterUpper(modules)
    } finally {
      source.close()
    }
  }
}

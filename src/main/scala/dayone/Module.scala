package dayone

class Module(val mass: Int) {
  def fuelRequired: Int = new Mass(mass).fuelRequired

  def fuelRequiredConsideringFuelMass: Int = {
    calculateFuelConsideringFuelMass(mass, 0)
  }

  private def calculateFuelConsideringFuelMass(value: Int, acc: Int): Int = {
    val fuel = new Mass(value).fuelRequired

    if (fuel <= 0) return acc

    calculateFuelConsideringFuelMass(fuel, acc + fuel)
  }
}

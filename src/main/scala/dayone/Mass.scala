package dayone

class Mass(val mass: Int) {
  def fuelRequired: Int = {
    val fuel = mass / 3

    if (fuel <= 0) return 0

    fuel - 2
  }
}

package dayone

import org.scalatest.FunSpec

class MassSpec extends FunSpec {
  describe("fuelRequired") {
    it("returns the fuel required for the given mass") {
      assert(new Mass(0).fuelRequired === 0)
      assert(new Mass(2).fuelRequired === 0)
      assert(new Mass(12).fuelRequired === 2)
      assert(new Mass(14).fuelRequired === 2)
      assert(new Mass(1969).fuelRequired === 654)
      assert(new Mass(100756).fuelRequired === 33583)
    }
  }
}

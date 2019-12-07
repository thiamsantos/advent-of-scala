package dayone

import org.scalatest.FunSpec

class ModuleSpec extends FunSpec {
  describe("fuelRequired") {
    it("returns the fuel required for the module to launch") {
      assert(new Module(0).fuelRequired === 0)
      assert(new Module(2).fuelRequired === 0)
      assert(new Module(12).fuelRequired === 2)
      assert(new Module(14).fuelRequired === 2)
      assert(new Module(1969).fuelRequired === 654)
      assert(new Module(100756).fuelRequired === 33583)
    }
  }

  describe("fuelRequiredConsideringFuelMass") {
    it("returns the fuel required by added mass of the fuel") {
      assert(new Module(0).fuelRequiredConsideringFuelMass === 0)
      assert(new Module(2).fuelRequiredConsideringFuelMass === 0)
      assert(new Module(12).fuelRequiredConsideringFuelMass === 2)
      assert(new Module(14).fuelRequiredConsideringFuelMass === 2)
      assert(new Module(1969).fuelRequiredConsideringFuelMass === 966)
      assert(new Module(100756).fuelRequiredConsideringFuelMass === 50346)
    }
  }
}

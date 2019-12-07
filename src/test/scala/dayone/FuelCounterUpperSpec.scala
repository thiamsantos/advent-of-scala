package dayone

import org.scalatest.FunSpec
import scala.collection.immutable.List

class FuelCounterUpperSpec extends FunSpec {
  describe("totalFuel") {
    it("returns the total fuel requirement of all modules") {
      val modules = List(new Module(12), new Module(14), new Module(1969), new Module(100756))
      val fuelCounterUpper = new FuelCounterUpper(modules)

      assert(fuelCounterUpper.totalFuel === 34241)
    }
  }

  describe("totalFuelConsideringFuelMass") {
    it("returns the total fuel requirement of all modules considering fuel mass") {
      val modules = List(new Module(12), new Module(14), new Module(1969), new Module(100756))
      val fuelCounterUpper = new FuelCounterUpper(modules)

      assert(fuelCounterUpper.totalFuelConsideringFuelMass === 51316)
    }
  }

  describe("fromFile") {
    describe("totalFuel") {
      it("returns an instance from the value provided in the file") {
        val fuelCounterUpper = FuelCounterUpper.fromFile("static/day-one-input-test.txt")
        assert(fuelCounterUpper.totalFuel === 34241)
      }
      it("returns the correct result of the test") {
        val fuelCounterUpper = FuelCounterUpper.fromFile("static/day-one-input.txt")
        assert(fuelCounterUpper.totalFuel === 3246455)
      }
    }

    describe("totalFuelConsideringFuelMass") {
      it("returns an instance from the value provided in the file") {
        val fuelCounterUpper = FuelCounterUpper.fromFile("static/day-one-input-test.txt")
        assert(fuelCounterUpper.totalFuelConsideringFuelMass === 51316)
      }
      it("returns the correct result of the test") {
        val fuelCounterUpper = FuelCounterUpper.fromFile("static/day-one-input.txt")
        assert(fuelCounterUpper.totalFuelConsideringFuelMass === 4866824)
      }
    }
  }
}

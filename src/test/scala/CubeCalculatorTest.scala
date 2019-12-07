import org.scalatest.FunSpec

class CubeCalculatorTest extends FunSpec {
  describe("cube") {
    it("returns the cube of the given number") {
      assert(CubeCalculator.cube(3) === 27)
    }

    it("returns 0 when number is 0") {
      assert(CubeCalculator.cube(0) === 0)
    }
  }
}

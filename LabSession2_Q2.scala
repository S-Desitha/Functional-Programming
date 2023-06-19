object LabSession2_Q2 {
  def main(args: Array[String]): Unit = {

    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k : Float = 4.3f
    var g: Float = 4.0f

    println("Result A: " + ({b -= 1; b} * a + c * {d += 1; d-1}))
    println("Result B: " + ({a += 1; a-1}))
    println("Result C: " + (-2 * (g - k) + c))
    println("Result D: " + ({c+=1; c-1}))
    println("Result E: " + ({c += 1; c} * {a+=1; a-1}))

  }
}


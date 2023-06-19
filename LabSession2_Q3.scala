object LabSession2_Q3 {
  def main(args: Array[String]): Unit = {

    def salaryCalculation(workingHours: Int, oTHours: Int): Double = {
      val workingHourPayRate = 250
      val oTHourPayRate = 85
      val taxRate = 0.12

      val workingPay = workingHours * workingHourPayRate
      val oTPay = oTHours * oTHourPayRate
      val totalPay = workingPay + oTPay
      val taxPay = totalPay * taxRate
      val salary = totalPay - taxPay

      salary
    }

    println("Take home salary : " + salaryCalculation(40,30))

  }

}


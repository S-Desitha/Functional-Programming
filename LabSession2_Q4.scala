object LabSession2_Q4 {
  def main(args: Array[String]): Unit = {

    def ticketPriceCalculation(ticketPrice:Double): Double = {
      val basePrice = 15.0
      val baseAttendance = 120
      val cost = 500.0
      val attendanceCost = 3.0

      val attendanceChange = ((basePrice -ticketPrice)/ 5.0 * 20.0)
      val attendance = baseAttendance + attendanceChange
      val totalCost = cost + (attendance * attendanceCost)
      val profit = (ticketPrice * attendance) - totalCost

      profit
    }

    println("Profit : " + ticketPriceCalculation(20))

  }
}


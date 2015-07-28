// a + b + c = 1000
// a^2 + b^2 = c^2
// (1000 - a - b)^2 = a^2 + b^2
// ? a*b*c

object ProblemNine {
  def main(args: Array[String]) {
    println(pythTrip(1000))
  }
    
  def pythTrip(max: Int) : (Int, Int) =  {
    for (
      i <- 1 to max;
      j <- 1 to max
    ) { 
      if (math.pow(1000 - i - j,2) == math.pow(i,2) + math.pow(j,2)) {
        return (i , j)
      }     
    }
    return (0 , 0)
  }
}

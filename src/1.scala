object ProblemOne {
  def main(args: Array[String]) {
    println("Hello, world!")
    val multiples = getMultiples(999, Array(3,5))
    println(multiples.deep.mkString("\n"))
    println("Sum = " + multiples.reduceLeft(_+_))
  }

  def getMultiples(x: Int, factors: Array[Int]): Array[Int] = {
    return (1 to x).filter(y => factors.exists(factor => isMultiple(y, factor))).toArray
  }
 
  def isMultiple(multiple: Int, factor: Int) : Boolean = {
    if ((multiple % factor) == 0) {
      return true
    }
    return false
  }
}

import scala.collection.mutable.ListBuffer

object ProblemSix {
  def main(args: Array[String]) {
   println(squareSum(100) - sumSquare(100))
  }
  def sumSquare(n : Int) = (1 to n).map(x => math.pow(x,2)).reduceLeft(_+_).toInt
  
  def squareSum(n : Int) = math.pow((1 to n).reduceLeft(_+_),2).toInt
}

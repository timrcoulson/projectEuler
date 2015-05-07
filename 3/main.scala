import scala.collection.mutable.ListBuffer

// Solution pinched from https://pavelfatin.com/scala-for-project-euler/

object ProblemThree {
  def main(args: Array[String]) {
    val num = 600851475143L
    println(factors(num).last)
  }

  def factors(n: Long): List[Long] =
    (2 to math.sqrt(n).toInt).find(n % _ == 0)
    .map(i => i.toLong :: factors(n / i)).getOrElse(List(n))
}

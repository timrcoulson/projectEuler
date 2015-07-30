import scala.collection.mutable.ListBuffer

// Solution pinched from https://pavelfatin.com/scala-for-project-euler/

object ProblemTwentyThree {
  def main(args: Array[String]) {
    val ab = (1 to 28123).filter(isAbundant(_))

    val exc = ab.view.flatMap(a => ab.map(b => b + a))

    println((1 to 28123 diff exc).sum)

  }

  def divisers(n: Long): IndexedSeq[Int] = (1 to (n / 2).toInt).filter(n % _ == 0)
  def sumOfDivisors(n: Long): Long = divisers(n).foldLeft(0)(_ + _)
  def isAbundant(n: Long): Boolean = sumOfDivisors(n) > n

}

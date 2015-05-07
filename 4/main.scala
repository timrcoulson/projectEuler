import scala.collection.mutable.ListBuffer

object ProblemFour {
  def main(args: Array[String]) {
    val min = 100
    val max = 999
    val pal = (min to max).map(x => (min to max).map(y => y*x).filter(z => isPalindrome(z))).filter(z => !z.isEmpty).map(z => z.last).sorted.last
    println("Largest palindrome = " + pal)
  }

  def isPalindrome(n: Int) : Boolean = {
    if (n.toString.reverse == n.toString) {
      return true
    }
    return false
  }
}

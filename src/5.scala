import scala.collection.mutable.ListBuffer

object ProblemFive {
  def main(args: Array[String]) {
    val max = 20
    println(rec(1,1,20))
  }

  def leastCommMult(x: Int, y:Int) = Stream.from(x).filter(z => z % x ==0 && z % y ==0).head

  def rec(n: Int, factor: Int, limit: Int) : Int = {
    if (factor <= limit) {
      return rec(leastCommMult(n,factor), factor + 1, limit)
    }
    return n
  }
}

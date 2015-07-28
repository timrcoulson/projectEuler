/**
 * @author timcoulson
 */
object ProblemTwelve {
  def main(args: Array[String]) {
    // 1, 2, 3, ...

    val naturals = Stream.from(1)

    def sumUp(s: Stream[Int], acc: Long = 0): Stream[Long] =
      Stream.cons(s.head + acc, sumUp(s.tail, s.head + acc))

    def factors(n: Long) : IndexedSeq[Int] = 
      (2 to math.sqrt(n).toInt).filter(n % _ == 0)
      
    def numOfDivisors(n : Long ) : Int = factors(n).size * 2 + 1

    def isMultiple(multiple: Long, factor: Long): Boolean = {
      if ((multiple % factor) == 0) {
        return true
      }
      return false
    }
        
    println(sumUp(naturals, 0).find { x => numOfDivisors(x) > 500 }.get) }
}
/**
 * @author timcoulson
 */
object ProblemFourteen {
  def main(args: Array[String]) {
    def collatz(n: Long) : Long = {
      if (n % 2 == 0) {
        return (n/2)
      } else {
        return (3*n + 1)
      }
    }
    
    def collatzSeq(n: Long, acc: Long) : Long = {
      if (n != 1) {
        return collatzSeq(collatz(n), acc + 1);
      }
      return acc;
    } 
    println((1 to 1000000).maxBy(x => collatzSeq(x,0)))
  }
}
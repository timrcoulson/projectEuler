import scala.collection.mutable.ArrayBuffer

object ProblemTwo {
  def main(args: Array[String]) {
    println(fib(1, 4000000).filter(x => isMultiple(x,2)).reduceLeft(_+_))
  }

  def fib(start: Int, limit: Int) : ArrayBuffer[Int] = {
    var arr = ArrayBuffer(start, start)
    var last = start
    while ( arr.last < limit ) {
      arr += arr(arr.length - 1) + arr(arr.length - 2) 
    }
    return arr
  }
 
  def isMultiple(multiple: Int, factor: Int) : Boolean = {
    if ((multiple % factor) == 0) {
      return true
    }
    return false
  }
}

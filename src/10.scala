import scala.collection.mutable.ArrayBuffer

object ProblemTen {
  def main(args: Array[String]) {
    println(genPrimes(2000000))
  }

  def genPrimes(limit: Int) : Int =  { 
    var i = 0;
    var arr = ArrayBuffer[Int](2)
    while(true){
      i += 1
      val prime = Stream.from(arr(i-1)).filter(x => !arr.exists(prime => x % prime ==0))(0)
      if (limit <  prime) {
        return arr.reduceLeft(_+_)
      }
      println(prime)
      arr += prime
    }
    return 0
  }
}

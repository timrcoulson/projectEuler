import scala.collection.mutable.ArrayBuffer

object ProblemSeven {
  def main(args: Array[String]) {
    println(genPrimes(10001))
  }

  def genPrimes(limit: Int) : Int =  { 
    var i = 0;
    var arr = ArrayBuffer[Int](2)
    while(i < limit - 1){
      i += 1
      arr += Stream.from(arr(i-1)).filter(x => !arr.exists(prime => x % prime ==0))(0)
    }
    arr(i)
  }
}

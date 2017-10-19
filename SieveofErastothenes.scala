object main {

  def main(args: Array[String]):Unit = {
    getPrimes(100)
    
  }
  
  def primecalc(N: Int): Array[Int] = {
    val arr: Array[Int] = Array.ofDim[Int](N + 1)
    var i: Int = 2
    while (i <= Math.sqrt(N)) {
      if (arr(i) == 0) {
        var j: Int = i * i
        while (j <= N) {
          arr(j) = 1
          j += i
        }
      }
      { i += 1; i - 1 }
    }
    arr
  }
  def getPrimes(N: Int): Unit = {
    val primes: Array[Int] = primecalc(N)
    display(primes)
  }
  def display(primes: Array[Int]): Unit = {
    System.out.print("\nPrimes = ")
    for (i <- 2 until primes.length if primes(i) == 0)
      System.out.print(i + " ")
    println()
  }
}
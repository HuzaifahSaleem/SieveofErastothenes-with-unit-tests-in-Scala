import org.scalatest.{Matchers, FunSuite}

class SieveTest extends FunSuite with Matchers {
  test("small primes") {
    SieveofErastothenes.getPrimes(10) should be (List(2, 3, 5, 7))
  }

  test("primes up to 11") {
    SieveofErastothenes.getPrimes(11) should be (List(2, 3, 5, 7, 11))
  }

  test("first thousand primes") {
    SieveofErastothenes.getPrimes(7919).size should be (1000)
  }
}
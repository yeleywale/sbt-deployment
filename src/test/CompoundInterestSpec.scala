import org.scalatest.{FlatSpec, Matchers}

class CompoundInterestSpec extends FlatSpec with Matchers {
   "A compound Interest Calculator" should "return more than 62000 in return" in {
       Networth.calculate(5000, 5, 10) should be (6.046617E10)
   }
}
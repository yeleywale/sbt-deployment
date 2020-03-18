import org.scalatest.{FlatSpec, Matchers}

class NetWorthSpec extends FlatSpec with Matchers {
   "A networth Calculator" should "return 500" in {
       Networth.calculate(1000, 500) should be (500)
   }

   "A networth Calculator" should "return 5000" in {
       NetWorth.calculate(10000, 5000) should be (5000)
   }
}
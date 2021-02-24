import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ClosureSpec extends AnyFlatSpec with Matchers
{
    "Closure" should "calculate simple interest using free variables" in
    {
        val simpleInterest = 20
        assert(Closure.calcSimpleInterest(10000) == simpleInterest)
    }
}

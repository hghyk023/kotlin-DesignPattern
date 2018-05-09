import ChainOfResponsibility.*

/**
 * main関数
 */
fun main(args: Array<String>) {
    /* Observerパターン */
//    var generator = RandomNumberGenerator()
//    var observer1 = DigitObserver()
//    var observer2 = GraphObserver()
//    generator.addObserver(observer1)
//    generator.addObserver(observer2)
//    generator.execute()
    /* Chain of Responsibilityパターン */
    var alice   = NoSupport("alice")
    var bob     = LimitSupport("bob", 100)
    var charlie = SpecialSupport("charlie", 429)
    var diana   = LimitSupport("diana", 200)
    var elmo    = OddSupport("elmo")
    var fred    = LimitSupport("fred", 300)
    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred)
    for (i in 0 .. 500 step 33) {
        alice.support(Trouble(i))
    }
}
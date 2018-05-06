import Observer.DigitObserver
import Observer.GraphObserver
import Observer.RandomNumberGenerator

/**
 * main関数
 */
fun main(args: Array<String>) {
    /* Observerパターン */
    var generator = RandomNumberGenerator()
    var observer1 = DigitObserver()
    var observer2 = GraphObserver()
    generator.addObserver(observer1)
    generator.addObserver(observer2)
    generator.execute()
}
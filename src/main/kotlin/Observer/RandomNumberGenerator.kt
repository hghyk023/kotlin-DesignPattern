package Observer

import java.util.*

class RandomNumberGenerator : NumberGenerator() {
    var random = Random()
    private var number = 0
    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        for (i in 0 until 50) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}
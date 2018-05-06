package Observer

class GraphObserver : Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver:")
        for (i in 0 until generator.getNumber()) {
            print("*")
        }
        println("")
        Thread.sleep(100)
    }
}
package Observer

abstract class NumberGenerator {
    private var observers = mutableListOf<Observer>()
    fun addObserver(observer: Observer) = observers.add(observer)
    fun deleteObserver(observer: Observer) = observers.remove(observer)
    fun notifyObservers() {
        observers.forEach{
            it.update(this)
        }
    }
    abstract fun getNumber(): Int
    abstract fun execute()
}
package taskthree

class Publisher : Observable {
    private val _observers: MutableList<Observer> = mutableListOf()

    override fun subscribe(observer: Observer) {
        _observers.add(observer)
    }

    override fun unsubscribe(observer: Observer) {
        _observers.remove(observer)
    }

    fun publishMessage(message: String) {
        for(observer in _observers) {
            observer.update(message)
        }
    }
}
package taskthree

interface Observer {
    fun update(message: String)
}
interface Observable {
    fun subscribe(observer: Observer)
    fun unsubscribe(observer: Observer)
}
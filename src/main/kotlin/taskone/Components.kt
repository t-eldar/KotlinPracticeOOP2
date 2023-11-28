package taskone

interface Component {
    fun render(): String
}
class MainComponent(val string: String) : Component {
    override fun render(): String {
        return string
    }
}
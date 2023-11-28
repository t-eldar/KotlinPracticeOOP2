package taskfour

abstract class Component(val name: String) {
    abstract fun display()
}

class CompositeComponent(name: String) : Component(name) {
    private val _components = mutableListOf<Component>()
    fun add(component: Component) {
        _components.add(component)
    }
    fun remove(component: Component) {
        _components.remove(component)
    }
    override fun display() {
        println(name)
        for (component in _components) {
            component.display()
        }
    }
}

class BranchComponent(name: String) : Component(name) {
    override fun display() {
        println(name)
    }

}
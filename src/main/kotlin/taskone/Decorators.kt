package taskone

abstract class TextDecorator(private val component: Component) : Component {
    override fun render(): String {
        return component.render()
    }
}

class BoldDecorator(component: Component) : TextDecorator(component) {
    override fun render(): String {
        return "<b>${super.render()}</b>"
    }
}

class ItalicDecorator(component: Component) : TextDecorator(component) {
    override fun render(): String {
        return "<i>${super.render()}</i>"
    }
}
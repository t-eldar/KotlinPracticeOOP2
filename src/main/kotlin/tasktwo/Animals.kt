package tasktwo

abstract class Animal {
    abstract fun makeSound()
}

class Lion : Animal() {
    override fun makeSound() {
        println("Lion meow")
    }
}

class Tiger : Animal() {
    override fun makeSound() {
        println("Tiger meow")
    }
}

class AnimalFactory {
    fun createAnimal(kind: String): Animal {
        return when(kind.lowercase().trim()) {
            "tiger" -> Tiger()
            "lion" -> Lion()
            else -> throw Exception("Cannot create animal of type :${kind}")
        }
    }
}
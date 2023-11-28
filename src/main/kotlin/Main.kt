import taskfour.BranchComponent
import taskfour.CompositeComponent
import taskone.*
import taskthree.EmailNotification
import taskthree.Publisher
import taskthree.SMSNotification
import tasktwo.AnimalFactory

fun main(args: Array<String>) {
    // task one
    println("---------------------------------------------------------------------")

    val component = MainComponent("Hello")

    val boldMain = BoldDecorator(component)
    println("Bold main: ${boldMain.render()}")

    val italicMain = ItalicDecorator(component)
    println("Italic main: ${italicMain.render()}")

    val italicBoldMain = ItalicDecorator(boldMain)
    println("Italic bold main: ${italicBoldMain.render()}")

    val italicItalicBoldBoldMain = ItalicDecorator(
        ItalicDecorator(
            BoldDecorator(
                BoldDecorator(component)
            )
        )
    )
    println("Italic italic bold bold main: ${italicItalicBoldBoldMain.render()}")

    // task two
    println("---------------------------------------------------------------------")

//    val animalFactory = AnimalFactory()
//    println("Enter animal type: ")
//    var input = readln()
//    while (input.lowercase().trim() != "stop") {
//        try {
//            animalFactory.createAnimal(input).makeSound()
//        } catch (e: Exception) {
//            println("Error occurred! Details: ${e.message}")
//        }
//        input = readln()
//    }
//    println("Stopped successfully!")

    // task three
    println("---------------------------------------------------------------------")

    val publisher = Publisher()
    val emailNotification = EmailNotification()
    val smsNotification = SMSNotification()

    publisher.subscribe(emailNotification)
    publisher.subscribe(smsNotification)

    publisher.publishMessage("First message!")

    publisher.unsubscribe(emailNotification)

    publisher.publishMessage("Second message")

    // task four
    println("---------------------------------------------------------------------")

    val headOffice = CompositeComponent("headOffice")
    val region1 = CompositeComponent("region1")
    val region2 = CompositeComponent("region2")
    val branch1 = BranchComponent("branch1")
    val branch2 = BranchComponent("branch2")
    val branch3 = BranchComponent("branch3")

    headOffice.add(region1)
    headOffice.add(region2)

    region1.add(branch1)

    region2.add(branch2)
    region2.add(branch3)

    headOffice.display()
}
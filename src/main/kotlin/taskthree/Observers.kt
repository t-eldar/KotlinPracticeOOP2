package taskthree

class EmailNotification : Observer {
    override fun update(message: String) {
        println("Email received: $message")
    }
}

class SMSNotification : Observer {
    override fun update(message: String) {
        println("SMS received: $message")
    }
}
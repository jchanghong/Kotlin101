package Functions.Cascades

fun main(Args: Array<String>) {
    /* This call utilizes extension function and infix call. It is handy to deal with pesky Java object initializations */
    var superman = Superman() with {
        name = "Lux Luthor"
        punch()
        kick()
        sidekick = Spiderman() with {
            special()
        }
    }
}

infix fun <T> T.with(operations: T.() -> Unit): T {
    operations()
    return this
}

class Superman {
    var name: String = "Clark Kent"
    var sidekick: Sidekick = Robin()

    fun punch(): Unit = println("$name punches")
    fun fly(): Unit = println("$name flies")
    fun kick(): Unit = println("$name kicks")
}

interface Sidekick {
    fun special()
}

class Spiderman : Sidekick {
    var name: String = "Peter Parker"
    override fun special() = println("$name webs")
}

class Robin : Sidekick {
    var name: String = "Robin"
    override fun special() = println("$name is useless")
}

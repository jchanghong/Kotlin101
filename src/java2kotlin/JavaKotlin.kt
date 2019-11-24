package java2kotlin2

import org.jetbrains.annotations.NotNull

val top: String = "top kotlin"
const val ctop:String ="top const kotlin"

data class K1(var id:Int=0) {
    constructor(name: String) : this(1) {
        this.name = name
    }

    fun fun1(): Unit {
        println("kotlin fun")
    }
    var name: String="name"

    companion object {
        const val cname: String = "cname"
        val cname2: String = "cname2"
        fun cfun(): Unit {
            println("kotlin cfun")
        }
    }
}

fun @receiver:NotNull K1.efun(): Unit {
    println("kotlin e fun")
}
fun main() {
    println("kotlin manin")
    println(K1().name)
    K1().efun()
    println(K1("names").name)
    println(K1.cname+K1.cname2+K1.cfun())
}

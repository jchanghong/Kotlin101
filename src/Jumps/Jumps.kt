package Jumps

fun main() {

    printAgain@ println("print again")

    loop@ for (i in 1..50) {
        print("$i,")
        if (i == 25) {
            break@loop
        }
        if (i == 50) {
        }
    }
    println("")
    println("end of line")
}

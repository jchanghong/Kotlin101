package When

fun main() {
    var x = 101
    val greater = { x: Int -> x > 100 }

    //This is one hell of a flexible switch statement
   println( when {
        x in 1..50 -> ("In range")
        greater(x) -> ("Great")
        x == 50 -> ("Exact match")
        else -> ("Outside range")
    })
}

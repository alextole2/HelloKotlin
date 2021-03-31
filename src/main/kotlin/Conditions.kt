import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val x = input.nextInt()
    if (x < 10) {
        println("Value $x is minor than 10")
    } else if (x > 15) {
        println("Value $x is greater than 10")
    } else {
        println("Value $x is minor than 10 and greater than 15")
    }
    input.close()
}
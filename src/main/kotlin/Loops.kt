import java.util.*

fun samples() {
    println("------While-------")

    var value = 5
    while (value < 5) {
        println(value)
        value++
    }

    println("------Do While------")

    var value2 = 7
    do {
        println(value2)
        value2++
        println(value2)
    } while (value2 < 5)

    println("------For------")
    for (i in 10..100) {
        println(i)
    }
}

fun main() {

    fun div(int: Int) = when {
        int % 6 == 0 -> "$int its divided by 2 and 3"
        int % 2 == 0 -> "$int its divided by 2"
        int % 3 == 0 -> "$int its divided by 3"
        else -> "$int"
    }

    println("------normal------")
    for (i in 1..10) {
        println(div(i))
    }

    println("------downTo with step------")
    for (i in 10 downTo -10 step 5) {
        println(div(i))
    }

    println("------until with step------")
    for (i in 0 until 10 step 5) {
        println(div(i))
    }

    println("------list------")
    val list = listOf(1, "a", 3, "b", 5, "c", 7, "d")
    for (i in list) {
        println(i)
    }

    println("------set------")
    val set = listOf(2, 3, 4, 5, 6, 6, 6, 4, 2, 1)
    for (i in set) {
        println(i)
    }

    println("------string chars------")
    val name = "My name is...."
    for (i in name) {
        println(i)
    }

    println("------string indexs------")
    val name2 = "My name is...."
    for (i in name2.indices) {
        println(i)
    }

    println("------string indexs 2------")
    val name3 = "My name is...."
    for ((index, char) in name3.withIndex()) {
        println("$index == $char")
    }

    println("-----tree map------")
    val binaryList = TreeMap<Char, String>()
    for (char in 'a'..'z') {
        val binary = Integer.toBinaryString(char.toInt())
        binaryList[char] = binary
    }
    for ((letter, binary) in binaryList) {
        println("$letter = $binary")
    }
}
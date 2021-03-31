import Color.*
import java.lang.Exception

fun usingWhen(color: Color) = when (color) {
    RED -> RED.name
    GREEN -> GREEN.name
    BLUE -> BLUE.name
}

fun colorsTypes(color: Color) = when (color) {
    RED, GREEN -> "Red/Green color"
    BLUE -> BLUE.name
}

fun colorMix(color1: Color, color2: Color) = when (setOf(color1, color2)) {
    setOf(RED, GREEN) -> BLUE
    else -> throw Exception("No color matches")
}

fun main() {
    println(usingWhen(RED))
    println(usingWhen(BLUE))

    println(colorsTypes(RED))
    println(colorsTypes(BLUE))
    println(colorsTypes(GREEN))

    println(colorMix(RED, GREEN))
    println(colorMix(GREEN, RED))
    println(colorMix(GREEN, BLUE))
}
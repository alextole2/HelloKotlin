enum class Color(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 * g) * 256 * b
}

fun main() {
    println(Color.RED.name)
    println(Color.GREEN.ordinal)
    println(Color.BLUE.rgb())
}
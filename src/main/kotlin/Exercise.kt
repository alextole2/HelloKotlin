import java.util.*

/**
 * Calculate tax values according with followings intervals:
 *
 * 0.00 - 2000.00 -> Percent = None
 * 2001.00 - 3000.00 -> Percent = 8%
 * 3001.00 - 4500.00 -> Percent = 18%
 * 4501.00 - 2000.00 -> Percent = 28%
 *
 * Input/Output examples:
 *
 * Input: 1700.00 -> Output: Isento
 * Input: 3002.00 -> Output: R$ 80.36
 * Input: 4520.00 -> Output: R$ 355.60
 *
 * Observations:
 * Output must be formatted with:
 * R$ symbol followed by an space and the value with to 2 decimal places
 */
fun main() {
    val input = Scanner(System.`in`)
    val value = input.nextFloat()

    val minInterval = 2000
    val middleInterval = 3000
    val maxInterval = 4500
    var taxValue: Float

    if (value > minInterval) {
        taxValue = getTaxToPayFrom(8)
        if (value > middleInterval) {
            val decrement = if (value > maxInterval) (value - maxInterval).toInt() else 0
            val difference = ((value - middleInterval) - decrement)
            taxValue = (taxValue + getTaxToPayFrom(18, difference))
        }
        if (value > maxInterval) {
            val difference = (value - maxInterval)
            taxValue = (taxValue + getTaxToPayFrom(28, difference))
        }
        printlnFormattedTaxValue(taxValue)
    } else {
        println("Isento")
    }

    input.close()
}

fun getTaxToPayFrom(percent: Int, over: Float): Float {
    return (percent * over) / 100.00f
}

fun getTaxToPayFrom(percent: Int): Float {
    return getTaxToPayFrom(percent, 1000.00f)
}

fun printlnFormattedTaxValue(taxValue: Float) {
    println("R$ ${String.format("%.2f", taxValue)}")
}
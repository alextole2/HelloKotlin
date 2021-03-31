fun main() {
    val waterAccountValue = 70.0
    val age = 32
    println("My age is $age")
    println("My summed age is ${sumAccounts(10.0, 22.0)}")
    println("Sum1: " + sumAccounts(300.0))
    println("Sum2: " + sumAccounts(water = waterAccountValue))
    println("Sum3: " + sumAccounts(350.0, waterAccountValue))
    println("Sum4: " + sumEnergyAndWaterAccounts(450.0, waterAccountValue))
}

fun sumAccounts(energy: Double = 300.0, water: Double = 20.0): Double = energy + water

fun sumEnergyAndWaterAccounts(energy: Double, water: Double): Double {
    return energy + water
}


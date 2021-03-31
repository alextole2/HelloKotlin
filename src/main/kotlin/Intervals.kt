fun main() {
    val aToZ = "a".."z"
    val oneToOneHundred = 1..100

    println("-----------------Letters-----------------")

    println("q" in aToZ)
    println("w" in aToZ)
    println("e" in aToZ)
    println("r" in aToZ)
    println("t" in aToZ)
    println("y" in aToZ)

    println("-----------------Numbers-----------------")

    println(10 in oneToOneHundred)
    println(20 in oneToOneHundred)
    println(30 in oneToOneHundred)
    println(40 in oneToOneHundred)
    println(50 in oneToOneHundred)
    println(1000 in oneToOneHundred)

    println("-----------------isTrue-----------------")
    val isTrue = 1 in oneToOneHundred
    println(isTrue)

    val counting = 100.rangeTo(150)
    val downTo = 100.downTo(2)
    val counter = 1.rangeTo(150).step(2)

    println("-----------------Counting-----------------")
    for (i in counting) {
        println(i)
    }

    println("-----------------downTo-----------------")
    for (i in downTo) {
        println(i)
    }

    println("-----------------Counter-----------------")
    for (i in counter) {
        println(i)
    }
}
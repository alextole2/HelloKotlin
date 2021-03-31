val set = setOf(1, 2, 3, 4, 5, 6)
val hasSet = hashSetOf(1, 2, 3, 4, 5, 6)
val list = listOf(1, 2, 3, 4, 5, 6, 7)
val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)
    for ((index, value) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(value)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {

    println("--------Java classes--------")
    println(set.javaClass)
    println(hasSet.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println("--------Kotlin features--------")
    println(set.minus(set))
    println(hasSet.maxOrNull())
    println(hasSet.first())
    println(hasSet.last())
    println(hasSet.clone())
    println(hasSet.remove(hasSet.first()))
    println(hasSet)

    println()

    println(set)
    println(hasSet)
    println(list)
    println(map)

    println("-------Join to string--------")
    println(set.joinToString("+", "|", "|"))
    println(hasSet.joinToString(" ", " ", " "))
    println(list.joinToString("", "", ""))

    println("-------Customized Join to string--------")
    println(joinToString(set, "+", "|", "|"))
    println(joinToString(hasSet, " ", " ", " "))
    println(joinToString(list, "", "", ""))

    println("-------Customized Join to string (Default values)--------")
    println(joinToString(set))
    println(joinToString(hasSet))
    println(joinToString(list))

    println("-------Customized Join to string (Default named values)--------")
    println(joinToString(set, separator = ";"))
    println(joinToString(hasSet, prefix = "[", postfix = "]"))
    println(joinToString(list, prefix = "{", postfix = "}"))
}
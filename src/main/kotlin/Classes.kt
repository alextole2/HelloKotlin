class Person(val surname: String, var age: Int)

class Rectangle(val height: Int, val width: Int) {
    val isSquare1 = width == height
    val isSquare2: Boolean
        get() {
            return width == height
        }

    fun isSquare3(): Boolean = width == height
}

fun main() {
    val person = Person("Surname", 18)
    println(person.surname)
    println(person.age)
    val rectangle = Rectangle(2, 2)
    println(rectangle.isSquare1)
}
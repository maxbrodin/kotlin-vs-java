package _08_destructuring

data class Person(val first: String, val last: String)

fun main() {
    val (first, last) = Person("John", "Jones")
    println("Hello, $first $last")





    val values = mapOf("key 1" to "value 1", "key 2" to "value 2")

    for ((key, value) in values) {
        println("Key: $key Value: $value")
    }
}

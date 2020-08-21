package _06_extension_functions

infix fun Int.multiplyBy(x: Int): Int {
    return this * x
}

fun main() {
    println(1.multiplyBy(2))
    println(1 multiplyBy 2)
}

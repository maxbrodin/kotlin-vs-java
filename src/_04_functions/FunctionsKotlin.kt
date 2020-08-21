package _04_functions

fun trim(value: String, prefix: Char = ' '): String = value.trim(prefix)

// Demo:
// top-level functions
// final
// default arguments
// single-expression functions
// named arguments


fun main() {
    println(trim(prefix = ' ', value = " trim me       "))
    println(trim("___trim this string__", '_'))
}

package _10_ranges

fun main() {
    val i = 2
    if (i in 1..4) {  // equivalent of 1 <= i && i <= 4
        println(i)
    }


    for (i in 1..4) { // equivalent of for (int i = first; i <= last; i += 1)
        println(i)
    }


    for (i in 4 downTo 1) { // equivalent of for (int i = last; i >= first; i -= 1)
        println(i)
    }


    val items = listOf("one", "two", "three")
    for (item in items.indices) {
        println(item)
    }
}

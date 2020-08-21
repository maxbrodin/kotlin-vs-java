package _07_lazy

import kotlin.math.asin

class LazyKotlin {
    val value: DoubleArray by lazy {
        val result = DoubleArray(1_000_000)
        for (i in result.indices) {
            result[i] = asin(i.toDouble())
        }
        println("Lazy calculated")
        result
    }
}

fun main() {
    val test = LazyKotlin()
    println("Before lazy calculated")
    println(test.value.size)
    println(test.value == test.value)
}

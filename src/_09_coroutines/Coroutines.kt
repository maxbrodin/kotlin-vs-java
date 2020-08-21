package _09_coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    for (i in 1..1_000_000) {
        launch {
            delay(1000L)
            println("Hi!" + Thread.currentThread().name);
        }
    }
    println("Done")
}


interface Item

class Leaf : Item
class Node : Item

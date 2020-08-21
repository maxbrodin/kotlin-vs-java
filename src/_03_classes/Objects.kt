package _03_classes

object Singleton {
    fun getItems(): List<String> {
        return listOf("one", "two", "three")
    }
}


fun main() {
    println(Singleton.getItems())
    println(Singleton.getItems() == Singleton.getItems())
}

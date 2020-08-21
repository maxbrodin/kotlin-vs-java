package _06_extension_functions


fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}


fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)
}

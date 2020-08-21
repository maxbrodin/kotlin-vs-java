package _05_null_safety

class Person(val name: Name?)
class Name(val value: String?)


fun nullSafetyString() {
    var value : String = "initial value"
    // value = null // compilation error
    
    var source : String? = "initial value"
    source = null
}

fun nullSafetyClass() {
    var name : Name = Name("")
    //name = null // compilation error
}


fun safeCalls(person : Person?) {
    val result = person?.name?.value?.length
    print(result)
}

fun notNullAssertionOperator(age: Name?) {
    val result = age!!.value!!.length
    print(result)
}

fun elvisOperator(value: String?) {
    val result = value ?: "default"
    val result2 = if (value == null)  "default" else value
    print(result)
}

package _01_variables

import java.util.HashMap

class VariablesKotlin {

    fun variables() {
        var items = HashMap<String, List<String>>()
        items = HashMap(100)

        val readonlyItems = HashMap<String, List<String>>()
        // readonlyItems = HashMap(100); // Error
        
        var explicitType: String

        // The compiler can infer the function types for variables if there is enough information:
        val sumLambda = { x: Int, y: Int -> x + y }
    }
}

// Constants in Kotlin
const val PI = 3.14

private val ANOTHER_VARIABLE = ""

package _02_strings


fun main() {
    println(multiLineStringSql())
    println(multiLineStringJson())
    println(format())
}

fun multiLineStringSql(): String {
    return """
        SELECT users.name 
        FROM users 
        WHERE users.name like 'Michael%'
        """.trimIndent()
}

fun multiLineStringJson(): String {
    return """
        {
            "firstName": "Rack",
            "lastName": "Jackson",
            "gender": "man",
            "age": 24,
            "address": {
                "streetAddress": "126",
                "city": "San Jone",
                "state": "CA",
                "postalCode": "394221"
            },
            "phoneNumbers": [
                { "type": "home", "number": "7383627627" }
            ]
        }
    """.trimIndent()
}

fun format(): String {
    val value = 3.14
    return "PI value is $value"
}

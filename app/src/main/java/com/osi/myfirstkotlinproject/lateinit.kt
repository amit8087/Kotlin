package com.osi.myfirstkotlinproject

// Lateinit used only with mutable data type i.e var and non-nullable data type
// lateinit values must be initialised before we used it


fun main(args: Array<String>) {

    var country = Country()

    country.name = "India" // we hv to initialize the variable before we use it, otherwise throws "UninitializedPropertyAccessException"
//    println(country.name)

    country.setup()

}

class Country {
    lateinit var name: String

    fun setup() {
        name = "USA"
        println("Name of the country is $name")
    }
}
package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {
    CustomersData.count = 98;
    CustomersData.typeOfCustomers()

    println(CustomersData.count)

    CustomersData.count = 100;
    println(CustomersData.count)

    CustomersData.myMethod("Hola")
}


// alt 4 'static' in java
object CustomersData : MySuperClass() {
    var count: Int = -1 //behaving as static variable

    fun typeOfCustomers(): String { // behaving as static method
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("Object customerData: $str")
    }

    // we can use 'init block' inside 'object'
    init {

    }
}

open class MySuperClass {

    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}
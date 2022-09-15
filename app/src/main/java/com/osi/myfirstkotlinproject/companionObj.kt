package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    println(MyClass.count)
    println(MyClass.typeOfCustomers())
}

class MyClass {
    companion object {
        var count: Int = -1 // compile to static variables. we can see in bytecode

        // if we want to call the below method from a java file
        @JvmStatic
        fun typeOfCustomers(): String { // behaves as static method
            return "Indian"
        }
    }
}
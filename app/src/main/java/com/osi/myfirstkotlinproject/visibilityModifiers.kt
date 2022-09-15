package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

}

open class Person {
    private val a = 1
    protected val b = 2
    internal val c = 3 //visible within the same module
    val d = 10 // public by default
}

class Indian: Person() {
    // a is not visible
    // b, c, d is visible
}

class TestClass {
    fun run() {
        // c, d is visible
        // a, b is not visible
    }
}
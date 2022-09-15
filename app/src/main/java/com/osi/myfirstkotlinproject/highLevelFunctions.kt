package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    val program = Program()

    // simple way
    program.addTwoNumbers(2, 7)

    // using interface / OOPs way
    program.addTwoNumbers(2, 7, object : MyInterface { //as we can not instantiate interface, using the object

        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val test: String = "Hello"

    val myLambda: (Int) -> Unit = { s: Int -> println(s)}   // Lambda expression [ function ]
    program.addTwoNumbers(2, 7, myLambda)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {  // high level function with lambda as parameter

        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // using interface / object oriented way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {                         // simple way

        val sum =  a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int) // fun takes para 'sum' of type 'Int'
}
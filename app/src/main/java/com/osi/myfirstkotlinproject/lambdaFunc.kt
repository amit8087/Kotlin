package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    val lambdaExample = LambdaProgram()
//    val myLambda: (Int, Int) -> Int = { x, y -> x + y } // syntax of lambda expression
//
//    print("1: ")
//    lambdaExample.addTwoNum(2,4,myLambda)
//
//    print("2: ")
//    lambdaExample.addTwoNum(2,4, { x, y -> x + y })

    print("3: ")
    lambdaExample.addTwoNum(2,4) { x, y -> x + y }

}

class LambdaProgram {
    fun addTwoNum(a: Int, b: Int, action: (Int, Int) -> Int) {
        val result = action(a, b)
        println(result)
    }
 }
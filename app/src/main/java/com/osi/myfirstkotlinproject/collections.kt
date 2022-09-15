package com.osi.myfirstkotlinproject

/* FILTER
* returns a list containing only elements matching the given predicate.
* */

/* MAP
* returns a list containing the results of applying the given transform function
* to each element in the original collection.
* */

fun main(args: Array<String>) {

    val myNumbers: List<Int> = listOf(1,2,3,4,5,6,12,34,67)

//    val mySmallNumbers = myNumbers.filter { n -> n < 10 } // filter returns output that satisfies the condition written in lambda expression
    val mySmallNumbers = myNumbers.filter { it < 10 }

    for (num in mySmallNumbers) {
        println(num)
    }
    println(mySmallNumbers)

    println("----------------- map -----------------")

    val mySquaredNumbers = mySmallNumbers.map { it * it }

    for (num in mySquaredNumbers) {
        println(num)
    }
    println(mySquaredNumbers)

    println(" using 'filter' and 'map' together")

    var mySmallSquaredNumbers = myNumbers.filter { it < 10 }.map { it * it }
    println(mySmallSquaredNumbers)

}
package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    // we can save our predicate i.e lambda fun as variable as use it wherever required, to reduce the redundancy of code

    val myPredicate = { num:Int -> num > 10 }

    val myNumbers = listOf<Int>(2,12,56,1,4,3,543)

    // all() function returns a bool value if all ele satisfy the predicate
//     val check = myNumbers.all { it > 10 }
    val check = myNumbers.all(myPredicate)
    println(check) // false

    // any() returns a bool if any of the ele satisfy the predicate
    val check1 = myNumbers.any { it > 10 }
    println(check1) // true

    // count() returns a Int count of ele satisfying the predicate
    val count1 = myNumbers.count { num -> num > 10 }
    println(count1)

    // find() returns the first ele that matches the predicate
    val find1 = myNumbers.find { it > 10 }
    println(find1)
}
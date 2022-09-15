package com.osi.myfirstkotlinproject

class Persons {
    var name: String = "amit"
    var age: Int = 23
}

fun main(args: Array<String>) {

    /* Scope function: 'with'
    * 1. Refer to context object by using 'this'
    * 2. The return value is the 'lambda result'
    * */

    var person = Persons()


//    val ageAfterFiveYears: Int =  with(person) {
//        println(name)
//        println(age)
//        age + 5
//    }

    val bio: String = with(person) {
        println(name)
        println(age)
        age + 5
        "He is a software developer working on java technology."
    }
//    println("Age after five years is $ageAfterFiveYears")
    println(bio)

    println("-------------------------------------------------------------")

    /* Scope function: 'apply'
    * 1. Refer to context object by using 'this'
    * 2. The return value is the 'context object'
    * */


    // decreases code redundancy
    // general syntax while using the scope function 'apply'
    val person1 = Persons().apply {
        name = "Another name"
        age = 26
    }

    with(person1) {
        println(name)
        println(age)
    }

    println("-------------------------------------------------------------")

    /* Scope function: 'also'
    * 1. Refer to context object by using 'it'
    * 2. The return value is the 'context object'
    * */

    val numsList: MutableList<Int> = mutableListOf(1, 2, 3)

    // same other code.. a fun call or other program

    // operations on the 'numsList'

    val duplicateNumbers = numsList.also {
        println("The list elements are: $it")
        it.add(5)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list elements after removing an element: $it")
    }

    println("Original List: $numsList")
    println("Duplicate List: $duplicateNumbers")


    println("-------------------------------------------------------------")

    /* Scope function: 'let'
    * 1. Refer to context object by using 'it'
    * 2. The return value is the 'lambda result'
    * */

    // using 'let' to avoid NullPointerException

    val name: String? = "asdfghjkl"

    name?.let {
        println(it.reversed())
        println(it.capitalize())
        println(it.length)
    }

    val stringLength = name?.let {
        println(it.reversed())
        it.length
    }

    println(stringLength)

    println("-------------------------------------------------------------")

    /* Scope function: 'run'
    * 1. Refer to context object by using 'this'
    * 2. The return value is the 'lambda result'
    * run is a combination of 'with' and 'let'
    * when we want to operate on a Nullable object and avoid NullPointerException then we use 'run'
    * */

    val p1: Persons? = Persons()

    val about = p1?.run {
        println(name)
        println(age)
        "He is freak who loves to teach"
    }
    println(about)
}

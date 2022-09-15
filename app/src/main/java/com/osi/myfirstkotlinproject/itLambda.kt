package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    val itExample = ItLambda()
    itExample.reverseAndDisplay("Hello", { s -> s.reversed()})
//    itExample.reverseAndDisplay("Hello", { it.reversed()})
}

class ItLambda {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) {
        var result = myFunc(str)
        println(result)
    }
}
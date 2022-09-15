package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    val closures = Closure()
    var result = 0

    closures.add2Num(5, 7) { x, y -> result = x + y } // able to modify outside variable

    println(result)
}

class Closure {
    fun add2Num(a: Int, b: Int, action: (Int, Int) -> Unit) {
        action(a, b)
    }
}
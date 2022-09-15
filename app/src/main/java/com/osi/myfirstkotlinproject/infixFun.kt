package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {
    val x:Int = 6;
    val y:Int = 10;

    val greaterVal = x greaterValue y // not possible without infix function.. same as x.greaterValue(y)
    println(greaterVal)
}

infix fun Int.greaterValue(other: Int): Int { //infix function
    return if (this > other)
        this
    else
        other
}
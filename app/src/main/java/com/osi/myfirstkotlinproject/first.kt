package com.osi.myfirstkotlinproject

fun main(args: Array<String>){
    val x = 3
    when(x){
        !in 1..20 -> println("x lies in 1 to 10")
        2 -> println("x is 2")
        else -> {
            println("x value is unknown")
            println("I don't know what is x")
        }
    }
}
//declaring variable along with data type
//var name:String = "Amit"
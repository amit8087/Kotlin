package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    if (user1 == user2) {
        println("Equal")
    } else {
        println("Not Equal")
    }
}

// data classes only works with data (e.g. here comparing data)
data class User(var name: String, var id: Int) { // data classes can not contain the parameter but only properties

}
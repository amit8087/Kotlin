package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {
    var car = Car()
}

abstract class Vehicle { // we can not create instance of abstract class

    abstract  var name: String  //can not initialize abstract members

    abstract  fun eat()        // abstract properties are 'open' by default
    open fun getHeight() {}   // 'open' fun ready to be overriden
    fun goToDrive() {}       // normal fun: public and final by default
}

class Car: Vehicle() {
    override var name: String = "Ford"

    override fun eat() {

    }
}
package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    var dog1 = Dog()
    dog1.breed = "Lab"
    dog1.color = "Black"
    println(dog1.color)
    dog1.eat()
    dog1.bark()

//    var cat1 = Cat()
//    cat1.age = 2
//    cat1.color = "Brown"
//    cat1.eat()
//    cat1.meow()
//
//    var animal = Animal()
//    animal.color = "White"
//    animal.eat()
}

// we hv to make class as open to get inherited by other classes
open class Animal {
    var color:String = ""

    open fun eat(){ // to override a fun we need to make it 'open'
        println("Animal is Eating...")
    }
}

class Dog: Animal() {
    var breed: String = ""
    fun bark() {
        println("Dog is Barking...")
    }
    override fun eat() { // overriding the fun. hv to use override modifier
        super<Animal>.eat()
        println("Dog is Eating...")
    }
}

class Cat: Animal() {
    var age: Int = -1
    fun meow() {
        println("Meow...")
    }
    override fun eat() {
        println("Cat is Eating...")
    }
}
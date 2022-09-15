package com.osi.myfirstkotlinproject

// Backing property: save our property variables from outside world by encapsulating them

fun main(args: Array<String>) {
    val human = Human()

    human.age = 23      //set(45)
    print(human.age)    //get()
}

//class Human {
//    var age: Int = 0 //Original property exposed outside. Anyone can modify it
//}


//alternate safe code using Backing Property
class Human {
    private var _age: Int = 0   // backing field: holds actual 'age' property data
    var age: Int                // backing property: exposed to outside world
        get() {
            return _age
        }
        set(value) {
            _age = value
        }

}

/*
* Within class Human always use _age field to access the property
* but outside class Human, use age to access the property.
* */
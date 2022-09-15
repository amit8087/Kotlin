package com.osi.myfirstkotlinproject

// primary constructor and init block in kotlin
// pri const don't have body but we can create init block as a part of pri const

//fun main(args: Array<String>) {
//    var student = Student("Amit")
//    student.name
//}
//
//class Student constructor(name: String) {
////class Student(name: String) {
//    var name: String = ""
//
//    init {
//        this.name = name
//        println("Student name is $name")
//    }
//}



fun main(args: Array<String>) {
    var student = Student("Amit", 21)
    println(student.id)
}

// we can declare property in primary constructor
class Student(var name: String) {

    var id: Int = -1

    init {
        println("Student name is $name")
    }

// sec constructor -> pri const call is expected
// can't declare property in sec constructor
//the body of the sec constr is called after the init block
    constructor(nam: String, id: Int): this(nam) {
        this.id = id
    }
}

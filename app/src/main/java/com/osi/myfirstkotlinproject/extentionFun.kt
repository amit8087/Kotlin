package com.osi.myfirstkotlinproject

//fun main(args: Array<String>) {
//    var student = Student()
//    println("Pass status: ${student.hasPassed(57)}")
//    println("Scholarship status: ${student.isScholar(57)}")
//}
//
//// syntax for extension function
//fun Student.isScholar(marks: Int): Boolean { //extension function
//    return marks > 95
//}
//
//class Student { // own class
//    fun hasPassed(marks: Int): Boolean {
//        return  marks > 40
//    }
//}

//practical use of extension function
fun main(args: Array<String>) {
    var str1:String = "Hello "
    var str2:String = "World."
    var str3:String = "Heyy "

    println(str3.add(str1, str2))

    var x:Int = 34
    var y:Int = 87

    val greaterNo = x.greaterVal(y)
    println(greaterNo)
}

fun String.add(s1:String, s2:String): String {
    return this + s1 + s2
}

fun Int.greaterVal(otherInt:Int): Int {
    if (this > otherInt)
        return this
    else
        return otherInt
}

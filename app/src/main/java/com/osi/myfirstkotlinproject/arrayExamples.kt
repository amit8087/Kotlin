package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {

    var myArray = Array<Int>(5) { 0 } // arrays are mutable but fixed in size

    myArray[4] = 20 //ArrayIndexOutOfBoundsException

    for (e in myArray) {
        println(e)
    }

    // list in kotlin
    var list = listOf<String>() //immutable, fixed size, read only
//    list[2] = "amit" // not possible as list is immutable

    println("Printing the whole list")
//    for (li in list) {
//    println(li)
//}
    for (i in 0..list.size - 1) {
//        println(i)
        println(list.get(i))
    }

    // mutable list in kotlin

    // Mutable, No fixed size, can add or remove elements
    var list2 = mutableListOf<String>("pratik", "adesh", "sachin")
//    var list2: MutableList<String> = mutableListOf<String>()
//    var list2: ArrayList<String> = arrayListOf<String>()

    list2.add(3,"amit")
    list2.add(4,"bandya")
    list2.add(1,"sid")

    list2[5] = "mohan"

    list2.remove("bandya")

    // maps in kotlin
    // immutable, fixed in size

    var myMap = mapOf<Int, String>(2 to "amit", 6 to "pratik", -1 to "sachin")

    println("------------------ Printing maps -----------------")
    for (key in myMap.keys) {
//        println(key) //2 6 -1
        println(myMap[key])
//        println(myMap.get(key))
    }


    // mutable maps in kotlin

    var myMap2 = HashMap<Int, String>()
//    var myMap2 = mutableMapOf<Int, String>() // returns LinkedHashMap
//    var myMap2 = hashMapOf<Int, String>()

    myMap2.put(3,"abcd")
    myMap2.put(42,"xyz")
    myMap2.put(234,"obama")

    myMap2.replace(234,"biden")
//    myMap2.put(234,"biden") // works as replace


    // Set in Kotlin
    // 'set' contains unique elements
    // 'HashSet' also contains unique elements but the sequence is not guaranteed in output

    var mySet = setOf<Int>(1,2,3,4,5,6,7,8) // Immutable

    var mySet2 = hashSetOf<Int>() // returns HashSet, sequence is not guaranteed
    var mySet1 = mutableSetOf<Int>(8,7,6,5) // mutable, output in sequence

    mySet1.remove(5)
    mySet1.add(23)
    mySet1.add(25)

}
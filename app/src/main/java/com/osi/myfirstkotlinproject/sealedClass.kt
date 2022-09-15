package com.osi.myfirstkotlinproject

sealed class Shape {
    data class Circle(var radius:Float): Shape()
    class Square(var side: Int): Shape()
//    class Rectangle(var length: Int, var breadth: Int): Shape() // defining rectangle outside of the sealed class


    //we can define variety of classes inside 'sealed class'
    object NotAShape: Shape()
//    sealed class Line: Shape()
//    sealed interface Draw
}

class Rectangle(var length: Int, var breadth: Int): Shape()

fun main() {
    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
//    var rectangle = Shape.Rectangle(12,8)
    var rectangle = Rectangle(12,8)

    val noShape = Shape.NotAShape

    checkShape(noShape)
}

fun checkShape(shape: Shape) {
    when (shape) {
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Square area is ${shape.side * shape.side}")
//        is Shape.Rectangle -> println("Rectangle area is ${shape.length * shape.breadth}")
        is Rectangle -> println("Rectangle area is ${shape.length * shape.breadth}")
        Shape.NotAShape -> println("No shape found")                            // we don't use 'is' in case of singleton object
    }
}
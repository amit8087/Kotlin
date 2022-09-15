package com.osi.myfirstkotlinproject

fun main(args: Array<String>) {
    var btn = MyButton()

    btn.onTouch()
    btn.onClick()
}

interface MyInterfaceListener { //can not create instance of interface

    var name: String  // properties are abstract by default

    fun onTouch() //methods in interface are abstract by default (method without body)

    fun onClick() {  // normal methods are public and open by default NOT FINAL
        println("onClicked Interface code: Button Clicked")

    }
}

class MyButton: MyInterfaceListener {
    override var name: String = "amit"

    override fun onTouch() {
        println("Button was touched.")
    }

    override fun onClick() {
        super.onClick()
        println("Button was clicked.")
    }

}
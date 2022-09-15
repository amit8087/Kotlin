package com.osi.myfirstkotlinproject

enum class CreditCardType {
    SILVER,     // ordinal = 0      name="SILVER"
    GOLD,       // ordinal = 1      name="GOLD"
    PLATINUM    // ordinal = 2      name="PLATINUM"
}

fun main(args: Array<String>) {

    // enum constants are obj of enum class type
    val cardType: CreditCardType = CreditCardType.GOLD

    // each enum obj has 2 properties: ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.name)

    // enum obj has 2 methods: values() and valueOf()
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) } // to print all the values

    // Using in 'when' statement
    when(cardType) {
        CreditCardType.SILVER -> println("User has Silver card.")
        CreditCardType.GOLD -> println("User has Gold card.")
        CreditCardType.PLATINUM -> println("User has Platinum card.")
    }
}
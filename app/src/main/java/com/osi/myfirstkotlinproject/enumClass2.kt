package com.osi.myfirstkotlinproject

interface CardCashBack {
    fun getCashbackValue(): Float
}

// when we wnt to add more properties than ordinal and name to enum
// we hv to use the constructor

enum class CreditCardType1(val color: String, val maxLimit: Int = 1000000): CardCashBack{
    SILVER(color = "gray", maxLimit = 500000) {
        override fun getCashbackValue(): Float = 0.02f // single expression in the fun, we can use the fun as expression
//            return 0.02f
                                              },
    GOLD(color = "gold") {
        override fun getCashbackValue(): Float = 0.04f
                         },
    PLATINUM(color = "black") {
        override fun getCashbackValue(): Float = 0.06f
    }
}

fun main(args: Array<String>) {
    println(CreditCardType1.GOLD.color)
}
package com.osi.myfirstkotlinproject

fun main() {
    print(Day.getNumberOfDays())
}


enum class Day {
    MONDAY {
        override fun nextDay() = TUESDAY
    },
    TUESDAY {
        override fun nextDay() = WEDNESDAY
    },
    WEDNESDAY {
        override fun nextDay() = THURSDAY
    },
    THURSDAY {
        override fun nextDay() = FRIDAY
    },
    FRIDAY {
        override fun nextDay() = SATURDAY
    },
    SATURDAY {
        override fun nextDay() = SUNDAY
    },
    SUNDAY {
        override fun nextDay() = MONDAY
    };

    abstract fun nextDay(): Day

    companion object {
        fun getNumberOfDays() = values().size
    }
}

/*
* each enum constant is instantiated by declaring its own anonymous classes while
* overriding the required abstract method. This is just as it would happen
* in any other Kotlin anonymous class.
* */
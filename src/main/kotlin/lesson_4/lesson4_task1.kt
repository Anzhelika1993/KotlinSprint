package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {

    val orderedToday = 13
    val orderedTomorrow = 9
    val availableForOrderToday: Boolean = orderedToday < NUMBER_OF_TABLES
    val availableForOrderTomorrow: Boolean = orderedTomorrow < NUMBER_OF_TABLES

    println(
        "Доступность столиков на сегодня: $availableForOrderToday \n" +
                "Доступность столиков на завтра: $availableForOrderTomorrow"
    )
}
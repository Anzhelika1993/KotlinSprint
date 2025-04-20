package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите ваш год рождения")

    val userYearOfBirth = readln().toInt()
    val currentYear = 2025
    var age = currentYear - userYearOfBirth

    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуть на главный монитор")
    }
}
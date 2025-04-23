package org.example.lesson_5

const val WINNING_NUMBER1 = 36
const val WINNING_NUMBER2 = 14

fun main() {

    println("Угадайте число от 0 до 42")

    val number1 = readln().toInt()
    val number2 = readln().toInt()

    if (number1 == WINNING_NUMBER1 && number2 == WINNING_NUMBER2 ||
        number1 == WINNING_NUMBER2 && number2 == WINNING_NUMBER1
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (number1 != WINNING_NUMBER1 && number2 != WINNING_NUMBER2 &&
        number1 != WINNING_NUMBER2 && number2 != WINNING_NUMBER1
    ) {
        println("Неудача!")
    } else {
        println("Вы выиграли утешительный приз!")
    }
}

package org.example.lesson_5

fun main() {

    var number1 = 12
    var number2 = 7
    var trueResult = number1 + number2

    println("Докажите, что вы не бот. Решите пример $number1 + $number2")

    var result = readln().toInt()

    when (trueResult) {
        result -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}
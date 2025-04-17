package org.example.lesson_5

fun main() {

    var namber1 = 12
    var namber2 = 7
    var trueResult = namber1 + namber2

    println("Докажите, что вы не бот. Решите пример")

    var result = readln().toInt()

    when (namber1 + namber2) {
        result -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}
package org.example.lesson_6

const val NUMBER_FROM = 1
const val NUMBER_TO = 9

fun main() {

    val randomNumber = (NUMBER_FROM..NUMBER_TO).random()

    println("Угадайте число в диапазоне от $NUMBER_FROM до $NUMBER_TO. У вас 5 попыток")

    var limit = 5

    do {
        val userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Это была великолепная игра!");
            return
        } else println("Неверно. У вас осталось ${--limit} попытки")
    } while (limit > 0)

    println("Было загадано число $randomNumber")
}
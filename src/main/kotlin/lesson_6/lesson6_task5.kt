package org.example.lesson_6

const val N1 = 1
const val N2 = 9

fun main() {

    var limit = 3

    do {
        val number1 = (N1..N2).random()
        val number2 = (N1..N2).random()
        println("Докажите, что вы не бот. Решите пример $number1 + $number2")
        val trueResult = (number1 + number2).toString()
        val result = readln()
        if (result == trueResult) {
            println("Добро пожаловать");
            break
        } else {
            --limit
        }
    } while (limit > 0)

    if (limit == 0) {
        println("Доступ запрещен")
    }
}
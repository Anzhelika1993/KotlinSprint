package org.example.lesson_6

const val N1 = 1
const val N2 = 9

fun main() {

    var limit = 3

    do {
        val number1 = (N1..N2).random()
        val number2 = (N1..N2).random()

        print("Докажите, что вы не бот. Решите пример $number1 + $number2 = ")

        val result = readln().toInt()
        val trueResult = number1 + number2

        if (result == trueResult) {
            println("Добро пожаловать");
            return
        } else {
            println("Решено неверно. У вас осталось ${--limit} попыток")
        }

    } while (limit > 0)

    println("Доступ запрещен")
}
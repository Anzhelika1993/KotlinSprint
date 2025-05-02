package org.example.lesson_7

fun main() {

    val range = 1000..9999
    var rangeRandom = range.random()

    do {
        rangeRandom = range.random()
        println("Ваш код авторизации: $rangeRandom")
        print("Введите код авторизации: ")

        val id = readln().toInt()

        if (id != rangeRandom) {
                   println("Неверно")
        } else {
            println("Добро пожаловать")
            return
        }
    } while (true)
}
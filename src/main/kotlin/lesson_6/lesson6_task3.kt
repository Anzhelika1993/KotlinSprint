package org.example.lesson_6

const val MILLIS_IN_SECONDS: Long = 1000

fun main() {

    println("Введите количество секунд")
    var seconds = readln().toInt()
    var secondsInMillis = seconds * MILLIS_IN_SECONDS

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(MILLIS_IN_SECONDS)
    }
    println("Время вышло")
}
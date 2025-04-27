package org.example.lesson_6

const val MILLIS_IN_SEC = 1000
fun main() {

    println("Введите количество секунд")
    var seconds = readln().toInt()
    var secondsInMillis = (seconds * MILLIS_IN_SEC).toLong()

    while (seconds > 0) {
        Thread.sleep(secondsInMillis)
        println("Прошло $seconds секунд"); break
    }
}
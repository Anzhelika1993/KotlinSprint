package org.example.lesson_6

const val MILLIS_IN_SEC = 1000
fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    val secondsInMillis = (seconds * MILLIS_IN_SEC).toLong()

    Thread.sleep(secondsInMillis)
    println("Прошло $seconds секунд")
}
package org.example.lesson_6

const val MILLIS_IN_SEC = 1000

fun main() {

    println("Введите количество секунд")

    val seconds = readln().toLong()
    Thread.sleep(seconds * MILLIS_IN_SEC)

    println("Прошло $seconds секунд")
}
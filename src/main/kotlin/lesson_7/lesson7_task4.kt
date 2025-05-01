package org.example.lesson_7

fun main() {

    print("Введите количество секунд: ")

    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        val secInMillis = (seconds * 100).toLong()
        Thread.sleep(secInMillis)
        println(i)
    }
    println("Время вышло")
}
package org.example.lesson_7

fun main() {

    print("Введите количество секунд: ")

    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        Thread.sleep(1000)
        println(i)
    }
    println("Время вышло")
}
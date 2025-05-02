package org.example.lesson_7

fun main() {

    println("Введите любое число от нуля")

    val number = readln().toInt()

    for (i in 0..number step 2) {
        println(i)
    }
}
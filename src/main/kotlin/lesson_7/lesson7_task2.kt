package org.example.lesson_7

fun main() {

    val range = 1000..9999
    var generatedCode: Int
    var userEnterCode: Int

    do {
        generatedCode = range.random()
        println("Ваш код авторизации: $generatedCode")
        print("Введите код авторизации: ")
        userEnterCode = readln().toInt()
    } while (userEnterCode != generatedCode)

    println("Добро пожаловать")
}
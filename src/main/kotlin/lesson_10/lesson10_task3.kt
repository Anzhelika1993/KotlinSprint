package org.example.lesson_10

fun main() {

    print("Задайте длину пароля: ")
    val passLength = readln().toInt()

    println(passwordGenerator(passLength))
}

fun passwordGenerator(length: Int): String {

    val numbers = 0..9
    val symbols = "!\"#$%&'()*+,-./\" \""
    var pass = ""

    for (i in 1..length) {
        if (i % 2 != 0) {
            pass += numbers.random()
        } else
            pass += symbols.random()
    }
    return pass
}
package org.example.lesson_10

fun main() {

    println(passwordGenerator())
}

fun passwordGenerator(): String {

    print("Задайте длину пароля: ")

    var length = readln().toInt()
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
package org.example.lesson_7

const val MIN_SYMBOLS = 6

fun main() {

    val numbers = 0..9
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val charSet = numbers + letters + capitalLetters
    val numberOfSymbols = readln().toInt()
    var pass = ""

    if (numberOfSymbols < MIN_SYMBOLS) {
        println("Минимальное количество символов $MIN_SYMBOLS")
    } else {
        for (i in 1..numberOfSymbols) {
            val random = charSet.random()
            pass += random
        }
    }
    println(pass)
}
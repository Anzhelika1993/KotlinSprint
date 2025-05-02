package org.example.lesson_7

const val MIN_SYMBOLS = 6

fun main() {

    val numbers = 0..9
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val charSet = numbers + letters + capitalLetters
    val numberOfSymbols = readln().toInt()
    val pass = mutableListOf<String>()

    if (numberOfSymbols < MIN_SYMBOLS) {

        for (i in 1..MIN_SYMBOLS) {
            val random = charSet.random().toString()
            pass.add(random)
        }
    } else {
        for (i in 1..numberOfSymbols) {
            val random = charSet.random().toString()
            pass.add(random)
        }
    }
    pass.shuffle()
    println(pass.joinToString(separator = ""))
}
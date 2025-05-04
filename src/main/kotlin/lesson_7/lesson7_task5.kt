package org.example.lesson_7

const val MIN_SYMBOLS = 6

fun main() {

    val numbers = '0'..'9'
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val charSet = numbers + letters + capitalLetters

    print("Задайте длину пароля ")

    var numberOfSymbols = readln().toInt()

    if (numberOfSymbols < MIN_SYMBOLS) numberOfSymbols = MIN_SYMBOLS

    val pass = mutableListOf<Char>()
    pass.add(numbers.random())
    pass.add(letters.random())
    pass.add(capitalLetters.random())

        for (i in 4..numberOfSymbols) {
            pass.add(charSet.random())
        }
        pass.shuffle()
        println(pass.joinToString(separator = ""))
    }
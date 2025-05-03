package org.example.lesson_7

const val MIN_SYMBOLS = 6

fun main() {

    val numbers = 0..9
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val charSet = numbers + letters + capitalLetters

    print("Задайте длину пароля ")

    val numberOfSymbols = readln().toInt()
    val pass = mutableListOf<String>()
    pass.add(numbers.random().toString())
    pass.add(letters.random().toString())
    pass.add(capitalLetters.random().toString())

    if (numberOfSymbols < MIN_SYMBOLS) {
        println("Минимальная длина пароля 6 символов")
    } else {
        for (i in 4..numberOfSymbols) {
            val random = charSet.random().toString()
            pass.add(random)
        }
        pass.shuffle()
        println(pass.joinToString(separator = ""))
    }
}
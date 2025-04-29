package org.example.lesson_7

fun main() {

    val numbersRange = 0..9
    val lettersRange = 'a'..'z'
    var elements = 6

    while (elements > 0) {

        if (elements % 2 != 0) {
            val random1 = numbersRange.random()
            print(random1)
        } else {
            val random2 = lettersRange.random()
            print(random2)
        }
        elements--
    }
}
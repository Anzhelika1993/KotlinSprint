package org.example.lesson_7

fun main() {

    val numbersRange = 0..9
    val lettersRange = 'a'..'z'
    var elements = 6
    var pass = ""

    while (elements > 0) {

        if (elements % 2 != 0) {
            val random1 = numbersRange.random()
            pass += random1
        } else {
            val random2 = lettersRange.random()
            pass += random2
        }
        elements--
    }
    println(pass)
}
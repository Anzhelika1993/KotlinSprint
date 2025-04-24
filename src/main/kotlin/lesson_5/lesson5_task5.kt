package org.example.lesson_5

fun main() {

    val numbers = 0.rangeTo(42).toList()
    val numbersOfElements = 3
    val randomElements = numbers.asSequence().shuffled().take(numbersOfElements).toList()

    println("Введите три числа от 0 до 42")

    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val setOfNumbers = listOf(number1, number2, number3)
    val intersectionSet = randomElements intersect setOfNumbers
    val countOfSet = intersectionSet.count()

    when (countOfSet) {
        3 -> println("Вы выиграли джекпот!!!")
        2 -> println("Вы получаете крупный приз!")
        1 -> println("Вы получаете утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Выигрышные числа: $randomElements")
}
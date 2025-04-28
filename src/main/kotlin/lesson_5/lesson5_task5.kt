package org.example.lesson_5

const val NUMBER_FROM = 0
const val NUMBER_TO = 42

fun main() {

    val numbers = NUMBER_FROM.rangeTo(NUMBER_TO).toList()
    val numbersOfElements = 3
    val randomElements = numbers.asSequence().shuffled().take(numbersOfElements).toList()

    println("Введите три числа в любом порядке от $NUMBER_FROM до $NUMBER_TO")

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
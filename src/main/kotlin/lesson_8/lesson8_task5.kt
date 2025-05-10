package org.example.lesson_8


fun main() {

    print("Введите количество планируемых ингредиентов - ")

    val sum = readln().toInt()
    val sumOfIngredients = Array(sum) { "" }

    println("Введите ингредиенты")

    for (i in sumOfIngredients.indices) {
        sumOfIngredients[i] = readln()
    }

    println("Список ингредиентов: ${sumOfIngredients.joinToString()}")
}
package org.example.lesson_9

fun main() {

    print("Введите пять ингредиентов: ")

    val ingredients = readln()
    val listOfIngredients = ingredients.split(", ")
    val alphabetized = listOfIngredients.sorted()

    alphabetized.forEach {
        println(it)
    }
}
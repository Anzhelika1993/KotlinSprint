package org.example.lesson_9


fun main() {

    print ("Введите пять ингредиентов: ")

    val ingredients = readln()
    val listOfIngredients = ingredients.split(", ").toList()

    listOfIngredients.sorted()
    listOfIngredients.forEach{
        println(it)
    }
}
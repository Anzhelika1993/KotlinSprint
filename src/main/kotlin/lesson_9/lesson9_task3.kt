package org.example.lesson_9

fun main() {

    val recipe = listOf("яйца", "молоко", "сливочное масло")
    val ingredientsPerServing = listOf(2, 50, 15)

    print("Введите количество порций: ")

    val serving = readln().toInt()
    val ingredientsPerServing2 = ingredientsPerServing.map {
        it * serving
    }
    val recipeForUser = recipe.zip(ingredientsPerServing2)

    print("На $serving порций вам понадобится: ")
    for (i in recipeForUser) {
        print("${i.first} - ${i.second}, ")
    }
}
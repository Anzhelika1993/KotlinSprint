package org.example.lesson_9

import java.util.*

fun main() {

    val ingredients = mutableSetOf<String>()

    println("Введите пять ингредиентов: ")
    for (i in 1..5) {
        ingredients.add(readln())
    }

    ingredients.sorted()

    println(ingredients.joinToString().replaceFirstChar { it.titlecase() })
}
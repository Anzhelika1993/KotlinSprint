package org.example.lesson_9

fun main() {

    val ingredients = listOf(
        "мука", "сахар", "соль", "вода", "оливковое масло", "томатная паста",
        "чеснок", "базилик", "моцарелла", "помидоры черри"
    )

    ingredients.forEach { println("В рецепте есть следующие ингредиенты: $it") }
}
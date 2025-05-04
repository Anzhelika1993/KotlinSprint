package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("мука", "сахар", "соль", "вода", "оливковое масло", "томатная паста",
        "чеснок", "базилик", "моцарелла", "помидоры черри")

    print("Введите ингридиент: ")
    val ingredient = readln()

        if (arrayOfIngredients.contains(ingredient)) {
            println("Ингредиент $ingredient в рецепте есть")
        } else
            println("Такого ингредиента в рецепте нет")
}
package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("мука", "сахар", "соль", "вода", "оливковое масло", "томатная паста",
        "чеснок", "базилик", "моцарелла", "помидоры черри")

    print("Введите ингридиент: ")
    val ingredient = readln()

    for (i in arrayOfIngredients) {

        if (arrayOfIngredients.contains(ingredient)) {
            println("Ингредиент $ingredient в рецепте есть")
            break
        } else
            println("Такого ингредиента в рецепте нет")
            return
    }
}
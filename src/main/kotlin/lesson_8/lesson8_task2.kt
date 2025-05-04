package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("мука", "сахар", "соль", "вода", "оливковое масло", "томатная паста",
        "чеснок", "базилик", "моцарелла", "помидоры черри")

    print("Введите ингридиент: ")
    val ingredient = readln()

    for (i in arrayOfIngredients) {

        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}

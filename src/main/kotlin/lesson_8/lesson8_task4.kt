package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("мука", "сахар", "соль", "вода", "оливковое масло", "томатная паста",
        "чеснок", "базилик", "моцарелла", "помидоры черри")

    println("Cписок ингредиентов: ${arrayOfIngredients.joinToString()}")
    print("Введите ингредиент, который вы хотите заменить - ")

    val ingredient = readln()
    val replacedIngredient: String

    if (ingredient !in arrayOfIngredients) {
        println("Данный ингредиент отсутствует в рецепте")
    } else {
        print("Введите ингредиент, который вы хотите добавить в рецепт - ")
        replacedIngredient = readln()

        val index = arrayOfIngredients.indexOf("${ingredient}")
        arrayOfIngredients[index] = replacedIngredient

        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
    }
}
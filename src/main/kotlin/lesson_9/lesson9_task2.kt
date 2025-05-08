package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("соль", "яйца", "молоко")
    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString()}")
    print("Желаете добавить еще? ")
    val answer = readln()
    val variantOfNegativeAnswer = "нет"

    if (answer.equals(variantOfNegativeAnswer)){
        return
    } else {
        print("Какой ингредиент вы хотите добавить? ")
        ingredients.add(readln())
    }
    println( "Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString()}")
}
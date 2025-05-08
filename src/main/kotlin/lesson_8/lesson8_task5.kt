package org.example.lesson_8

fun main() {

    print("Введите количество планируемых ингредиентов - ")

    val sumOfIngredients = arrayOfNulls<String>(readln().toInt())

    for (i in sumOfIngredients) {
        
        val index = sumOfIngredients.indexOf(i)
        sumOfIngredients[index] = readln()
    }
    println(sumOfIngredients.joinToString())
}
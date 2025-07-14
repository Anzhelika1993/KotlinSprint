package org.example.lesson_16

import kotlin.random.Random

fun main() {

    val cube = Cube()
    cube.getRandomNumber()
}

class Cube() {

   private val randomNumber = Random.nextInt(1, 7)

    fun getRandomNumber() {
        println("Выпало число: $randomNumber")
    }
}


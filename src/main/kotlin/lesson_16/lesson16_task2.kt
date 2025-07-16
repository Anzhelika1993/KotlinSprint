package org.example.lesson_16

import kotlin.math.pow

fun main() {

    val circle = Circle(4.5)
    println("Длина окружности составляет: ${circle.getPerimeter()}")
    println("Площадь окружности составляет: ${circle.getArea()}")
}

class Circle(private val radius: Double) {

    protected val PI = 3.14

    fun getPerimeter(): Double {
        return 2 * PI * radius
    }

    fun getArea(): Double {
        return PI * radius.pow(2.0)
    }
}
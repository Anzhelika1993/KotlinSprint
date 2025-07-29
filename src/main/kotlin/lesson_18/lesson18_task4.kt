package org.example.lesson_18

import kotlin.math.pow

fun main() {

    val box1 = Rectangle(31.00, 25.00, 38.00)
    val box2 = Cube(17.00)

    println("Упаковка для прямоугольной посылки: ${box1.getArea()} см")
    println("Упаковка для посылки-куба: ${box2.getArea()} см")
}

abstract class Box() {
    abstract fun getArea(): Double
}

class Rectangle(
    private val length: Double,
    private val height: Double,
    private val width: Double,
) : Box() {
    override fun getArea() = 2 * (length * width + length * height + height * width)
}

class Cube(val side: Double) : Box() {
    override fun getArea() = 6 * side.pow(2)
}
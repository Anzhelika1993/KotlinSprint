package org.example.lesson_14

import kotlin.math.pow

fun main() {

    val circle1 = Circle("Черный", 7.5)
    val circle2 = Circle("Белый", 5.00)
    val circle3 = Circle("Белый", 4.00)

    val square1 = Rectangle("Белый", 6.0, 4.0)
    val square2 = Rectangle("Черный", 5.0, 8.0)

    val arrayOfFigures = arrayOf(circle1, circle2, circle3, square1, square2)

    val blackFigures = arrayOfFigures.filter { it.color == "Черный" }
    val blackFiguresPerimeter = blackFigures.sumOf { it.perimeterCalculation()}
    println("Сумма периметров черных фигур: ${blackFiguresPerimeter.toFloat()}")

    val whiteFigures = arrayOfFigures.filter { it.color == "Белый" }
    val whiteFiguresArea = whiteFigures.sumOf { it.areaCalculation()}
    println("Сумма площадей белых фигур: ${whiteFiguresArea.toFloat()}")
}

abstract class Figure(
    val color: String,
) {
    abstract fun areaCalculation(): Double
    abstract fun perimeterCalculation(): Double
    fun printArea() = println("Площадь составляет ${areaCalculation()}")
    fun printPerimeter() = println("Периметр составляет ${perimeterCalculation()}")
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun areaCalculation(): Double = Math.PI * radius.pow(2)
    override fun perimeterCalculation(): Double = 2 * Math.PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun areaCalculation(): Double = width * height
    override fun perimeterCalculation(): Double = 2 * (width + height)
}


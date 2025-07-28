package org.example.lesson_18

fun main() {

    val screen = Screen()

    screen.drawSquare(5,5)
    screen.drawSquare(5f,5f)
    screen.drawCircle(7,14)
    screen.drawCircle(7f,14f)
    screen.drawPoint(13, 7)
    screen.drawPoint(13f, 7f)
}

class Screen() {
    fun drawSquare(x: Int, y: Int) {
        println("Нарисован квадрат. Целочисленные координаты ($x, $y)")
    }

    fun drawSquare(x: Float, y: Float) {
        println("Нарисован квадрат. Координаты с плавающей точкой ($x, $y)")
    }

    fun drawCircle(x: Int, y: Int) {
        println("Нарисован круг. Целочисленные координаты ($x, $y)")
    }

    fun drawCircle(x: Float, y: Float) {
        println("Нарисован круг. Координаты с плавающей точкой ($x, $y)")
    }

    fun drawPoint(x: Int, y: Int) {
        println("Нарисована точка. Целочисленные координаты ($x, $y)")
    }

    fun drawPoint(x: Float, y: Float) {
        println("Нарисована точка. Координаты с плавающей точкой ($x, $y)")
    }
}
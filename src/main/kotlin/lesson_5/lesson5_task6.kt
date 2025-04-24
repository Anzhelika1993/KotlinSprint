package org.example.lesson_5

import kotlin.math.pow

const val CM_PER_METER = 100
const val INDEX1 = 18.5
const val INDEX2 = 25
const val INDEX3 = 30

fun main() {

    println("Введите ваш вес в килограммах и рост в сантиметрах")
    val weight = readln().toFloat()
    val height = readln().toFloat()
    val heightInMetres = height / CM_PER_METER
    val BMI = (weight / (heightInMetres).pow(2))

    val relultBMI = when {
        BMI < INDEX1 -> "Недостаточная масса тела"
        INDEX1 <= BMI && BMI < INDEX2 -> "Нормальная масса тела"
        INDEX2 <= BMI && BMI < INDEX3 -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(String.format("%.2f", BMI))
    println(relultBMI)
}
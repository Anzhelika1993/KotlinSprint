package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val deposit = 70000
    val interestRate = 16.7
    val term = 20
    val x = (deposit * ((1 + interestRate / 100)).pow(term))

    println(String.format("%.3f", x))
}
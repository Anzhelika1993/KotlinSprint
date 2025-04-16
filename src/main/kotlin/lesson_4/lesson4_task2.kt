package org.example.lesson_4

const val AVERGE_WEIGHT_FROM = 35
const val AVERGE_WEIGHT_UP_TO = 100
const val AVERGE_VALUE = 100

fun main() {

    var weight = 20
    var value = 80

    println(
        "Груз весом $weight кг и объемом $value л соответствует категории 'Average': " +
                "${(weight < AVERGE_WEIGHT_FROM && weight >= AVERGE_WEIGHT_UP_TO) && (value < AVERGE_VALUE)}"
    )

    weight = 50
    value = 120

    println(
        "Груз весом $weight кг и объемом $value л соответствует категории 'Average': " +
                "${(weight < AVERGE_WEIGHT_FROM && weight >= AVERGE_WEIGHT_UP_TO) && (value < AVERGE_VALUE)}"
    )
}
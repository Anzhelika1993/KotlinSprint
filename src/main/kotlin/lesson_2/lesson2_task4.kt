package org.example.lesson_2

import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {

    var kristallOre = 7
    var ironOre = 11
    var buff = 0.2
    var buffKristallOre = (kristallOre * buff).toInt()
    var buffIronOre = (ironOre * buff).toInt()

    println(buffKristallOre)
    println(buffIronOre)
}
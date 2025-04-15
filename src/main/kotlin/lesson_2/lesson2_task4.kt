package org.example.lesson_2

    const val HUNDRED_PERCENT = 100

fun main() {

    var kristallOre = 7
    var ironOre = 11
    var buff = 20
    var buffInPercent = buff / HUNDRED_PERCENT.toDouble()
    var buffKristallOre = (kristallOre * buffInPercent).toInt()
    var buffIronOre = (ironOre * buffInPercent).toInt()

    println("Количество бонусной кристаллической руды: $buffKristallOre")
    println("Количество бонусной железной руды: $buffIronOre")
}
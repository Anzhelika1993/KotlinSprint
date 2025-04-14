package org.example.lesson_2

fun main() {

    var kristallOre = 7
    var ironOre = 11
    var buff = 20
    var buffInPercent = 20/100.toDouble()
    var buffKristallOre = (kristallOre * buffInPercent).toInt()
    var buffIronOre = (ironOre * buffInPercent).toInt()

    println("Количество бонусной кристаллической руды: $buffKristallOre")
    println("Количество бонусной железной руды: $buffIronOre")
}
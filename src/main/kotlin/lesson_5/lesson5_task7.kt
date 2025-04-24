package org.example.lesson_5

fun main() {

    println("Расстояние поездки (в километрах)")
    val distance = readln().toFloat()

    println("Расход топлива на 100 км (в литрах)")
    val fuelRate = readln().toFloat()

    println("Текущая цена за литр топлива")
    val pricePerLiter = readln().toFloat()

    val litersOfFuelNeeded = (distance * fuelRate) / 100
    val totalCost = (litersOfFuelNeeded * pricePerLiter)
    val totalCostOfFuel = String.format("%.2f", totalCost)

    println("Необходимое количество топлива: $litersOfFuelNeeded \n" +
                "Стоимость топлива для поездки: $totalCostOfFuel")
}
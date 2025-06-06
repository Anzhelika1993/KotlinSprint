package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_FOR_CALCULATION = 273.15f

class WeatherForMonth(dayTemperature: Int, nightTemperature: Int, hasPrecipitations: Boolean) {

    val dayTemperature = dayTemperature - KELVIN_FOR_CALCULATION.toInt()
    val nightTemperature = nightTemperature - KELVIN_FOR_CALCULATION.toInt()
    val hasPrecipitations = hasPrecipitations

    init {
        println(
            "Дневная температура: ${this@WeatherForMonth.dayTemperature}°C, \n" +
                    "Ночная температура: ${this@WeatherForMonth.nightTemperature}°C, \n" +
                    "Осадки: ${this@WeatherForMonth.hasPrecipitations}"
        )
    }
}

fun main() {

    val days = List(30) {
        WeatherForMonth(
            dayTemperature = Random.nextInt(183, 348),
            nightTemperature = Random.nextInt(183, 348),
            hasPrecipitations = Random.nextBoolean()
        )
    }

    val daysTempPerMonth = days.map { it.dayTemperature }
    val nightTempPerMonth = days.map { it.nightTemperature }
    val DaysWithPrecipitations = days.count { it.hasPrecipitations }

    println("Дневные температуры за месяц, °C: $daysTempPerMonth")
    println("Ночные температуры за месяц, °C: $nightTempPerMonth")
    println("Количество дней с осадками: $DaysWithPrecipitations")

    val averageDaysTemp = daysTempPerMonth.average().toInt()
    val averageNightTemp = nightTempPerMonth.average().toInt()

    println("Средняя дневная температура: $averageDaysTemp°C")
    println("Средняя ночная температура: $averageNightTemp°C")
}
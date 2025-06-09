package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_FOR_CALCULATION = 273.15f

class WeatherForMonth(_dayTemperature: Int, _nightTemperature: Int, _hasPrecipitations: Boolean) {

    val dayTemperature = _dayTemperature - KELVIN_FOR_CALCULATION.toInt()
    val nightTemperature = _nightTemperature - KELVIN_FOR_CALCULATION.toInt()
    val hasPrecipitations = _hasPrecipitations

    init {
        println(
            "Дневная температура: $dayTemperature°C, \n" +
                    "Ночная температура: $nightTemperature°C, \n" +
                    "Осадки: $hasPrecipitations"
        )
    }
}

fun main() {

    val days = List(30) {
        WeatherForMonth(
            _dayTemperature = Random.nextInt(183, 348),
            _nightTemperature = Random.nextInt(183, 348),
            _hasPrecipitations = Random.nextBoolean()
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
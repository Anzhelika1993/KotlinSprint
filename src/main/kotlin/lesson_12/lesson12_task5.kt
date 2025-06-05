package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_FOR_CALCULATION = 273.15f

class WeatherForMonth(_dayTemperature: Int, _nightTemperature: Int, _hasPrecipitations: Boolean) {
    var dayTemperature = _dayTemperature
        get() = (field - KELVIN_FOR_CALCULATION).toInt()
    var nightTemperature = _nightTemperature
        get() = (field - KELVIN_FOR_CALCULATION).toInt()
    var hasPrecipitations = _hasPrecipitations

    init {
        println(
            "Дневная температура: $dayTemperature°C, \n" +
                    "Ночная температура: $nightTemperature°C, \n" +
                    "Осадки: $hasPrecipitations"
        )
    }
}

fun main() {

    val days = mutableListOf<WeatherForMonth>()

    for (i in 1..30) {
        val day = WeatherForMonth(
            _dayTemperature = (183..348).random(),
            _nightTemperature = (183..348).random(),
            _hasPrecipitations = Random.nextBoolean()
        )
        days.add(day)
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
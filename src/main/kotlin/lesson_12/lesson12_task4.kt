package org.example.lesson_12

const val ZERO_KELVIN = 273.15f

class WeatherCelsius(dayTemperature: Int, nightTemperature: Int, hasPrecipitations: Boolean) {

    val dayTemperature = dayTemperature - ZERO_KELVIN.toInt()
    val nightTemperature = nightTemperature - ZERO_KELVIN.toInt()
    val hasPrecipitations = hasPrecipitations

    init {
        println(
            "Дневная температура: ${this@WeatherCelsius.dayTemperature}°C, \n" +
                    "Ночная температура: ${this@WeatherCelsius.nightTemperature}°C, \n" +
                    "Осадки: ${this@WeatherCelsius.hasPrecipitations}"
        )
    }
}

fun main() {

    val friday = WeatherCelsius(dayTemperature = 303, nightTemperature = 294, hasPrecipitations = false)
}
package org.example.lesson_12

const val KELVIN = 273.15f

class WeatherInCelsius(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitations: Boolean,
) {
    fun weatherInfo() {

        val dayTemperatureInCelsius = (dayTemperature - KELVIN).toInt()
        val nightTemperatureInCelsius = (nightTemperature - KELVIN).toInt()

        println(
            "Дневная температура: $dayTemperatureInCelsius°C, \n" +
                    "Ночная температура: $nightTemperatureInCelsius°C, \n" +
                    "Осадки: $hasPrecipitations"
        )
    }
}

fun main() {

    val friday = WeatherInCelsius(dayTemperature = 303, nightTemperature = 294, hasPrecipitations = true)
    friday.weatherInfo()
}
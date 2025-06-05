package org.example.lesson_12

const val KELVIN = 273.15f

class WeatherInCelsius(_dayTemperature: Int, _nightTemperature: Int, _hasPrecipitations: Boolean) {
    val dayTemperature = _dayTemperature
        get() = (field - KELVIN).toInt()
    val nightTemperature = _nightTemperature
        get() = (field - KELVIN).toInt()
    val hasPrecipitations = _hasPrecipitations

    fun weatherInfo() {

        println(
            "Дневная температура: $dayTemperature°C, \n" +
                    "Ночная температура: $nightTemperature°C, \n" +
                    "Осадки: $hasPrecipitations"
        )
    }
}

fun main() {

    val friday = WeatherInCelsius(_dayTemperature = 303, _nightTemperature = 294, _hasPrecipitations = false)
    friday.weatherInfo()
}
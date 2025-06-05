package org.example.lesson_12

const val ZERO_KELVIN = 273.15f

class WeatherCelsius(_dayTemperature: Int, _nightTemperature: Int, _hasPrecipitations: Boolean) {
    val dayTemperature = _dayTemperature
        get() = (field - ZERO_KELVIN).toInt()
    val nightTemperature = _nightTemperature
        get() = (field - ZERO_KELVIN).toInt()
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

    val friday = WeatherCelsius(_dayTemperature = 303, _nightTemperature = 294, _hasPrecipitations = false)
}
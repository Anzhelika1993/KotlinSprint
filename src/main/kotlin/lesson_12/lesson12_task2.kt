package org.example.lesson_12

class DayWeather(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitations: Boolean,
) {
    fun displayWeatherInfo(){
        println("Дневная температура: $dayTemperature°C, \n" +
                "Ночная температура: $nightTemperature°C, \n" +
                "Осадки: $hasPrecipitations")
    }
}

fun main() {

    val sunday = DayWeather(dayTemperature = 19, nightTemperature = 6, hasPrecipitations = true)
    sunday.displayWeatherInfo()
}
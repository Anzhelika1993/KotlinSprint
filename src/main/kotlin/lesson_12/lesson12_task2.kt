package org.example.lesson_12

class DayWeather(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitations: Boolean,
) {
    override fun toString(): String {
        return "DayWeather(dayTemperature = $dayTemperature, nightTemperature = $nightTemperature, " +
                "hasPrecipitations = $hasPrecipitations)"
    }
}

fun main() {

    val sunday = DayWeather(dayTemperature = 19, nightTemperature = 6, hasPrecipitations = true)

    println(sunday)
}
package org.example.lesson_15

fun main() {
    val temp = Temperature(22)
    val precip = PrecipitationAmount(0.6)
    val server = WeatherServer()

    server.sendInfo(temp)
    server.sendInfo(precip)
}

abstract class WeatherStationStats()

class Temperature(val degrees: Int) : WeatherStationStats()

class PrecipitationAmount(val millimetres: Double) : WeatherStationStats()

class WeatherServer {
    fun sendInfo(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> println("Температура составляет: ${stats.degrees}°C")
            is PrecipitationAmount -> println("Количество осадков: ${stats.millimetres} мм")
            else -> println("Проверьте введенные данные")
        }
    }
}
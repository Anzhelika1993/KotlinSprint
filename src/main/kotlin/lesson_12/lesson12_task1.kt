package org.example.lesson_12

class Weather() {
    var dayTemperature = 23
    var nightTemperature = 8
    var precipitations = false

    init {
        println(Weather())
    }
}

fun main() {
    val monday = Weather()
    monday.dayTemperature = 19
    monday.nightTemperature = 6
    monday.precipitations = true

    val tuesday = Weather()
    tuesday.dayTemperature = 24
    tuesday.nightTemperature = 10
    tuesday.precipitations = false
}
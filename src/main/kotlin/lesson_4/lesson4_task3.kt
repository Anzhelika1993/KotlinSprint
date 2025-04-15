package org.example.lesson_4

fun main() {

    val sunnyWeather = true
    val outdoorAwning = true
    val airHumidityInPercent = 20
    val currentSeason = "Winter"

    val enablingEnvironment = sunnyWeather && outdoorAwning &&
            (airHumidityInPercent == 20) && (currentSeason != "Winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $enablingEnvironment")
}
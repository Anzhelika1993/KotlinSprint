package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OUT_DOOR_AWNINIG = true
const val AIR_HUMIDITY_IN_PERCENT = 20
const val SEASON = "Not winter"

fun main() {

    val TodayWeather = true
    val awning = true
    val airHumidity = 20
    val currentSeason = "Winter"
    val enablingEnvironment = (SUNNY_WEATHER == TodayWeather) &&
            (OUT_DOOR_AWNINIG == awning) &&
            (AIR_HUMIDITY_IN_PERCENT == airHumidity) &&
            (SEASON == currentSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $enablingEnvironment")
}
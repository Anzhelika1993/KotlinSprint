package org.example.lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val SHIP_HAS_NO_DAMAGE = true
const val PROVISIONS_MIN = 50
const val GOOD_WEATHER = true

fun main() {
    var IsShipHasNoDamage = true
    var crew = 65
    var cratesOfProvisions = 51
    val weatherConditions = true

    val journey = (IsShipHasNoDamage == SHIP_HAS_NO_DAMAGE) &&
            (crew in CREW_MIN..CREW_MAX) &&
            (cratesOfProvisions > PROVISIONS_MIN) &&
            (weatherConditions == GOOD_WEATHER || weatherConditions != GOOD_WEATHER) ||
            (IsShipHasNoDamage != SHIP_HAS_NO_DAMAGE) &&
            (crew == CREW_MAX) &&
            (weatherConditions == GOOD_WEATHER) &&
            (cratesOfProvisions >= PROVISIONS_MIN)

    println("Может ли корабль отправиться в плавание? $journey")
}
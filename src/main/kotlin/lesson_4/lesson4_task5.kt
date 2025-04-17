package org.example.lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISIONS_MIN = 50

fun main() {
    val shipHasNoDamage = true
    var crew = 60
    var cratesOfProvisions = 51
    val weatherConditions = true

    val journey = (shipHasNoDamage &&
            (crew in CREW_MIN..CREW_MAX) &&
            (cratesOfProvisions > PROVISIONS_MIN) &&
            (weatherConditions || !weatherConditions)) ||
            (!shipHasNoDamage &&
                    (crew == CREW_MAX) &&
                    weatherConditions &&
                    (cratesOfProvisions >= PROVISIONS_MIN))

    println("Может ли корабль отправиться в плавание? $journey")
}
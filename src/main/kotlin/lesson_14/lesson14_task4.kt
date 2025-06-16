package org.example.lesson_14

fun main() {

    val satellite1 = Satellite("Vapor", true, true)
    val satellite2 = Satellite("Yad-2", false, false)
    val planet = Planet("Aegis VII", false, true, listOf(satellite1, satellite2))

    println("Планета ${planet.name} имеет два спутника: ${satellite1.name} и ${satellite2.name}.")
}

open class CosmicBody(
    val name: String,
    val hasAtmosphere: Boolean = false,
    val suitableForLanding: Boolean = false
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val satellites: List<Satellite>
) : CosmicBody(name, hasAtmosphere, suitableForLanding)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CosmicBody(name, hasAtmosphere, suitableForLanding)
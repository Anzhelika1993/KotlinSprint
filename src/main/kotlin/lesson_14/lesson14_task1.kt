package org.example.lesson_14

fun main() {

    val ship = Ship()
    ship.printCharacteristics()

    val cargoship = Cargoship()
    cargoship.printCharacteristics()

    val icebreaker = Icebreaker()
    icebreaker.printCharacteristics()

    val passenger = Passenger()
    passenger.printCharacteristics()
}

open class Ship(
    val speed: Int = 85,
    val capacity: Int = 950,
) {
    open fun printCharacteristics() {
        println("${this::class.simpleName}: Скорость судна = $speed, вместимость = $capacity")
    }
}

class Cargoship(
    speed: Int = 65,
    capacity: Int = 1100,
) : Ship(speed, capacity)

class Icebreaker(
    speed: Int = 50,
    capacity: Int = 600,
    val iceBreakAbility: Boolean = true,
) : Ship(speed, capacity) {
    override fun printCharacteristics() {
        super.printCharacteristics()
        println("${this::class.simpleName} способно колоть лед: $iceBreakAbility")
    }
}

class Passenger(
    speed: Int = 85,
    capacity: Int = 1200
) : Ship(speed, capacity)
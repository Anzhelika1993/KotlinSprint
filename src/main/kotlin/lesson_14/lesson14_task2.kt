package org.example.lesson_14

fun main() {

    val ship = Liner()
    ship.printCharacteristics()
    println()

    val cargoship = CargoShip()
    cargoship.printCharacteristics()
    cargoship.runLoading()
    println()

    val icebreaker = IcebreakerShip()
    icebreaker.printCharacteristics()
    icebreaker.runLoading()
    println()

    val passenger = PassengerShip()
    passenger.printCharacteristics()
    passenger.runLoading()
}

open class Liner(
    val speed: Int = 20,
    val capacity: Int = 500,
) {
    open fun printCharacteristics() {
        println("${this::class.simpleName}: Скорость судна = $speed узлов, вместимость, чел. = $capacity")
    }

    open fun runLoading() {
    }
}

class CargoShip(
    speed: Int = 20,
    capacity: Int = 40,
) : Liner(speed, capacity) {
    override fun runLoading() {
        println("Способ погрузки ${this::class.simpleName}: активирует погрузочный кран.")
    }
}

class IcebreakerShip(
    speed: Int = 22,
    capacity: Int = 75,
    val iceBreakAbility: Boolean = true,
) : Liner(speed, capacity) {
    override fun printCharacteristics() {
        super.printCharacteristics()
        println("${this::class.simpleName} способно колоть лед: $iceBreakAbility")
    }

    override fun runLoading() {
        println("Способ погрузки ${this::class.simpleName}: открывает ворота со стороны кормы.")
    }
}

class PassengerShip(
    speed: Int = 20,
    capacity: Int = 1186
) : Liner(speed, capacity) {
    override fun runLoading() {
        println("Способ погрузки ${this::class.simpleName}: выдвигает горизонтальный трап со шкафута.")
    }
}

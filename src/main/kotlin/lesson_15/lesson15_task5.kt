package org.example.lesson_15

fun main() {
    val car = Car("Mazda")
    val car1 = Car("Subaru")
    val truck = Truck("Forland")

    val p1 = Passenger(name = "Пассажир №1")
    val p2 = Passenger(name = "Пассажир №2")
    val p3 = Passenger(name = "Пассажир №3")
    val p4 = Passenger(name = "Пассажир №4")
    val p5 = Passenger(name = "Пассажир №5")
    val p6 = Passenger(name = "Пассажир №6")

    val c1 = Cargo("Говядина", 500)
    val c2 = Cargo("Свинина", 1500)
    val c3 = Cargo("Молоко", 800)

    println("***Загружаем пассажиров***")
    car.load(p1)
    car.load(p2)
    car.load(p3)
    car1.load(p5)
    car1.load(p6)
    truck.load(p4)
    println("***Загружаем груз***")
    truck.load(c1)
    truck.load(c2)
    truck.load(c3)
    println("***В пути***")
    car.drive()
    car1.drive()
    truck.drive()
    println("***Выгрузка***")
    car.unload()
    car1.unload()
    truck.unload()
}

interface Transport {
    fun load(transportable: Transportable)
    fun unload()
    fun drive()
}

interface Transportable

data class Passenger(val name: String) : Transportable

data class Cargo(val name: String, val weightKg: Int) : Transportable

class Car(val name: String) : Transport {
    private val maxPassengers = 3
    private val passengers = mutableListOf<Passenger>()

    override fun load(transportable: Transportable) {
        if (transportable is Passenger) {
            if (passengers.size >= maxPassengers) {
                println("Свободных мест нет. Пассажиров в $name: ${passengers.size}/$maxPassengers")
                return
            } else {
                passengers.add(transportable)
                println("Свободных мест в $name после ${transportable.name}: ${maxPassengers - passengers.size}")
            }
        }
    }

    override fun unload() {
        passengers.clear()
        println("$name высадил пассажиров")
    }

    override fun drive() {
        println("$name везет пассажиров: $passengers")
    }
}

class Truck(val name: String) : Transport {

    val maxPassengers = 1
    val passengers = mutableListOf<Passenger>()
    val maxCargo = 2000
    val cargo = mutableListOf<Cargo>()

    override fun load(transportable: Transportable) {
        if (transportable is Passenger) {
            if (passengers.size >= maxPassengers) {
                println("Свободных мест нет. Пассажиров в $name: ${passengers.size}/$maxPassengers")
            } else {
                passengers.add(transportable)
                println("Свободных мест в $name после ${transportable.name}: ${maxPassengers - passengers.size}")
            }
        } else if (transportable is Cargo) {
            val sumOfCargo = cargo.sumOf { it.weightKg }
            if (sumOfCargo + transportable.weightKg > maxCargo) {
                println("В $name невозможно больше загрузить. Лимит достигнут. Загружено в кг: ${cargo.sumOf { it.weightKg }}/$maxCargo")
            } else {
                cargo.add(transportable)
                println("В $name загружено $cargo. Итого загружено в кг: ${cargo.sumOf { it.weightKg }}/$maxCargo")
            }
        }
    }

    override fun unload() {
        passengers.clear()
        cargo.clear()
        println("$name выгрузил груз и высадил пассажира")
    }

    override fun drive() {
        println("$name везет груз $cargo и пассажира $passengers")
    }
}
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
    car.loadingPassenger(p1)
    car.loadingPassenger(p2)
    car.loadingPassenger(p3)
    car1.loadingPassenger(p5)
    car1.loadingPassenger(p6)
    truck.loadingPassenger(p4)
    println("***Загружаем груз***")
    truck.loadingCargo(c1)
    truck.loadingCargo(c2)
    truck.loadingCargo(c3)
    println("***В пути***")
    car.drive()
    car1.drive()
    truck.drive()
    println("***Выгрузка пассажиров***")
    car.unloadPassenger(p1)
    car.unloadPassenger(p2)
    car.unloadPassenger(p3)
    car1.unloadPassenger(p5)
    car1.unloadPassenger(p6)
    truck.unloadPassenger(p4)

    println("***Выгрузка груза***")
    truck.unloadCargo(c1)
    truck.unloadCargo(c3)
    truck.unloadCargo(c2)
}

interface CargoTransportation {
    fun loadingCargo(cargo: Cargo)
    fun unloadCargo(cargo: Cargo)
}

interface PassengerTransportation {
    fun loadingPassenger(passenger: Passenger)
    fun unloadPassenger(passenger: Passenger)
}

interface Driveable {
    fun drive()
}

data class Passenger(val name: String)

data class Cargo(val name: String, val weightKg: Int)

class Car(val name: String) : PassengerTransportation, Driveable {
    private val maxPassengers = 3
    private val passengers = mutableListOf<Passenger>()

    override fun loadingPassenger(passenger: Passenger) {
        if (passengers.size >= maxPassengers) {
            println("Свободных мест нет. Пассажиров в $name: ${passengers.size}/$maxPassengers")
            return
        } else {
            passengers.add(passenger)
            println("${passenger.name} сел в $name. Свободных мест: ${maxPassengers - passengers.size}")
        }
    }

    override fun unloadPassenger(passenger: Passenger) {
        val unload = passengers.find { it.name == passenger.name }

        if (unload != null) {
            passengers.remove(unload)
            println("$name высадил пассажира ${passenger.name}")
        } else {
            println("Пассажира ${passenger.name} нет в $name")
        }

        if (passengers.isEmpty()) {
            println("В $name нет пассажиров")
        }
    }

    override fun drive() {
        println("$name везет пассажиров: $passengers")
    }
}

class Truck(val name: String) : PassengerTransportation, CargoTransportation, Driveable {

    private val maxPassengers = 1
    private val passengers = mutableListOf<Passenger>()
    private val maxCargo = 2000
    private val cargoList = mutableListOf<Cargo>()

    override fun loadingPassenger(passenger: Passenger) {
        if (passengers.size >= maxPassengers) {
            println("Свободных мест нет. Пассажиров в $name: ${passengers.size}/$maxPassengers")
        } else {
            passengers.add(passenger)
            println("${passenger.name} сел в $name. Свободных мест: ${maxPassengers - passengers.size}")
        }
    }

    override fun unloadPassenger(passenger: Passenger) {
        val unload = passengers.find { it.name == passenger.name }

        if (unload != null) {
            passengers.remove(unload)
            println("$name высадил пассажира ${passenger.name}")
        } else {
            println("Пассажира ${passenger.name} нет в $name")
        }

        if (passengers.isEmpty()) {
            println("В $name нет пассажиров")
        }
    }

    override fun loadingCargo(cargo: Cargo) {
        val sumOfCargo = cargoList.sumOf { it.weightKg }
        if (sumOfCargo + cargo.weightKg > maxCargo) {
            println("В $name невозможно больше загрузить. Лимит достигнут. Загружено в кг: ${cargoList.sumOf { it.weightKg }}/$maxCargo")
        } else {
            cargoList.add(cargo)
            println("$cargoList загружен в $name. Итого загружено в кг: ${cargoList.sumOf { it.weightKg }}/$maxCargo")
        }
    }

    override fun unloadCargo(cargo: Cargo) {
        val unload = cargoList.find { it.name == cargo.name }

        if (unload != null) {
            cargoList.remove(unload)
            println("$name выгрузил груз ${cargo.name}: ${cargo.weightKg} кг.")
        } else {
            println("Груз ${cargo.name} не был загружен в $name")
        }

        if (cargoList.isEmpty()) {
            println("В $name нет груза")
        }
    }

    override fun drive() {
        println("$name везет груз $cargoList и пассажира $passengers")
    }
}
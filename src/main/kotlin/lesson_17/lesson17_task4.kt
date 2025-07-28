fun main() {

    val order = Package(652147, "Склад")

    order.newLocation = "Передается в доставку"
    println(order.newLocation)
    println("Счетчик перемещений: ${order.counter}")

    order.newLocation = "В пути"
    println(order.newLocation)
    println("Счетчик перемещений: ${order.counter}")

    order.newLocation = "Ожидает в пункте выдачи"
    println(order.newLocation)
    println("Счетчик перемещений: ${order.counter}")
}

class Package(
    val number: Int,
    private val currentLocation: String,
) {
    var counter: Int = 0
    var newLocation: String = currentLocation
        set(value) {
            field = value
            counter += 1
        }
}
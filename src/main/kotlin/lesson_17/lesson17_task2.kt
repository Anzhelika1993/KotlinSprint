package org.example.lesson_17

fun main() {

    val ship = Ship("Сокол", 75, "Пусан")
    println("Имя корабля: ${ship.name}")
    println("Средняя скорость корабля: ${ship.averageSpeed}")
    println("Порт приписки: ${ship.homePort}")

    ship.name = "Камадо"
    ship.homePort = "Инчхон"

    println("---после изменений---")
    println("Имя корабля: ${ship.name}")
    println("Средняя скорость корабля: ${ship.averageSpeed}")
    println("Порт приписки: ${ship.homePort}")
}

class Ship(
    _name: String,
    val averageSpeed: Int,
    var homePort: String
) {
    var name: String = _name
        set(value) {
            println("Нельзя изменить имя корабля")
        }
}
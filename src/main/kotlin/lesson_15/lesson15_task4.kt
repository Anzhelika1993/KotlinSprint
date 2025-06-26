package org.example.lesson_15

fun main() {
    val acousticStrings = Component("Струны для акустической гитары", 79)
    val guitarPick = Component("Медиаторы", 88)
    val humidifierForAcoustic = Component("Увлажнитель для акустических/классических гитар", 47)
    val guitarCable = Component("Гитарный кабель", 66)
    val allComponents = listOf(acousticStrings, guitarPick, humidifierForAcoustic, guitarCable)
    val forAcousticGuitar = listOf(acousticStrings, humidifierForAcoustic)

    val acousticGuitar = Instrument("Акустические гитары", 103, forAcousticGuitar)
    val ukulele = Instrument("Укулеле", 0, emptyList())
    val allInstruments = listOf(acousticGuitar, ukulele)

    ukulele.searching()
    acousticGuitar.searching()
    acousticGuitar.searchComponent(guitarCable)
    acousticGuitar.searchComponent(acousticStrings)
    guitarPick.searching()
}

abstract class Product(val name: String, val amount: Int)

class Instrument(
    name: String,
    amount: Int,
    val components: List<Component>
) : Product(name, amount), SearchingOfProduct, SearchingOfComponent {

    override fun searching() {
        println("Выполняется поиск")

        if (amount == 0) {
            println("Товара $name нет в наличии")
        } else {
            println("$name в наличии: $amount")
        }
        println()
    }

    override fun searchComponent(part: Component) {
        println("Выполняется поиск")

        val result = components.filter { it.name.contains(part.name) }

        if (result.isEmpty()) {
            println("Комплектующий товар ${part.name} для $name не найден")
        } else {
            println("Товар ${part.name} для $name имеется в наличии в кол-ве: ${part.amount}")
        }
        println()
    }
}


class Component(name: String, amount: Int) : Product(name, amount), SearchingOfProduct {
    override fun searching() {
        println("Выполняется поиск")

        if (amount == 0) {
            println("Товара ${name} нет в наличии")
        } else {
            println("$name в наличии: $amount")
        }
    }
}

interface SearchingOfProduct {
    fun searching()
}

interface SearchingOfComponent {
    fun searchComponent(part: Component)
}
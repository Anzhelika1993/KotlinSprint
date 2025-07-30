package org.example.lesson_19

fun main() {

    val tank = Tank("КВ-1")
    tank.shooting()
    tank.getPatron(Patron.BLUE)
    tank.shooting()
    tank.getPatron(Patron.RED)
    tank.shooting()
    tank.getPatron(Patron.GREEN)
    tank.shooting()
    tank.shooting()
}

enum class Patron(val damage: Int) {
    BLUE(5) {
        override fun load() {
            println("Заряжен патрон типа $BLUE")
        }

        override fun shot() {
            println("Выстрел $BLUE патроном. Урон: $damage")
        }
    },
    GREEN(10) {
        override fun load() {
            println("Заряжен патрон типа $GREEN")
        }

        override fun shot() {
            println("Выстрел $GREEN патроном. Урон: $damage")
        }
    },
    RED(20) {
        override fun load() {
            println("Заряжен патрон типа $RED")
        }

        override fun shot() {
            println("Выстрел $RED патроном. Урон: $damage")
        }
    };

    abstract fun load()
    abstract fun shot()
}

class Tank(val model: String) {
    var currentPatron: Patron? = null

    fun getPatron(patron: Patron) {
        currentPatron = patron
        patron.load()
    }

    fun shooting() {
        if (currentPatron != null) {
            currentPatron!!.shot()
            currentPatron = null
        } else {
            println("Патрон не загружен")
        }
    }
}
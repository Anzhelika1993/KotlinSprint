package org.example.lesson_15

fun main() {
    val carp = Fish()
    val seagull = Bird()
    val duck = Bird()

    carp.swimming()
    seagull.flying()
    duck.flying()

}

class Fish() : MovementOfFish {
    override fun swimming() {
        println("Метод передвижения существа: плавание")
    }
}

class Bird() : MovementOfBird {
    override fun flying() {
        println("Метод передвижения существа: полет")
    }
}

interface MovementOfFish {
    fun swimming()
}

interface MovementOfBird {
    fun flying()
}
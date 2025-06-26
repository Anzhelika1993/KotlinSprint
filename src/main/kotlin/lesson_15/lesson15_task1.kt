package org.example.lesson_15

fun main() {
    val carp = Fish()
    val seagull = Bird()
    val duck = Universal()

    carp.swimming()
    seagull.flying()
    duck.flying()
    duck.swimming()
}

class Fish() : Swimable {
    override fun swimming() {
        println("Метод передвижения существа класса ${this::class.simpleName}: плавание")
    }
}

class Bird() : Flyable {
    override fun flying() {
        println("Метод передвижения существа класса ${this::class.simpleName}: полет")
    }
}

class Universal() : Flyable, Swimable {
    override fun flying() {
        println("Метод передвижения существа класса ${this::class.simpleName}: полет")
    }

    override fun swimming() {
        println("Метод передвижения существа класса ${this::class.simpleName}: плавание")
    }

}

interface Swimable {
    fun swimming()
}

interface Flyable {
    fun flying()
}
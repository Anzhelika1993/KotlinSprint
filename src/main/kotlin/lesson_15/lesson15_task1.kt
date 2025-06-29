package org.example.lesson_15

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swimming()
    seagull.flying()
    duck.flying()
    duck.swimming()
}

class Carp() : Swimable {
    override fun swimming() {
        println("Метод передвижения существа класса ${this::class.simpleName}: плавание")
    }
}

class Seagull() : Flyable {
    override fun flying() {
        println("Метод передвижения существа класса ${this::class.simpleName}: полет")
    }
}

class Duck() : Flyable, Swimable {
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
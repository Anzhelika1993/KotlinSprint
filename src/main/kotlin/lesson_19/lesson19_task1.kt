package org.example.lesson_19

fun main() {

    println("Можете добавить в аквариум следующие виды рыб:")
    for (fish in Fish.values()) {
        println(fish.typeOfFish)
    }
}

enum class Fish(val typeOfFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}
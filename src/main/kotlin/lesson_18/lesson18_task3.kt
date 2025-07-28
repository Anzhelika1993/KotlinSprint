package org.example.lesson_18

fun main() {

    val fox: Pet = Fox("Alice")
    val dog: Pet = Dog("Duke")
    val cat: Pet = Cat("Roxy")

    val arrayOfPets: Array<Pet> = arrayOf(fox, dog, cat)
    feedAllPets(arrayOfPets)
}

fun feedAllPets(pets: Array<Pet>) {
    pets.forEach {
        it.eat()
    }
}

fun sleepAllPets(pets: Array<Pet>) {
    pets.forEach {
        it.sleep()
    }
}

open class Pet(val name: String) {
    open fun eat() {}
    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}
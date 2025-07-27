package org.example.lesson_18

fun main() {

    val cube1: Dice = Dice4()
    val cube2: Dice = Dice8()
    val cube3: Dice = Dice6()
    val cube4: Dice = Dice4()
    val cube5: Dice = Dice6()

    val arrayOfCubes = arrayOf(cube1, cube2, cube3, cube4, cube5)
    rollForAll(arrayOfCubes)
}

fun rollForAll (cubes: Array<Dice>) {
    cubes.forEach {
        it.RollTheDice()
    }
}

open class Dice (){
  open fun RollTheDice (){
    }
}

class Dice4 (val numbers: IntRange = 1..4): Dice(){
    override fun RollTheDice() {
        println("Выпало: ${numbers.random()}")
    }
}
class Dice6 (val numbers: IntRange = 1..6): Dice(){
    override fun RollTheDice() {
        println("Выпало: ${numbers.random()}")
    }
}

class Dice8 (val numbers: IntRange = 1..8): Dice(){
    override fun RollTheDice() {
        println("Выпало: ${numbers.random()}")
    }
}
package org.example.lesson_10

val NUMBERS = 1..6

fun main() {

    val user = random()
    val computer = random()

    println("Бросок кости пользователем: $user")
    println("Бросок кости компьютером: $computer")

    if (user > computer) {
        println("Победило человечество")
    } else if (user < computer) {
        println("Победила машина")
    } else println("Победила дружба")
}

fun random () = NUMBERS.random()
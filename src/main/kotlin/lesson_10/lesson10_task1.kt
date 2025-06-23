package org.example.lesson_10

val NUMBERS2 = 1..6

fun main() {

    val user = random2()
    val computer = random2()

    println("Бросок кости пользователем: $user")
    println("Бросок кости компьютером: $computer")

    if (user > computer) {
        println("Победило человечество")
    } else if (user < computer) {
        println("Победила машина")
    } else println("Победила дружба")
}

fun random2 () = NUMBERS2.random()
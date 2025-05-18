package org.example.lesson_11

fun main() {

    val id1: User = User(
        id = 125979318,
        login = "Phantom assassin",
        password = "Stifling_Dagger1200",
        email = "Phantom.assassin@email.ru"
    )

    val id2: User = User(
        id = 753020430,
        login = "Windranger",
        password = "Shackleshot1650",
        email = "Windranger@email.ru"
    )

    println(id1.id)
    println(id1.login)
    println(id1.password)
    println(id1.email)

    println()

    println(id2.id)
    println(id2.login)
    println(id2.password)
    println(id2.email)

}
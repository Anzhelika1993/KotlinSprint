package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {

    val user1: User = User(
        id = 125979318,
        login = "Phantom assassin",
        password = "Stifling_Dagger1200",
        email = "Phantom.assassin@mail.ru",
    )

    val user2: User = User(
        id = 753020430,
        login = "Windranger",
        password = "Shackleshot1650",
        email = "Windranger@mail.ru",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}
package org.example.lesson_16

fun main() {

    val user1 = User("Overlorde", "hesoyam250")
    print("Введите пароль: ")
    val inputPassword = readln()

    if (user1.validate(inputPassword)) {
        println("Пароль введен верно")
    } else {
        println("Пароль введен неверно")
    }
}

class User(
    val name: String,
    private val password: String
) {
    fun validate(input: String): Boolean {
        return password == input
    }
}
package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printUserData() {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun replaceBio() {
        print("Введите информацию о себе: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите ваш пароль: ")
        val userPassword = readln()

        if (userPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Ваш пароль изменен")
        }
    }
}

fun main() {

    val user: User2 = User2(
        id = 125979318,
        login = "Phantom assassin",
        password = "Stifling_Dagger1200",
        email = "Phantom.assassin@mail.ru",
    )

    user.replaceBio()
    user.changePassword()
    user.printUserData()
}
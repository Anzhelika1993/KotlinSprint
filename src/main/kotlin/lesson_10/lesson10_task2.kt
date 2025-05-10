package org.example.lesson_10

const val MIN_SYMBOLS = 4

fun main() {

    print("Задайте имя пользователя: ")
    val userName = readln()

    print("Задайте пароль: ")
    val userLogin = readln()

    validation(userName, userLogin)
}

fun validation(userName: String, userLogin: String): Boolean {

    if (userName.length < MIN_SYMBOLS || userLogin.length < MIN_SYMBOLS) {
        println("Логин или пароль недостаточно длинные")
        return true
    } else println("Добро пожаловать")
    return false
}
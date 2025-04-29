package org.example.lesson_6

fun main() {

    println("Создайте логин и пароль")
    val userLoginCreated = readln()
    val userPasswordCreated = readln()

    do {
        println("Введите ваш логин и пароль")
        val userLogin = readln()
        val userPassword = readln()
    } while (userLogin != userLoginCreated || userPassword != userPasswordCreated)

    println("Авторизация прошла успешно")
}
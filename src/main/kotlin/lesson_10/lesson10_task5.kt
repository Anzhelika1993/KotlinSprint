package org.example.lesson_10

const val USER_LOGIN = "Angelica1993"
const val USER_PASSWORD = "trulala2025"

fun authorization(login: String, password: String): String? {

    val letters = 'a'..'z'
    val capLetters = 'A'..'Z'
    val numbers = '0'..'9'
    val setOfSymbols = letters + capLetters + numbers
    val token = mutableListOf<Char>()
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        for (i in 0..32) {
            token.add(setOfSymbols.random())
        }
            token.joinToString(separator = "")
    }
    return token
}

fun main() {

    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    println(authorization(login, password))
}
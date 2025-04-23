package org.example.lesson_5

const val RIGHT_LOGIN = "Zaphod"
const val RIGHT_PASSWORD = "PanGalactic"

fun main() {

    val gretting = """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - 
        приветствовать вас на борту корабля "Heart of Gold"
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
        Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()

    println(gretting)

    val login = readln()

    if (login != RIGHT_LOGIN){
    println("Необходимо пройти регистрацию")
    } else {
        println("Ввести пароль"); val password = readln()}
   }
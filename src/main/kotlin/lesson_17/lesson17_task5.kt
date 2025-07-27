package org.example.lesson_17

fun main() {

    val user1 = User("Overlord", "dfgk639")

    user1.password = "luna2112"
    println(user1.password)
    user1.login = "Tengen"
}

class User(private var _login: String, private val _password: String) {

    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

    var login: String = _login
        set(value) {
            field = value
            println("Ваш логин успешно изменен. Новый логин: $login")
        }
}
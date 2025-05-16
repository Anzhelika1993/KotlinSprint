package org.example.lesson_10

const val USER_LOGIN = "Star_Lord"
const val USER_PASSWORD = "Gamora"

fun authorization(log: String, pass: String): String? {

    if (log == USER_LOGIN && pass == USER_PASSWORD) {
        return userToken()
    } else return null
}

fun userToken(): String {

    val letters = 'a'..'z'
    val capLetters = 'A'..'Z'
    val numbers = '0'..'9'
    val setOfSymbols = letters + capLetters + numbers
    var token = ""
    val chars = mutableListOf<Char>()

    for (i in 0..32) {
        chars.add(setOfSymbols.random())
    }
    token = chars.joinToString(separator = "")
    return token
}

fun basket(tokenToBasket: String?): String {

    val shoppingList = listOf<String>(
        "Sirius Adult Ягненок 2 кг", "Лакомство GreenQzin Дрессура №1 Утка 50г",
        "Игрушка MPets Мяч-пищалка с хвостом голубой для собак", "Симпарика таблетки для собак З шт"
    )
    val printShoppingList = shoppingList.joinToString(separator = ", ")
    val errorAuthorization = "Ошибка авторизации"

    if (tokenToBasket != null) {
        return printShoppingList
    } else
        return errorAuthorization
}

fun main() {

    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()
    val authorization = authorization(log = login, pass = password)
    val userToken = userToken()
    val basket = basket(tokenToBasket = authorization(log = login, pass = password))

    println(basket)
}
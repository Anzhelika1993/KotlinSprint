package org.example.lesson_10

const val USER_LOGIN = "Angelica1993"
const val USER_PASSWORD = "trulala2025"

fun authorization(log: String, pass: String): String? {

    val letters = 'a'..'z'
    val capLetters = 'A'..'Z'
    val numbers = '0'..'9'
    val setOfSymbols = letters + capLetters + numbers
    var token: String? = null
    if (log == USER_LOGIN && pass == USER_PASSWORD) {
        val chars = mutableListOf<Char>()
        for (i in 0..32) {
            chars.add(setOfSymbols.random())
        }
        token = chars.joinToString(separator = "")
    }
    return token
}

fun basket(token: String?): String {

    val shoppingList = listOf<String>(
        "Sirius Adult Ягненок 2 кг", "Лакомство GreenQzin Дрессура №1 Утка 50г",
        "Игрушка MPets Мяч-пищалка с хвостом голубой для собак", "Симпарика таблетки для собак З шт"
    )
    val printShoppingList= shoppingList.joinToString (separator = ", ")
    val errorAuthorization = "Ошибка авторизации"

    if (token != null){
        return printShoppingList
    } else
        return errorAuthorization
}

fun main() {

    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    val token = authorization(log = String(), pass = String())
    val basket = basket(token = String())

    println(basket)
}
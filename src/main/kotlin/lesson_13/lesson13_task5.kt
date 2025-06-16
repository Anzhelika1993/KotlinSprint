package org.example.lesson_13

fun main() {
    print("Введите имя: ")
    val name = readln()

    print("Введите номер: ")
    val inputNumber = readln()

    val telNumber = try {
        inputNumber.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка $e")
        null
    }

    print("Введите название компании: ")
    val company = readln()

    if (telNumber == null) {
        print("Невозможно записать контакт. Неверный формат номера телефона")
    } else {
        val newContact = Contact2(name, telNumber, company)
        println("Контакт записан!")
    }
}

class Contact2(val name: String, val telNumber: Long, val company: String?)
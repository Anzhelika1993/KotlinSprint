package org.example.lesson_13

fun main() {

    val contact = ContactData(
        name = "Ростислав",
        telNumber = 89123456789,
        company = null
    )

    contact.printData()
}

class ContactData(val name: String, val telNumber: Long, val company: String?) {

    fun printData() {
        println(
            "Имя: $name \n" +
                    "Номер: $telNumber \n" +
                    "Компания: ${company ?: "не указано"}"
        )
    }
}
package org.example.lesson_13

fun main() {

    val listOfContacts = listOf(
        DataContact("Денис", 89996663322, company = null),
        DataContact("Настя", 89996663333, company = null),
        DataContact("Аня", 89996663344, company = "null"),
        DataContact("Тимур", 89996663355, company = "Бородач"),
        DataContact("Ростислав", 89996663355, company = "Reddit")
    )

    val companies = listOfContacts.map { it.company }

    for (company in companies) {
        println(company ?: "не указано")
    }
}

class DataContact(val name: String, val telNumber: Long, val company: String?)

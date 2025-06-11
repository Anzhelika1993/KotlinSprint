package org.example.lesson_13

fun main() {

    val listOfContacts = mutableListOf<NewContact>()
    var contact: NewContact

    while (true) {
        print("Введите имя: ")
        val name = readln()
        print("Введите номер телефона: ")
        val telNumber = readln().toLongOrNull()
        print("Введите название компании (поле необязательно для заполнения): ")
        var company: String? = readln()

        if (telNumber == null) {
            println("Невозможно записать. Номер телефона не указан")
            break
        }

        if (company == null) {
            company = null
        }
        contact = NewContact(name, telNumber, company)
        listOfContacts.add(contact)
    }
    listOfContacts.forEach { it.printContact() }
}

class NewContact(val name: String, val telNumber: Long?, val company: String?) {

    fun printContact() {
        println("Имя: $name, Номер телефона: $telNumber, Компания: $company")
    }
}

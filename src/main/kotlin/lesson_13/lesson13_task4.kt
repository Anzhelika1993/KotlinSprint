package org.example.lesson_13

fun main() {

    val listOfContacts = mutableListOf<NewContact>()
    var contact: NewContact

    while (true) {
        print(
            "Если желаете добавить новый контакт введите имя " +
                    "(если хотите выйти из режима редактирования введите \"Выход\"): "
        )
        val name = readln()
        if (name.equals("Выход", ignoreCase = true)) {
            break
        }
        print("Введите номер телефона: ")
        val telNumber = readln().toLongOrNull()
        print("Введите название компании (поле необязательно для заполнения): ")
        var company: String? = readln()

        if (telNumber == null) {
            println("Невозможно записать контакт. Номер телефона не указан.")
        } else {
            contact = NewContact(name, telNumber, company)
            println("Контакт добавлен!")
            listOfContacts.add(contact)
        }
    }
    listOfContacts.forEach { it.printContact() }
}

class NewContact(val name: String, val telNumber: Long?, val company: String?) {

    fun printContact() {
        println("Имя: $name, Номер телефона: $telNumber, Компания: ${company ?: "не указана"}")
    }
}
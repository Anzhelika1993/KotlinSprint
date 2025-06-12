package org.example.lesson_13

fun main() {

    val contact1 = Contact(
        name = "Angelika",
        telNumber = 83833034560,
        company = null
    )

    val contact2 = Contact(
        name = "Ростислав",
        telNumber = 89123456789,
        company = "Reddit"
    )
}

class Contact(val name: String, val telNumber: Long, val company: String?)
package org.example.lesson_13

fun main() {

    val company1 = DataOfCompany(
        name = "Reka",
        telNumber = 83833034560,
        company = null
    )

    val company2 = DataOfCompany(
        name = "Птицефабрика \"Томская\"",
        telNumber = 83822932602,
        company = "Сибагро"
    )
}

class DataOfCompany(val name: String, val telNumber: Long, val company: String?)
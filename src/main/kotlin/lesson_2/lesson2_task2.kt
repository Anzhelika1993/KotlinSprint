package org.example.lesson_2

fun main() {

    var nubmerOfEmployees = 50
    val salasy = 30000
    val salasyEspenessBefore = nubmerOfEmployees * salasy
    nubmerOfEmployees += 30
    val interns = 30
    val internsSalasy = 20000
    val salasyEspenessAfter = salasyEspenessBefore + interns * internsSalasy
    val averageSalary = salasyEspenessAfter / nubmerOfEmployees

    println("Расходы на выплату заработной платы постоянных сотрудников: $salasyEspenessBefore")
    println("Общие расходы на выплату заработной платы: $salasyEspenessAfter")
    println("Средняя заработная плата после устройства стажеров: $averageSalary")
}
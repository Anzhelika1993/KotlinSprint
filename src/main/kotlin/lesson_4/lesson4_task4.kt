package org.example.lesson_4

fun main() {

    var day = 5
    var parity = day % 2

    println(
        "Упражнения для рук: ${parity == 1} \n" +
                "Упражнения для ног: ${parity == 0} \n" +
                "Упражнения для спины: ${parity == 0} \n" +
                "Упражнения для пресса: ${parity == 1}"
    )
}
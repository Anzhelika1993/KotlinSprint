package org.example.lesson_4

fun main() {

    var day = 5
    var parity = day % 2
    val isEven = (parity == 0)

    println(
        "Упражнения для рук: ${!isEven} \n" +
                "Упражнения для ног: $isEven \n" +
                "Упражнения для спины: $isEven \n" +
                "Упражнения для пресса: ${!isEven}"
    )
}
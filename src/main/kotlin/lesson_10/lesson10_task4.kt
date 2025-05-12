package org.example.lesson_10

val NUMBERS = 1..6
fun main() {

    var answer: String
    var countUserWinning = 0

    while (true) {
        val user = random()
        val computer = random()
        println("Бросок кости пользователем: $user")
        println("Бросок кости компьютером: $computer")

        if (user > computer) {
            println("Победило человечество")
            countUserWinning++
        } else if (user < computer) {
            println("Победила машина")
        } else
            println("Победила дружба")
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answer = readln()

        if (!continueGame(answer)) break
    }
    println("Количество выигрышных партий: $countUserWinning")
}

fun random() = NUMBERS.random()

fun continueGame(answer: String): Boolean {
    if (answer == "Да") {
        return true
    } else
        return false
}
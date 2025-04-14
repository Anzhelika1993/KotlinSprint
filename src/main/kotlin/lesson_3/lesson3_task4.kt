package org.example.lesson_3

fun main() {

    var field = "E2"
    var move = 1
    var newField = "E4"

    println("Move №$move from $field to $newField")

    field = "D2"
    move++
    newField = "D3"

    println("Move №$move from $field to $newField")
}
package org.example.lesson_3

fun main() {

    var playerMove = "D2-D4;0"
    var split = playerMove!!.split("-", ";")

    var field = split.get(0)
    var newField = split.get(1)
    var move = split.get(2)

    println(field)
    println(newField)
    println(move)
}
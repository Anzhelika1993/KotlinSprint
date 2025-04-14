package org.example.lesson_2

fun main() {

    val depatureHour = 9
    val depatureMinute = 39
    val inWay = 457
    val minInHour = 60
    val wayInHours = inWay / minInHour
    val wayInMinute = inWay % minInHour
    val arrivalTime = depatureHour + wayInHours
    val arrivalTime2 = (depatureMinute + wayInMinute) / minInHour
    val arrivalTime3 = (depatureMinute + wayInMinute) % minInHour
    val arrivalTimeHour = arrivalTime + arrivalTime2

    println("$arrivalTimeHour:$arrivalTime3")
}
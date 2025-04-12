package org.example.lesson_2

import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {

//    val depatureTimeHour = 9.hours
//    val depatureTimeMinute = 39.minutes
//    val timeInWay = 457.minutes
//    val end = (9.hours + 39.minutes + 457.minutes)
//
//    println(end)

    val depatureHour = 9
    val depatureMinute = 39
    val InWay = 457
    val wayInHours = InWay / 60
    val wayInMinute = InWay % 60
    val arrivalTime = depatureHour + wayInHours
    val arrivalTime2 = (depatureMinute + wayInMinute) / 60
    val arrivalTime3 = (depatureMinute + wayInMinute) % 60
    val arrivalTimeHour = arrivalTime + arrivalTime2

    println("$arrivalTimeHour:$arrivalTime3")
}
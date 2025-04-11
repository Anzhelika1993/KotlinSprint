package org.example.Variables

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

fun main() {

    val seconds: Duration = 6480.seconds
    val hours = seconds.inWholeHours
    val minute = seconds.inWholeMinutes
    val secondsMinusHours = (6480.seconds - 1.hours).inWholeMinutes
    val secondsMinusMinute = (1.hours - 48.minutes).inWholeSeconds

    println(hours)
    println(minute)
    println(secondsMinusHours)
    println(secondsMinusMinute)

//    val seconds1 = 6480
//    val hours1 = seconds1/3600
//    val minutes1 = (seconds1 %3600)/60
//    val sec = seconds1 % 60 return
//    "%d:%02D"
//    println(hours1)
//    println(minutes1)


}

package org.example.Variables

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

fun main() {

    val inSec = 6480
    val hour = inSec / 3600
    val min = (inSec % 3600) / 60
    val sec = inSec % 60

    println(message = "%02d:%02d:%02d".format(hour, min, sec))
}




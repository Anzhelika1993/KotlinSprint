package org.example.Variables

fun main() {

    val inSec = 6480
    val secsInHour = 3600
    val minInHour = 60
    val hour = inSec / secsInHour
    val min = (inSec % secsInHour) / minInHour
    val sec = inSec % minInHour

    println(message = "%02d:%02d:%02d".format(hour, min, sec))
}
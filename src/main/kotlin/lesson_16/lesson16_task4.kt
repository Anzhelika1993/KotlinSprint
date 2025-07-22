package org.example.lesson_16

fun main() {

    val order = Order("2657-33", "Собран")
    println("Статус заказа: ${order.getStatus()}")

    order.sendStatusChangeRequest("В службе доставки")
    println("Статус заказа: ${order.getStatus()}")

    order.sendStatusChangeRequest("Ожидает получения")
    println("Статус заказа: ${order.getStatus()}")
}

class Order(private val orderNumber: String, initialStatus: String) {

    private var status = initialStatus

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendStatusChangeRequest(newStatusRequest: String) {
        println("Запрос менеджеру на смену текущего статуса заказа на статус \"$newStatusRequest\"")
        changeStatus(newStatusRequest)
    }

    fun getStatus(): String = status
}
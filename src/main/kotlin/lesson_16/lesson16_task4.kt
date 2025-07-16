package org.example.lesson_16

fun main() {

    val order = Order("2657-33", "Собран")
    order.getStatus()

    order.sendStatusChangeRequest("В службе доставки")
    order.getStatus()

    order.sendStatusChangeRequest("Ожидает получения")
    order.getStatus()
}

class Order(protected val order: String, val initialStatus: String) {

    private var status = initialStatus

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendStatusChangeRequest(newStatusRequest: String) {
        println("Запрос менеджеру на смену текущего статуса заказа на статус \"$newStatusRequest\"")
        changeStatus(newStatusRequest)
    }

    fun getStatus() {
        println("Статус заказа $order: $status")
    }
}
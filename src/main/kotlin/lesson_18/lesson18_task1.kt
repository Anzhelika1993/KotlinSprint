package org.example.lesson_18


fun main() {

    val order = Order(27598)
    val order2 = Order(27599)
    order.getOrder("Мышь беспроводная")
    order2.getOrder(listOf("Клавиатура", "Коврик для мыши", "Наушники"))

}

class Order(val number: Int) {

    fun getOrder(product: String) {
        println("Заказан товар: $product")
    }

    fun getOrder(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}


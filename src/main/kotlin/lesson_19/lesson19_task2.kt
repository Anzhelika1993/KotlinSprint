package org.example.lesson_19

fun main() {

    val product1 = Product("Карандаш", 25698, Category.STATIONERY)
    val product2 = Product("Ваза", 68756, Category.OTHER)
    val product3 = Product("Джинсы", 132487, Category.CLOTHES)

    product1.getInfo()
    println()
    product2.getInfo()
    println()
    product3.getInfo()
}

enum class Category(val type: String) {
    CLOTHES("Одежда") {
        override fun getCategory() = Category.CLOTHES.type

    },
    STATIONERY("Канцелярские товары") {
        override fun getCategory() = Category.STATIONERY.type

    },
    OTHER("Разное") {
        override fun getCategory() = Category.OTHER.type
        };

    abstract fun getCategory(): String
}

class Product (val name: String, val id: Int, val category: Category){
    fun getInfo (){
        println("Наименование товара: $name,\nid: $id,\nкатегория: ${category.getCategory()}")
    }
}
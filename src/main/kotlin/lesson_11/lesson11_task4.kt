package org.example.lesson_11

class Category (
    val mainCover: String,
    val burgers: String,
    val imgBurger: String,
    val deserts: String,
    val imgDesert: String,
    val pizza: String,
    val imgPizza: String,
    val fish: String,
    val imgFish: String,
    val soups: String,
    val imgSoup: String,
    val salads: String,
    val imgSalad: String,
)

class Recipe(
    val cover: String,
    val name: String,
    val ingredients: List<Ingredient>,
    val portion: Int,
    val instruction: String,
    val inFavorite: Boolean = false,
)

class Ingredient(
    val name: String,
    val number: Int,
    val unitsOfMeasurement: String,
)

fun main() {

}
package org.example.lesson_11

class Category (
    val recipes: List<Recipe>,
    val id: Int,
    val title: String,
    val imgOfDish: String,
    val description: String,
)

class Recipe(
    val cover: String,
    val name: String,
    val id: Int,
    val ingredients: List<Ingredient>,
    val portion: Int,
    val instruction: List<String>,
    val inFavorite: Boolean = false,
)

class Ingredient(
    val name: String,
    val number: Int,
    val unitsOfMeasurement: String,
)

fun main() {

}
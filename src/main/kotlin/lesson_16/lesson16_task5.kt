package org.example.lesson_16

fun main() {

    val player = Player("Assassin", 580, 20)
    player.takeDamage(175)
    player.takeDamage(269)
    player.takeHeal(275)
    player.takeDamage(324)
    player.takeHeal(140)
    player.takeDamage(85)
    player.takeDamage(150)
    player.takeHeal(275)
}

class Player(val name: String, private var health: Int, var power: Int) {

    private var currentHealth = health
    val isAlive: Boolean
        get() = currentHealth > 0

    fun takeDamage(damage: Int) {
        if (!isAlive) {
            onDeath()
        } else {
            currentHealth = (currentHealth - damage).coerceAtLeast(0)
            print("$name получил урон $damage. ")
            getCurrentHealth()
        }
    }

    fun takeHeal(heal: Int) {
        if (!isAlive) {
            println("Лечение невозможно. $name убит")
        } else {
            currentHealth = (currentHealth + heal).coerceAtMost(health)
            print("$name получил лечение $heal. ")
            getCurrentHealth()
        }
    }

    private fun onDeath() {
        health = 0
        power = 0
        println("$name убит")
    }

    fun getCurrentHealth() {
        if (!isAlive) {
            onDeath()
            return
        }
        println("Текущее здоровье: $currentHealth")
    }
}
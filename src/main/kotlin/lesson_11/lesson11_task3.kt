package org.example.lesson_11

data class User(
    val nikname: String,
    val status: String,
    val avatar: String,
) {
    fun updateStatus(nikname: String, status: String) {
        println(status)
    }
}

class Room(
    val cover: String,
    val roomName: String,
    val users: MutableList<User>,
) {
    fun addUser(user: User) {
        users.add(user)
    }
}

fun main() {
    val user1 = User(
        nikname = "Trololo",
        status = "разговаривает",
        avatar = "img Тотошка",
    )

    val user2 = User(
        nikname = "Flowers Lover",
        status = "разговаривает",
        avatar = "img Пионы",
    )

    val user3 = User(
        nikname = "Overlord",
        status = "пользователь заглушен",
        avatar = "img Аниме",
    )

    val user4 = User(
        nikname = "Smurf",
        status = "микрофон выключен",
        avatar = "img Ворчун",
    )

    val room1 = Room(
        cover = "img Эквалайзер",
        roomName = "Музыка",
        users = mutableListOf(user1, user4, user2),
    )

    room1.addUser(user3)

    user3.updateStatus("Overlord", "разговаривает")

    println(room1.users)

}
package org.example.lesson_11

data class User(
    val nikname: String,
    var status: String,
    val avatar: String,
) {
    fun updateStatus(nikname: String, status: String) {
        println(status)
    }
}

class Room(
    val cover: String,
    val name: String,
    val users: MutableList<User>,
) {
    fun addUser(user: User) {
        users.add(user)
    }

    fun updateStatus(userName: String, userStatus: String) {
        for (user in users) {
            if (userName == user.nikname) {
                user.status = userStatus
            }
        }
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
        name = "Музыка",
        users = mutableListOf(user1, user4, user2),
    )

    room1.addUser(user3)
    room1.updateStatus("Overlord", "разговаривает")
    room1.updateStatus("Smurf", "пользователь заглушен")

    println(room1.users)
}
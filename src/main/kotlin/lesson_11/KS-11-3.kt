package org.example.lesson_11

data class UserForRoom(
    val nikname: String,
    var status: String,
    val avatar: String,
)

data class Room(
    val cover: String,
    val name: String,
    val users: MutableList<UserForRoom>,
) {
    fun addUser(user: UserForRoom) {
        users.add(user)
    }

    fun updateStatus(userName: String, userStatus: String) {
        users.find { it.nikname == userName }?.status = userStatus
    }
}

fun main() {
    val user1 = UserForRoom(
        nikname = "Trololo",
        status = "разговаривает",
        avatar = "img Тотошка",
    )
    val user2 = UserForRoom(
        nikname = "Flowers Lover",
        status = "разговаривает",
        avatar = "img Пионы",
    )
    val user3 = UserForRoom(
        nikname = "Overlord",
        status = "пользователь заглушен",
        avatar = "img Аниме",
    )
    val user4 = UserForRoom(
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
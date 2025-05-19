package org.example.lesson_11

import kotlin.String

class User (
    val nikname: String,
    val userStatus: String,
    val avatar: String,
)

class Rooms (
    val cover: String,
    val roomName: String,
    var listOfUsers: MutableList<User>,
)
{
    fun addUserToRoom(){
        listOfUsers.add(User)
    }
}

fun main(){
    val user1 = User(
        nikname = "Trololo",
        userStatus = "разговаривает",
        avatar = "img Тотошка",
    )

    val user2 = User(
        nikname = "Flowers Lover",
        userStatus = "разговаривает",
        avatar = "img Пионы",
    )

    val user3 = User(
        nikname = "Overlord",
        userStatus = "пользователь заглушен",
        avatar = "img Аниме",
    )

    val user4 = User(
        nikname = "Smurf",
        userStatus = "микрофон выключен",
        avatar = "img Ворчун",
    )

    val roomMusic = Rooms(
        cover = "img Эквалайзер",
        roomName = "Музыка",
        listOfUsers = mutableListOf(user1, user4, user2)
    )


}
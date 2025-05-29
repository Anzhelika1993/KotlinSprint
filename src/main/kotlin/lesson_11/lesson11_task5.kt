package org.example.lesson_11

class Forum(
    val listOfUsers: MutableList<Member>,
    val messages: MutableList<Message>,

    ) {
    private var userIdCounter = 0

    fun createNewUser(name: String): Member {

        val newUser = Member(userId = userIdCounter++, userName = name)
        listOfUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(memberId: Int, text: String) {

        val userIsMember = listOfUsers.find { it.userId == memberId }

        if (userIsMember != null) {
            val newMessege = Message(userIsMember, text)
            messages.add(newMessege)
        }
    }

    fun printThread() {
        messages.forEach {
            println("${it.author.userName}: ${it.message}")
        }
    }
}

data class Member(val userId: Int, val userName: String)

data class Message(val author: Member, val message: String)

fun main() {

    val forum = Forum(
        listOfUsers = mutableListOf(),
        messages = mutableListOf(),
    )
    val createdUser = forum.createNewUser("Overlord")
    val createdUser2 = forum.createNewUser("Smurf")

    forum.createNewMessage(createdUser.userId, "Привет всем!")
    forum.createNewMessage(createdUser.userId, "Есть кто?")
    forum.createNewMessage(createdUser.userId, "Привет привет")
    forum.createNewMessage(createdUser.userId, "Вы уже слушали новый альбом Антона Маскелиаде?")
    forum.createNewMessage(createdUser.userId, "Нет, кинь ссылку")

    forum.printThread()
}
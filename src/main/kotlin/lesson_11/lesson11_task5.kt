package org.example.lesson_11

class Forum(
    val listOfUsers: MutableList<Member>,
    val messages: MutableList<Message>,
) {
    fun createNewUser(name: String): Member {
        val elements = 0..9
        val number = 8
        var userIdCounter = 0

        for (i in 0..number) {
            userIdCounter++
        }
        val newUser = Member(userId = userIdCounter, userName = name)
        listOfUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(member: Member, text: String) {
        val userIsMember = listOfUsers.find { it == member }

        if (userIsMember != null) {
            val newMessege = Message(member, text)
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
    val createdUserId = forum.createNewUser("Overlord")
    val createdUserId2 = forum.createNewUser("Smurf")

    forum.createNewMessage(createdUserId, "Привет всем!")
    forum.createNewMessage(createdUserId, "Есть кто?")
    forum.createNewMessage(createdUserId2, "Привет привет")
    forum.createNewMessage(createdUserId, "Вы уже слушали новый альбом Антона Маскелиаде?")
    forum.createNewMessage(createdUserId2, "Нет, кинь ссылку")

    forum.printThread()

    val createdUserId3 = forum.createNewUser("Urlih")
    println(createdUserId)
    println(createdUserId2)
    println(createdUserId3)
}
package org.example.lesson_11

data class Forum(
    val listOfUsers: MutableList<Member>,
    val messages: MutableList<Message>,
) {
    fun createNewUser(name: String): Member {
        val elements = 0..9
        val number = 8
        var userId = ""
        for (i in 0..number) {
            userId += elements
        }
        val newUser = Member(userId = userId, userName = name)
        listOfUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(memberId: Member, text: String) {
        val userIsMember= listOfUsers.find{it == memberId}
//        for (member in listOfUsers) {
//            if (member.userId == member) {
            if (userIsMember != null){
                val newMessege = Message(memberId, text)
                messages.add(newMessege)
            }
        }


    fun printThread() {
        for (msg in messages) {
            for (member in listOfUsers) {
                if (msg.authorId == member) {
                    println("${member.userName}: ${msg.message}")
                }
            }
        }
    }
}

data class Member(val userId: String, val userName: String)

data class Message(val authorId: Member, val message: String,)

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
}
package org.example.lesson_14

fun main() {

    val user1 = User("Overlord")
    val user2 = User("Smurf")
    val user3 = User("Panda")
    val user4 = User("Kiwi")
    val listOfUsers = mutableListOf(user1, user2, user3, user4)

    var chat = Chat(mutableListOf(), listOfUsers)
    val beginOfThread = chat.addMessage("Привет всем! Go в Overcooked", user4)
    //  надо создать тред от этого сообщения
    chat.addThreadMessage(user3, "Здаров. Неее давайте че-нить другое, надоело", beginOfThread.id)
    chat.addThreadMessage(user2, "Привет, давайте я за", beginOfThread.id)
    chat.addThreadMessage(user2, "Привет, да ладно тебе, весело же))", beginOfThread.id)
    chat.addThreadMessage(user3, "Да вы опять все пересретесь", beginOfThread.id)
    chat.addThreadMessage(user1,"Мы любя))", beginOfThread.id)

}

class Chat(
    val messages: MutableList<Message>,
    val users: MutableList<User>
) {
    fun addMessage(text: String, author: User): Message {
        var idCounter = 0
        idCounter += 1
        val message = Message(author = author, text = text, id = idCounter)
        return message
    }

    fun addThreadMessage(author: User, text: String, parentMessageId: Int): ChildMessage {
        var idCounterForthread = 0
        idCounterForthread += 1
        val threadMessage =
            ChildMessage(author = author, text = text, id = idCounterForthread, parentMessageId = parentMessageId)
        return threadMessage
    }

    fun printThread(){}
}

open class Message(
    val author: User,
    val text: String,
    val id: Int
)

class ChildMessage(
    author: User,
    text: String,
    id: Int,
    val parentMessageId: Int
) : Message(author, text, id)

class User(
    val author: String
)
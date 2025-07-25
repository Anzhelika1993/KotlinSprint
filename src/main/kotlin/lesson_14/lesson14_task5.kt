package org.example.lesson_14

var idCounter = 1
var idCounterForThread = 1

fun main() {

    val user1 = User("Overlord")
    val user2 = User("Smurf")
    val user3 = User("Panda")
    val user4 = User("Kiwi")
    val listOfUsers = mutableListOf(user1, user2, user3, user4)

    val chat = Chat(mutableListOf(), listOfUsers)
    val beginOfThread = chat.addMessage("Привет всем! Go в Overcooked", user4)
    val threadMsg: MutableList<ChildMessage> = mutableListOf(
        chat.addThreadMessage(user3, "Здаров. Неее давайте че-нить другое, надоело", beginOfThread.id),
        chat.addThreadMessage(user2, "Привет, давайте я за", beginOfThread.id),
        chat.addThreadMessage(user2, "Привет, да ладно тебе, весело же))", beginOfThread.id),
        chat.addThreadMessage(user3, "Да вы опять все пересретесь", beginOfThread.id),
        chat.addThreadMessage(user1, "Мы любя))", beginOfThread.id),
    )

    val beginOfThread2 = chat.addMessage("Может в КС?", user3)
    val threadMsg2: MutableList<ChildMessage> = mutableListOf(
        chat.addThreadMessage(user2, "я не хочу в КС", beginOfThread2.id)
    )

    chat.printChat()
}

class Chat(
    val messages: MutableList<Message>,
    val users: MutableList<User>
) {
    fun addMessage(text: String, author: User): Message {
        idCounter += 1
        val message = Message(author = author, text = text, id = idCounter)
        messages.add(message)
        return message
    }

    fun addThreadMessage(author: User, text: String, parentMessageId: Int): ChildMessage {
        idCounterForThread += 1
        val threadMessage = ChildMessage(
            author = author, text = text, id = idCounterForThread, parentMessageId
        )
        messages.add(threadMessage)
        return threadMessage
    }

    fun printChat() {
        val groupedMsg = messages.groupBy { it ->
            if (it is ChildMessage)
                it.parentMessageId else it.id
        }

        groupedMsg.forEach { (parentMessageId, message) ->
            val mainMsg = message.first()
            println("${mainMsg.author}: ${mainMsg.text}")

            message.filterIsInstance<ChildMessage>().forEach {
                println("\t ${it.author}: ${it.text}")
            }
        }
    }
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

data class User(
    val author: String
)
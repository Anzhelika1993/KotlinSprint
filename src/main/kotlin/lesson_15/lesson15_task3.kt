package org.example.lesson_15

fun main() {
    val user1 = User("Smurf", 258)
    val user2 = User("Kiwi", 259)
    val admin = Admin("Admin01", 111, true)

    user1.readMsg()
    user1.textMsg()
    user2.textMsg()
    admin.deleteMsg(2)
    user2.textMsg()
    admin.deleteMsg(3)
    admin.deleteUser(user2)
}

abstract class ForumUser(val name: String, val id: Int) {
    fun readMsg() {
        println("$name читает сообщения на форуме")
    }

    fun textMsg() {
        println("$name пишет сообщение")
    }
}

class User(name: String, id: Int) : ForumUser(name, id)

class Admin(name: String, id: Int, val adminStatus: Boolean) : ForumUser(name, id) {

    fun deleteUser(user: User) {
        println("Администратор $name удалил пользователя ${user.name}")
    }

    fun deleteMsg(msgId: Int) {
        println("Администратор $name удалил сообщение")
    }
}
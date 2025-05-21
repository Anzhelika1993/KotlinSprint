package org.example.lesson_11

import org.example.lesson_10.random

class Forum (
    val listOfUsers: MutableList<Member>,
    val forumMessage: Message,
    val user: Member,
){
    fun createNewUser(name: String = readln(), ) {
        val elements = 0..9
        val number = 8
        for (i in 0..number) {
            elements.random()
            user.userId.add(random())
        }
        Member(userId = user.userId, userName = name)
        listOfUsers.add(user)
    }
}

class Member (
    var userId: MutableList<Int>,
    val userName: String,
)
class Message (
    val authorId: Member,
    val message: String,
)

fun main() {


}
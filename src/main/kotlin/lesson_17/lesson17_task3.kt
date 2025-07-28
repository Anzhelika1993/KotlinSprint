package org.example.lesson_17

fun main() {

    val folder1 = Folder("Приказы", 27, false)
    val folder2 = Folder("Реестры выплат", 49, true)

    println("Имя папки: ${folder1.name}")
    println("Имя папки: ${folder2.name}")
    println("Количество файлов: ${folder1.count}")
    println("Количество файлов: ${folder2.count}")
}

class Folder(private val _name: String, private var _count: Int, private val isSecret: Boolean) {

    val name: String
        get() = if (isSecret) "Скрытая папка" else _name

    val count: Int
        get() = if (isSecret) 0 else _count
}
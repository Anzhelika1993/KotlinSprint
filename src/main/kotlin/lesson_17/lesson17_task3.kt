package org.example.lesson_17

fun main() {

    val folder1 = Folder("Приказы", 27, false)
    val folder2 = Folder("Реестры выплат", 49, true)

    println(folder1.name)
    println(folder2.name)
}

class Folder(private val _name: String, private var count: Int, private val isSecret: Boolean) {

    val name: String
        get() {
            return if (isSecret) {
                count = 0
                "Скрытая папка. Количество файлов: $count"
            } else {
                "Папка: $_name. Количество файлов: $count"
            }
        }
}
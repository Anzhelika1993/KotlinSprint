package org.example.lesson_19

fun main() {

    for (action in Spaceship.entries){
        action.getAction()
    }
}

enum class Spaceship {
    TAKEOFF {
        override fun getAction() {
            // TODO: добавить проверку топлива
        }
    },
    LOAD {
        override fun getAction() {
            // добавить логику приземления
        }
    },
    SHOOT {
        override fun getAction() {
            TODO()
        }
    };

    abstract fun getAction()
}
package org.example.lesson_17

fun main() {

    val quiz = QuizQuestion("Кто такой Джон Голт?", "Протестующий на акции Движения чаепития")
    println("Вопрос: ${quiz.question}")
    println("Верный ответ: ${quiz.answer}")

    quiz.answer = "Король Севера"
    println("Ответ участника: ${quiz.answer}")
 }

class QuizQuestion(
    private var _question: String,
    private var _answer: String
) {
    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value: String) {
            _answer = value
        }
}
package uz.ferganagroup.teztop.model

import java.io.Serializable

data class ScienceModel(
    val title: String,
    val quizList: List<QuizModel>
): Serializable


data class QuizModel(
    val title: String,
    val image: Int?,
    val answerA: String,
    val answerB: String,
    val answerC: String,
    val answerD: String,
    val correctAnswer: String
): Serializable
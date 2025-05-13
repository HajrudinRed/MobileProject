package com.example.quizlizard.data

import androidx.annotation.DrawableRes

data class Question(
    val questionText: String,
    val possibleAnswers: List<String>,
    val correctAnswerIndex: Int,
    val questionNumber:String,
    @DrawableRes val questionImage: Int
)

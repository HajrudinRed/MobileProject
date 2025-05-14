package com.example.quizlizard.data

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

object Score {
    var value by mutableStateOf(0)
}

object ScoreFlags {
    var value by mutableStateOf(0)
}

object ScoreHistory {
    var value by mutableStateOf(0)
}
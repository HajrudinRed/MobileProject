package com.example.quizlizard.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.os.Handler
import android.os.Looper
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizlizard.data.QuestionData
import com.example.quizlizard.data.ScoreFlags



@Composable
fun quizGameScreenFlags(
    navigateToFinishFlagsQuiz: (Int) -> Unit
) {
    val backgroundColor = Color(android.graphics.Color.parseColor("#ECE6D6"))
    val headerColor = Color(0xFF800020) // Burgundy color for the header
    val buttonColor = Color(0xFF800020) // Burgundy color for buttons

    var currentQuestionIndex by remember { mutableStateOf(0) }
    val flagQuestions = QuestionData.flagQuestions
    var selectedButtonIndex by remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        // Top AppBar-style header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(headerColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Quiz Counries",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // Main Content
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .weight(1f)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (currentQuestionIndex < flagQuestions.size) {
                val currentQuestion = flagQuestions[currentQuestionIndex]

                // Question Number
                Text(
                    text = "${currentQuestion.questionNumber} / 10",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = headerColor,
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                // Question Image
                Image(
                    painter = painterResource(id = currentQuestion.questionImage),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(vertical = 16.dp)
                )

                // Question Text
                Text(
                    text = currentQuestion.questionText,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                // Answer Buttons
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    currentQuestion.possibleAnswers.forEachIndexed { index, answer ->
                        Button(
                            onClick = {
                                if (index == currentQuestion.correctAnswerIndex) {
                                    ScoreFlags.value++
                                }
                                selectedButtonIndex = index

                                Handler(Looper.getMainLooper()).postDelayed({
                                    selectedButtonIndex = null
                                    if (currentQuestionIndex < flagQuestions.size - 1) {
                                        currentQuestionIndex++
                                    } else {
                                        navigateToFinishFlagsQuiz(ScoreFlags.value)
                                    }
                                }, 500)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                                .height(50.dp),
                            shape = RoundedCornerShape(25.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = when {
                                    selectedButtonIndex == index -> {
                                        if (index == currentQuestion.correctAnswerIndex) {
                                            Color.Green
                                        } else {
                                            Color.Red
                                        }
                                    }
                                    else -> buttonColor
                                }
                            )
                        ) {
                            Text(
                                text = answer,
                                color = Color.White,
                                fontSize = 16.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun QuizGameScreenFlagsPreview() {
    quizGameScreenFlags(navigateToFinishFlagsQuiz = {})
}
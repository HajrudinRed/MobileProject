package com.example.quizlizard.data

import com.example.quizlizard.R

object QuestionData {
    val questions = listOf(
        Question(
            questionText = "Which river runs through Egypt?",
            possibleAnswers = listOf("Nile", "Amazon", "Danube", "Yangtze"),
            correctAnswerIndex = 0,
            questionNumber = "1",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "Who painted the Mona Lisa?",
            possibleAnswers = listOf("Pablo Picasso", "Leonardo da Vinci", "Vincent van Gogh", "Michelangelo"),
            correctAnswerIndex = 1,
            questionNumber = "2",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "Which planet is known as the Red Planet?",
            possibleAnswers = listOf("Venus", "Mars", "Jupiter", "Mercury"),
            correctAnswerIndex = 3,
            questionNumber = "3",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "What is the largest planet in our solar system?",
            possibleAnswers = listOf("Earth", "Mars", "Jupiter", "Saturn"),
            correctAnswerIndex = 2,
            questionNumber = "4",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "Which scientist developed the theory of relativity?",
            possibleAnswers = listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking"),
            correctAnswerIndex = 1,
            questionNumber = "5",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "What is the chemical symbol for water?",
            possibleAnswers = listOf("H2O2", "CO2", "H2O", "O2"),
            correctAnswerIndex = 2,
            questionNumber = "6",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "Who wrote the play 'Romeo and Juliet'?",
            possibleAnswers = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "Leo Tolstoy"),
            correctAnswerIndex = 0,
            questionNumber = "7",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "What is the tallest mammal?",
            possibleAnswers = listOf("Elephant", "Giraffe", "Whale", "Horse"),
            correctAnswerIndex = 1,
            questionNumber = "8",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "What is the primary ingredient in guacamole?",
            possibleAnswers = listOf("Tomato", "Avocado", "Onion", "Lime"),
            correctAnswerIndex = 1,
            questionNumber = "9",
            questionImage = R.drawable.quizlizardlogo
        ),
        Question(
            questionText = "Which planet is known as the 'Red Planet'?",
            possibleAnswers = listOf("Venus", "Mars", "Jupiter", "Mercury"),
            correctAnswerIndex = 1,
            questionNumber = "10",
            questionImage = R.drawable.quizlizardlogo
        )
    )

    //Flags Data
    val flagQuestions = listOf(
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("France", "Italy", "Germany", "Spain"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "1", // Question number
            questionImage = R.drawable.flag_france // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("United States", "United Kingdom", "Canada", "Australia"),
            correctAnswerIndex = 1, // Index of the correct answer in the possibleAnswers list
            questionNumber = "2", // Question number
            questionImage = R.drawable.flag_america // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Brazil", "Argentina", "Colombia", "Mexico"),
            correctAnswerIndex = 3, // Index of the correct answer in the possibleAnswers list
            questionNumber = "3", // Question number
            questionImage = R.drawable.flag_mexico // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Japan", "China", "South Korea", "India"),
            correctAnswerIndex = 1, // Index of the correct answer in the possibleAnswers list
            questionNumber = "4", // Question number
            questionImage = R.drawable.flag_china // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Russia", "Ukraine", "Taiwan", "Sweden"),
            correctAnswerIndex = 2, // Index of the correct answer in the possibleAnswers list
            questionNumber = "5", // Question number
            questionImage = R.drawable.flag_taiwan // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Turkey", "Egypt", "Saudi Arabia", "Iran"),
            correctAnswerIndex = 2, // Index of the correct answer in the possibleAnswers list
            questionNumber = "6", // Question number
            questionImage = R.drawable.flag_saudi_arabia // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("South Africa", "Kenya", "Nigeria", "Egypt"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "7", // Question number
            questionImage = R.drawable.flag_sauth_africa // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Bosnia", "Italy", "Portugal", "Spain"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "8", // Question number
            questionImage = R.drawable.flag_bosnia_and_herzegovina // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Canada", "India", "New Zealand", "United Kingdom"),
            correctAnswerIndex = 1, // Index of the correct answer in the possibleAnswers list
            questionNumber = "9", // Question number
            questionImage = R.drawable.flag_india // Reference to the image of the flag
        ),
        Question(
            questionText = "Which country's flag is this?",
            possibleAnswers = listOf("Bulgaria", "Russia", "Bangladesh", "Sri Lanka"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "10", // Question number
            questionImage = R.drawable.flag_buglaria // Reference to the image of the flag
        )
    )

    //History Dat
    val historyQuestions = listOf(
        Question(
            questionText = "Which of the following civilizations is known for building the Great Wall?",
            possibleAnswers = listOf("China", "Egypt", "Greece", "Rome"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "1", // Question number
            questionImage = R.drawable.great_wall // Reference to the image related to the question
        ),
        Question(
            questionText = "Who was the first President of the United States?",
            possibleAnswers = listOf("George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "2", // Question number
            questionImage = R.drawable.george_washington // Reference to the image related to the question
        ),
        Question(
            questionText = "Who was the last of the 5 good emperors of Rome?",
            possibleAnswers = listOf("Julius Caesar", "Marcus Aurelius", "Nero", "Constantine"),
            correctAnswerIndex = 1, // Index of the correct answer in the possibleAnswers list
            questionNumber = "3", // Question number
            questionImage = R.drawable.marcus_aurelius// Reference to the image related to the question
        ),
        Question(
            questionText = "Which ancient civilization built the iconic Pyramids of Giza?",
            possibleAnswers = listOf("Ancient Egypt", "Ancient Greece", "Mesopotamia", "Persia"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "4", // Question number
            questionImage = R.drawable.pyramids_of_giza // Reference to the image related to the question
        ),
        Question(
            questionText = "Who was the founder of the Mongol Empire, one of the largest empires in history?",
            possibleAnswers = listOf("Genghis Khan", "Attila the Hun", "Tamerlane", "Kublai Khan"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "5", // Question number
            questionImage = R.drawable.gengis_khan // Reference to the image related to the question
        ),
        Question(
            questionText = "Which event marked the beginning of World War II?",
            possibleAnswers = listOf("Invasion of Poland", "Bombing of Pearl Harbor", "Signing of the Treaty of Versailles", "Battle of Stalingrad"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "6", // Question number
            questionImage = R.drawable.fall_of_berlin // Reference to the image related to the question
        ),
        Question(
            questionText = "Who is known as the 'Father of Modern Physics' and developed the theory of relativity?",
            possibleAnswers = listOf("Albert Einstein", "Nikola Tesla", "Isaac Newton", "Galileo Galilei"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "7", // Question number
            questionImage = R.drawable.albert_einstein // Reference to the image related to the question
        ),
        Question(
            questionText = "Who was the legendary Greek hero known for his role in the Trojan War?",
            possibleAnswers = listOf("Achilles", "Leonidas", "Alexander the Great", "Julius Caesar"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "8", // Question number
            questionImage = R.drawable.achilles // Reference to the image related to the question
        ),
        Question(
            questionText = "When did World War I start?",
            possibleAnswers = listOf("1914", "1915", "1916", "1917"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "9", // Question number
            questionImage = R.drawable.world_war_i // Reference to the image related to the question
        ),
        Question(
            questionText = "When did World War II start?",
            possibleAnswers = listOf("1939", "1940", "1941", "1942"),
            correctAnswerIndex = 0, // Index of the correct answer in the possibleAnswers list
            questionNumber = "10", // Question number
            questionImage = R.drawable.world_war_ii // Reference to the image related to the question
        )
    )
}
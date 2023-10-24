package com.example.quizapp

object Constants {
    const val USER_NAME:String="UserName"
    const val Total_Questions:String="total_Question"
    const val Correct_Answer:String="correct_answer"
    fun getQuestion():Array<Question>{
        val questionsList=ArrayList<Question>()
        val que1=Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            3
            )
        questionsList.add(que1)

        val que2=Question(2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            1
        )
        questionsList.add(que2)

        val que3=Question(3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bangladesh",
            "Burma",
            "belgium",
            "brazil",
            3
        )
        questionsList.add(que3)

        val que4=Question(4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "burma",
            "Armenia",
            "Australia",
            "brazil",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kazakhstan",
            "Kyrgyzstan",
            "Kuwait",
            "Kenya",
            3 // Correct answer is "Kuwait"
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominican Republic",
            "Denmark",
            "Djibouti",
            "Dominica",
            2 // Correct answer is "Denmark"
        )
        questionsList.add(que6)


        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Norway",
            "Nepal",
            "New Zealand",
            "Netherlands",
            3 // Correct answer is "New Zealand"
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Greece",
            "Guatemala",
            "Georgia",
            "Germany",
            4 // Updated correct answer to "Germany"
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland",
            "Indonesia",
            "Italy",
            "India",
            4 // Updated correct answer to "India"
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "France",
            "Fiji",
            "Finland",
            "Federated States of Micronesia",
            2 // Correct answer is "Fiji"
        )
        questionsList.add(que10)


        return questionsList.toTypedArray()


    }
}
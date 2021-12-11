package com.courseselection.finalproject;

public class Question {
    public String questions[] = {
            "Which is a Programming Language?",
            "In COMAL language program, after name of procedure parameters must be in?",
            "Programming language COBOL works best for use in?",
            "What does SQL stand for?",
            "Which SQL statement is used to extract data from a database?",
            "Which SQL statement is used to update data in a database?",
            "Which SQL statement is used to delete data from a database?",
            "Which SQL statement is used to insert new data in a database?",
            "With SQL, how do you select all the columns from a table named Persons",
            "The OR operator displays a record if"
    };
    public String choices[][] = {
            {"HTML", "CSS", "Vala", "PHP"},
            {"Punction Marks", "Back-Slash", "Brackets", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"},
            {"Strong Query Language", "Structured Query Language", "Structured Question Language","Simple Question Language"},
            {"Open", "Extract", "Get", "Select"},
            {"Update", "Save As", "Modify", "Save"},
            {"Delete", "Collapse","Remove", "Trunc"},
            { "Insert Into", "Delete", "Add", "Add New"},
            {"SELECT *. Persons", "SELECT * FROM Persons", "SELECT all FROM Persons", "SELECT FROM Persons"},
            {"ANY conditions listed are true","None conditions listed are true", "All conditions listed are true", "None of above"}


    };

    public String correctAnswer[] = {
            "PHP",
            "Brackets",
            "Commercial Applications",
            "Structured Query Language",
            "Select",
            "Modify",
            "Delete",
            "Insert Into",
            "SELECT * FROM Persons",
            "ANY conditions listed are true",
    };
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}

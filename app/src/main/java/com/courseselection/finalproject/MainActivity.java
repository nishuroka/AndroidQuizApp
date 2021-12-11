package com.courseselection.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;
    int score=0;
    int randQue = 0;


    private Question question = new Question();

    private String answer;
    private int questionLength = question.questions.length;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();


        btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);

        NextQuestion(random.nextInt(questionLength));
        randQue +=1;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText() == answer){
                    score+=1;
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }else{
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }

                break;

            case R.id.btn_two:
                if(btn_two.getText() == answer){
                    score+=1;
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }else{
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }

                break;

            case R.id.btn_three:
                if(btn_three.getText() == answer){
                    score+=1;
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }else{
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }

                break;

            case R.id.btn_four:
                if(btn_four.getText() == answer){
                    score+=1;
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }else{
                    if(randQue != 5) {
                        NextQuestion(random.nextInt(questionLength));
                        randQue+=1;
                    }else {
                        GameOver();
                    }
                }

                break;
        }
    }
    String msg;

    private void GameOver(){

        if(score < 3){
            msg = "Please try again!";
        }else if(score == 3) {
            msg = "Good job!";
        }else if(score == 4){
            msg = "Excellent work!";
        }else if (score == 5){
            msg = "You are a genius!";
        }
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Score:"+ score + ", "+msg)
                .setCancelable(false)
                .setPositiveButton("Start Over", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                });

        alertDialogBuilder.show();

    }
    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }

}
package com.example.ayana.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mScore;
    private TextView mColorName;
    private Button mLeftButton;
    private Button mRightButton;
    private int correctAnswerCount = 1;
    private int correctAnswer;
    static final private int QUIZ_COUNT = 10;
    private int quizCount = 1;

    ArrayList<ArrayList<Integer>> quizArray = new ArrayList<>();

    Integer quizData[][] = {
            {Color.LTGRAY, Color.BLACK, R.id.right_button, 1},
            {Color.GREEN, Color.RED, R.id.left_button, 2},
            {Color.CYAN, Color.BLUE, R.id.left_button, 3},
            {Color.GRAY, Color.LTGRAY, R.id.right_button, 4},
            {Color.MAGENTA, Color.WHITE, R.id.left_button, 5},
            {Color.YELLOW, Color.GREEN, R.id.left_button, 6},
            {Color.MAGENTA, Color.BLUE, R.id.right_button, 7},
            {Color.GREEN, Color.BLUE, R.id.left_button, 8},
            {Color.BLUE, Color.RED, R.id.right_button, 9},
            {Color.CYAN, Color.LTGRAY, R.id.left_button, 10},
    };

    public String convertToColorName(int no) {
        switch (no)
        {
            case 1:
                return "BLACK";
            case 2:
                return "GREEN";
            case 3:
                return "CYAN";
            case 4:
                return "LTGRAY";
            case 5:
                return "MAGENTA";
            case 6:
                return "YELLOW";
            case 7:
                return "BLUE";
            case 8:
                return "GREEN";
            case 9:
                return "RED";
            case 10:
                return "CYAN";
        }
        return "default";
    }

    public void showNextQuiz() {
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());
        ArrayList<Integer> quiz = quizArray.get(randomNum);
        mLeftButton.setBackgroundColor(quiz.get(0));
        mRightButton.setBackgroundColor(quiz.get(1));
        correctAnswer = quiz.get(2);
        mColorName.setText(convertToColorName(quiz.get(3)));
        quizArray.remove(randomNum);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore = findViewById(R.id.score);
        mColorName = findViewById(R.id.color_name);
        mLeftButton = findViewById(R.id.left_button);
        mRightButton = findViewById(R.id.right_button);

        for (int i=0; i < quizData.length; i++) {
            ArrayList<Integer> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); // left color
            tmpArray.add(quizData[i][1]); // right color
            tmpArray.add(quizData[i][2]); // correct answer
            tmpArray.add(quizData[i][3]); // color name
            quizArray.add(tmpArray);
        }

        showNextQuiz();
    }

    private void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void ButtonClicked(View view) {
        if (quizCount == QUIZ_COUNT) {
            toast("Finish quiz");
        } else {
            quizCount++;
            if (view.getId() == correctAnswer) {
                toast("Right answer!");
                mScore.setText("Score " + correctAnswerCount++);
            }else {
                toast("Wrong answer!");
            }
            showNextQuiz();
        }
    }
}

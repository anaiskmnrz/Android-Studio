package com.example.mapremiereapplication.controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mapremiereapplication.R;
import com.example.mapremiereapplication.model.Question;
import com.example.mapremiereapplication.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    TextView mQuestionTextView;
    Button mAnswerButton1;
    Button mAnswerButton2;
    Button mAnswerButton3;
    Button mAnswerButton4;

   /* private final QuestionBank mQuestionBank = generateQuestionBank();
    private int mRemainingQuestionCount;
    private int mScore;

    private Question mCurrentQuestion;

    public static final String BUNDLE_EXTRA_SCORE = "BUNDLE_EXTRA_SCORE";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionTextView = findViewById(R.id.game_activity_textview_question);
        mAnswerButton1 = findViewById(R.id.game_activity_button_1);
        mAnswerButton2 = findViewById(R.id.game_activity_button_2);
        mAnswerButton3 = findViewById(R.id.game_activity_button_3);
        mAnswerButton4 = findViewById(R.id.game_activity_button_4);

        // Use the same listener for the four buttons.
// The view id value will be used to distinguish the button triggered
        /*
        mAnswerButton1.setOnClickListener(this);
        mAnswerButton2.setOnClickListener(this);
        mAnswerButton3.setOnClickListener(this);
        mAnswerButton4.setOnClickListener(this);

        displayQuestion(mQuestionBank.getCurrentQuestion());
        mRemainingQuestionCount = 12;
        mScore = 0;
    }*/

   /* public QuestionBank generateQuestionBank() {
        Question question1 = new Question(
                "Quelle est la capitale du Kazakhstan ?",
                Arrays.asList(
                        "Noursoultan",
                        "Tachkent",
                        "Astana",
                        "Bichkek"
                ),
                2
        );

        Question question2 = new Question(
                "Quelle est la capitale de l'Australie ?",
                Arrays.asList(
                        "Canberra",
                        "Melbourne",
                        "Brisbane",
                        "Sydney"
                ),
                0
        );

        Question question3 = new Question(
                "Quelle est la capitale du Tchad ?",
                Arrays.asList(
                        "N’Djamena",
                        "Abéché",
                        "Sarh",
                        "Moundou"
                ),
                0
        );
        Question question4 = new Question(
                "Quelle est la capitale du Canada ?",
                Arrays.asList(
                        "Quebec",
                        "Ottawa",
                        "Toronto",
                        "Monreal"
                ),
                1
        );
        Question question5 = new Question(
                "Quelle est la capitale de l'Espagne ?",
                Arrays.asList(
                        "Barcelone",
                        "Valence",
                        "Madrid",
                        "Séville"
                ),
                2
        );
        Question question6 = new Question(
                "Quelle est la capitale de l'Inde ?",
                Arrays.asList(
                        "Mumbai",
                        "New Dehli",
                        "Calcutta",
                        "Bombay"
                ),
                1
        );
        Question question7 = new Question(
                "Quelle est la capitale du Tchad ?",
                Arrays.asList(
                        "Haïphong",
                        "Da Nang",
                        "Hô Chi Minh‑Ville",
                        "Hanoï"
                ),
                3
        );
        Question question8 = new Question(
                "Quelle est la capitale de la Corée du Nord ?",
                Arrays.asList(
                        "Pyongyang",
                        "Hamhung",
                        "Chongjin",
                        "Nampo"
                ),
                0
        );        Question question9 = new Question(
                "Quelle est la capitale de la Suisse ?",
                Arrays.asList(
                        "Genève",
                        "Zurich",
                        "Berne",
                        "Lausanne"
                ),
                2
        );
        Question question10 = new Question(
                "Quelle est la capitale du Yémen ?",
                Arrays.asList(
                        "Al-Hodeïda",
                        "Sanaa",
                        "Ta'izz",
                        "Aden"
                ),
                1
        );
        Question question11 = new Question(
                "Quelle est la capitale de la Nouvelle-Zélande ?",
                Arrays.asList(
                        "Christchurch",
                        "Hamilton",
                        "Auckland",
                        "Wellington"
                ),
                3
        );
        Question question12 = new Question(
                "Quelle est la capitale du Botswana ?",
                Arrays.asList(
                        "Selebi-Phikwe",
                        "Molepolole",
                        "Francistown",
                        "Gaborone"
                ),
                3
        );


        return new QuestionBank(Arrays.asList(question1, question2, question3));
    }*/

   /* private void displayQuestion(final Question question) {
        mQuestionTextView.setText(question.getQuestion());
        mAnswerButton1.setText(question.getChoiceList().get(0));
        mAnswerButton2.setText(question.getChoiceList().get(1));
        mAnswerButton3.setText(question.getChoiceList().get(2));
        mAnswerButton4.setText(question.getChoiceList().get(3));
    }
*/
   /* @Override
    public void onClick(View v) {

        int index;

        if (v == mAnswerButton1) {
            index = 0;
        } else if (v == mAnswerButton2) {
            index = 1;
        } else if (v == mAnswerButton3) {
            index = 2;
        } else if (v == mAnswerButton4) {
            index = 3;
        } else {
            throw new IllegalStateException("Unknown clicked view : " + v);
        }

        if (index == mQuestionBank.getCurrentQuestion().getAnswerIndex()) {
            mScore ++;
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }

        mRemainingQuestionCount--;

        if (mRemainingQuestionCount > 0) {
            mCurrentQuestion = mQuestionBank.getNextQuestion();
            displayQuestion(mCurrentQuestion);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Well done!")
                    .setMessage("Your score is " + mScore)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .create()
                    .show();
            Intent intent = new Intent();
            intent.putExtra(BUNDLE_EXTRA_SCORE, mScore);
            setResult(RESULT_OK, intent);
            finish();
        }
*/
    }
}
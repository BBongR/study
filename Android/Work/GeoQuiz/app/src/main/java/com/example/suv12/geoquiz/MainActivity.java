package com.example.suv12.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 0;

    private TextView txtQuiz;
    private Button   btnBefore, btnNext, btnTrue, btnFalse, btnCunning;
    private boolean isCheater;

    private int index = 0;
    private ModelQuiz[] quiz = new ModelQuiz[]{
            new ModelQuiz( R.string.quiz_one,   true  ),
            new ModelQuiz( R.string.quiz_two,   false ),
            new ModelQuiz( R.string.quiz_three, false ),
            new ModelQuiz( R.string.quiz_fore,  true  ),
            new ModelQuiz( R.string.quiz_five,  true  ) };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQuiz = findViewById( R.id.txtQuiz );
        txtQuiz.setText( quiz[ index ].getQuizId() );
        txtQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = ( index + 1 ) % quiz.length;
                updateQuestion();
            }
        }); // txtQuiz()

        btnBefore = findViewById( R.id.btnBefore );
        btnBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( index == 0 ) {
                    index = quiz.length;
                }
                index = ( index - 1 ) % quiz.length;
                updateQuestion();
            }
        }); // btnBefore()

        btnNext = findViewById( R.id.btnNext );
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = ( index + 1 ) % quiz.length;
                isCheater = false;
                updateQuestion();
            }
        }); // btnNext()

        btnTrue = findViewById( R.id.btnTrue );
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer( true );
            }
        }); // btnTrue()

        btnFalse = findViewById( R.id.btnFalse );
        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer( false );
            }
        });

        btnCunning = findViewById( R.id.btnCunning );
        btnCunning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = quiz[ index ].isAnswer();
                Intent i = CunningActivity.newIntent( getApplicationContext(), answer );
                startActivityForResult( i, REQUEST_CODE );
            }
        }); // btnCunning()
    } // onCreate()

    private void updateQuestion() {
        int question = quiz[ index ].getQuizId();
        txtQuiz.setText( question );
    } // updateQuestion()

    private void checkAnswer( boolean userAnswer ) {
        boolean tempAnswer = quiz[ index ].isAnswer();

        int message;

        if ( isCheater ) {
            message = R.string.cunning_toast;
        } else {
            if ( userAnswer == tempAnswer ) {
                message = R.string.correct_toast;
            } else {
                message = R.string.error_toast;
            }
        }
        Toast.makeText( getApplicationContext(), message, Toast.LENGTH_SHORT ).show();
    } // checkAnswer()

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if( resultCode != Activity.RESULT_OK ) {
            return;
        }

        if( requestCode == REQUEST_CODE ) {
            if( data == null ) {
                return;
            }
            isCheater = CunningActivity.wasAnswerShow( data );
        }
    }
}

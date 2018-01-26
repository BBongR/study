package com.example.suv12.geoquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CunningActivity extends AppCompatActivity {

    private static final String EXTRA_ANSWER_CODE = "com.example.suv12.geoquiz.answer_code";
    public static final String EXTRA_ANSWER_SHOW = "com.example.suv12.geoquiz.answer_show";

    private TextView txtAnswer;
    private Button   btnAnswer;
    private boolean  answer;

    public static Intent newIntent(Context context, boolean answer ){
        Intent i = new Intent( context, CunningActivity.class );
        i.putExtra( EXTRA_ANSWER_CODE, answer );
        return i;
    } // newIntent()

    private void answerShowResult( boolean check ) {
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOW, check );
        setResult( Activity.RESULT_OK, data );
    } //answerShowResult()

    public static boolean wasAnswerShow( Intent result ) {
        return result.getBooleanExtra( EXTRA_ANSWER_SHOW, false );
    } // wasAnswerShow()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cunning);

        answer = getIntent().getBooleanExtra( EXTRA_ANSWER_CODE, false );
        txtAnswer = findViewById( R.id.txtAnswer );

        btnAnswer = findViewById( R.id.btnAnswer );
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( answer ) {
                    txtAnswer.setText( R.string.true_button );
                } else {
                    txtAnswer.setText( R.string.false_button );
                }
                answerShowResult( true );
            }
        }); // btnAnswer()
    }
}

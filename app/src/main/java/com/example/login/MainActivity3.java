package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android. view.View;

public class MainActivity3<intent> extends AppCompatActivity {
    private Button button;

    private TextView mQuestionText;
    private Button mTrueButton, mFalseButton, mNextButton;
    private int nCurrentIndex = 0;

    private final TrueFalse[] mQuestions = new TrueFalse[]{
            new TrueFalse(R.string.question_one, true),
            new TrueFalse(R.string.question_two, true),
            new TrueFalse(R.string.question_three, false),
            new TrueFalse(R.string.question_four, false)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });


        mQuestionText=findViewById(R.id. question_text_view);
        final int Question = mQuestions [nCurrentIndex].getmQuestion();
        mQuestionText.setText (Question);

        mTrueButton= findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(view -> checkAnswer ());
        mFalseButton=findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(view -> checkAnswer());

        mNextButton =findViewById(R.id.next_button);
        mNextButton.setOnClickListener(view -> {
            nCurrentIndex=(nCurrentIndex+1) % mQuestions.length;
            int question = mQuestions[nCurrentIndex].getmQuestion();
            mQuestionText.setText(question);

        });
         {




         }



}

    private void checkAnswer() {
    }

    public void openActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }}
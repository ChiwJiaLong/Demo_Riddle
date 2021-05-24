package sg.edu.rp.c346.id20031634.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("AnswerActivity1", "onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");

        tvAnswer = findViewById(R.id.textViewR1);
        if (questionSelected.equalsIgnoreCase("Q1")) {


            tvAnswer.setText(questionSelected + " Answer is: Queue");
        } else if (questionSelected.equalsIgnoreCase("Q2")) {
            tvAnswer.setText(questionSelected + " Answer is: Gone");
        }
    }
    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}
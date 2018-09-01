package com.example.android.trivialtrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void questionTwoClicked(View view){
        boolean questionTwo = ((RadioButton) view) .isChecked();
        switch(view.getId()){
            case R.id.question_two_answer:
                if(questionTwo)
                    Toast.makeText(this, "Correct!!", Toast.LENGTH_SHORT).show();
        }
    }
    public void questionFourClicked(View view){
        boolean questionFour = ((RadioButton) view) .isChecked();
        switch(view.getId()){
            case R.id.question_four_answer:
                if(questionFour)
                    Toast.makeText(this, "Correct!!", Toast.LENGTH_SHORT).show();
        }
    }
    public void questionFiveClicked(View view){
        boolean questionFive = ((RadioButton) view) .isChecked();
        switch(view.getId()){
            case R.id.question_five_answer:
                if(questionFive)
                    Toast.makeText(this, "Correct!!", Toast.LENGTH_SHORT).show();
        }
    }
    public void questionSixClicked(View view){
        boolean questionSix = ((RadioButton) view) .isChecked();
        switch(view.getId()){
            case R.id.question_six_answer:
                if(questionSix)
                    Toast.makeText(this, "Correct!!", Toast.LENGTH_SHORT).show();
        }
    }
    public void questionSevenClicked(View view){
        boolean questionSeven = ((RadioButton) view) .isChecked();
        switch(view.getId()){
            case R.id.question_seven_answer:
                if(questionSeven)
                    Toast.makeText(this, "Correct!!", Toast.LENGTH_SHORT).show();
        }
    }
}

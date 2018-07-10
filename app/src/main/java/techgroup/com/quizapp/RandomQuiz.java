package techgroup.com.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RandomQuiz extends AppCompatActivity {

  int firstanswer;
  int secondanswer;
  int thirdanswer;
  int fourthanswer;
  int fifthanswer;
  int sixthanswer;
  int totalScore;


  RadioButton none;
  EditText editText_answer;
  RadioButton swift;
  RadioButton Daniel;
  RadioButton micheal;
  RadioButton harry;
  Button submit;
  Button retake_Quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_quiz);

        none = (RadioButton) findViewById(R.id.none);
        editText_answer = (EditText) findViewById(R.id.first_edittext_answer);
        swift = (RadioButton) findViewById(R.id.swift);
        submit = (Button) findViewById(R.id.submit_answer);
        Daniel = (RadioButton) findViewById(R.id.daniel_craig);
        harry = (RadioButton) findViewById(R.id.harry_kane);
        micheal = (RadioButton) findViewById(R.id.micheal);
        retake_Quiz = (Button) findViewById(R.id.retake_quiz);
        answer();


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              answer();
            }
        });
        retake_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RandomQuiz.this,RandomQuiz.class);
                startActivity(intent);
            }
        });




    }
    public  void answer(){
        Boolean answer1;
        answer1 = none.isChecked();
        if (answer1){
            firstanswer = 1;

        }else{
            firstanswer = 0;

        }

        Boolean answer2;
        answer2 = editText_answer.getText().toString().equals("marvel");
        if (answer2){
            secondanswer = 1;
        }else{
            secondanswer = 0;
        }

        Boolean answer3;
        answer3 = swift.isChecked();
        if (answer3){
            thirdanswer= 1;
        }else{
            thirdanswer = 0;
        }

        Boolean answer4;
        answer4 = Daniel.isChecked();
        if (answer4){
            fourthanswer = 1;
        }else{
            fourthanswer = 0;
        }
        Boolean answer5;
        answer5 = micheal.isChecked();
        if (answer5){
            fifthanswer = 1;
        }else{
            fifthanswer = 0;
        }
        Boolean answer6;
        answer6 = micheal.isChecked();
        if (answer6){
           sixthanswer = 1;
        }else{
            sixthanswer = 0;
        }

        totalScore = firstanswer + secondanswer + thirdanswer + fourthanswer + fifthanswer +sixthanswer;
        if (totalScore == 6){
            toastmessage(" you did well  , Do enjoy choosing a greater challenge ");
            Intent intent = new Intent(RandomQuiz.this,NewQuiz.class);
            startActivity(intent);
        }
        else {
            toastmessage("you suck , you scored" +  " " + totalScore + " pls do retake the test ");
        }
    }


    public void toastmessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}

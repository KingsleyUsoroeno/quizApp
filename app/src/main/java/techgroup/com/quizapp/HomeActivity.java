package techgroup.com.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    RandomQuiz random_quiz_class;
    Button randomQuiz;
    Button nextQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

      randomQuiz = (Button) findViewById(R.id.button_random_quiz);
      nextQuiz = (Button) findViewById(R.id.button_next_quiz);


        randomQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,RandomQuiz.class);
                startActivity(intent);
            }
        });
        nextQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this,"Please play the RandomQuiz to Automatically unlock these level",Toast.LENGTH_LONG).show();
/*
                if (random_quiz_class.totalScore == 6){
                    Intent intent = new Intent(HomeActivity.this,NewQuiz.class);
                    startActivity(intent);
                }
*/

            }
        });
    }
}

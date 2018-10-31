package com.application.brainfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class G3Easy extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et4,et5,et6;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g3_easy);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);


        submitbtn = (Button) findViewById(R.id.submitbtn);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = et1.getText().toString();
                String ans2 = et2.getText().toString();
                String ans3 = et3.getText().toString();
                String ans4 = et4.getText().toString();
                String ans5 = et5.getText().toString();
                String ans6 = et6.getText().toString();

                int score;
                if (ans1.matches("") && ans2.matches("") && ans3.matches("") && ans4.matches("") && ans5.matches("")
                        && ans6.matches("")) {
                    Toast.makeText(getApplicationContext(), "Please answer atleast one question", Toast.LENGTH_LONG).show();
                } else {
                    if (ans1.equals("Parachute") && ans2.equals("Graduation") &&
                            ans3.equals("Baguette") && ans4.equals("Thumb") &&
                            ans5.equals("Recycle") && ans6.equals("Binder")) {
                        score = 100;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if ((ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette") && ans4.equals("Thumb") && ans5.equals("Recycle"))
                            || (ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette") && ans4.equals("Thumb") && ans6.equals("Binder"))
                            || (ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette") && ans5.equals("Recycle") && ans6.equals("Binder"))
                            || (ans1.equals("Parachute") && ans2.equals("Graduation") && ans4.equals("Thumb") && ans5.equals("Recycle") && ans6.equals("Binder"))
                            || (ans1.equals("Parachute") && ans3.equals("Baguette") && ans4.equals("Thumb") && ans5.equals("Recycle") && ans6.equals("Binder"))
                            || (ans2.equals("Graduation") && ans3.equals("Baguette") && ans4.equals("Thumb") && ans5.equals("Recycle") && ans6.equals("Binder"))) {
                        score = 85;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("Parachute") && ans4.equals("Thumb") && ans5.equals("Recycle") && ans6.equals("Binder"))  ||
                            (ans1.equals("Parachute") && ans3.equals("Baguette") && ans5.equals("Recycle") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans3.equals("Baguette") && ans4.equals("Thumb") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans3.equals("Baguette") && ans4.equals("Thumb") && ans5.equals("Recycle")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans5.equals("Recycle") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans4.equals("Thumb") && ans5.equals("Recycle")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette") && ans5.equals("Recycle")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette") && ans4.equals("Thumb")) ) {
                        score = 68;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("Parachute") && ans2.equals("Graduation") && ans3.equals("Baguette")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans5.equals("Recycle")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans5.equals("Recycle") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans4.equals("Thumb") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans4.equals("Thumb") && ans5.equals("Recycle")) ||
                            (ans4.equals("Thumb") && ans5.equals("Recycle") && ans6.equals("Binder")) ||
                            (ans3.equals("Baguette") && ans5.equals("Recycle") && ans6.equals("Binder")) ||
                            (ans1.equals("Parachute") && ans4.equals("Thumb") && ans6.equals("Binder")) ||
                            (ans3.equals("Baguette") && ans4.equals("Thumb") && ans5.equals("Recycle")) ||
                            (ans1.equals("Parachute") && ans2.equals("Graduation") && ans4.equals("Thumb")) ||
                            (ans2.equals("Graduation") && ans3.equals("Baguette") && ans4.equals("Thumb")) ||
                            (ans2.equals("Graduation") && ans3.equals("Baguette") && ans5.equals("Recycle")) ||
                            (ans2.equals("Graduation") && ans3.equals("Baguette") && ans6.equals("Binder"))){
                        score = 51;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("Parachute") && ans2.equals("Graduation")) ||(ans1.equals("Parachute") && ans3.equals("Baguette")) ||
                            (ans1.equals("Parachute") && ans4.equals("Thumb")) ||(ans1.equals("Parachute") && ans5.equals("Recycle")) ||
                            (ans1.equals("Parachute") && ans6.equals("Binder")) ||(ans2.equals("Graduation") && ans3.equals("Baguette")) ||
                            (ans2.equals("Graduation") && ans4.equals("Thumb")) ||(ans2.equals("Graduation") && ans5.equals("Recycle")) ||
                            (ans2.equals("Graduation") && ans6.equals("Binder")) ||(ans3.equals("Baguette") && ans4.equals("Thumb")) ||
                            (ans3.equals("Baguette") && ans5.equals("Recycle")) ||(ans3.equals("Baguette") && ans6.equals("Binder")) ||
                            (ans4.equals("Thumb") && ans5.equals("Recycle")) ||(ans4.equals("Thumb") && ans6.equals("Binder")) ||
                            (ans5.equals("Recycle") && ans6.equals("Binder"))){
                        score = 34;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if (ans1.equals("Parachute") || ans2.equals("Graduation") ||
                            ans3.equals("Baguette") || ans4.equals("Thumb") ||
                            ans5.equals("Recycle") || ans6.equals("Binder")){
                        score = 17;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else{
                        score = 0;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }
                }
                finish();
            }
        });
    }
}

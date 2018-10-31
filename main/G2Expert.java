package com.application.brainfit;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class G2Expert extends AppCompatActivity {
    private final int SPEECH_RECOGNITION_CODE = 1;
    private TextView tv1, tv2, tv3, tv4, tv5;
    private ImageButton mic1, mic2, mic3, mic4, mic5;
    Button nextbtn;

    String ans1 = "stop living within the limitation of what people think of you";
    String ans2 = "airplane";
    String ans3 = "beach";
    String ans4 = "bed sheet";
    String ans5 = "success is a journey not a destination";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g2_expert);
        Intent i = getIntent();
        final int prevscore = i.getIntExtra("n",0);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);

        nextbtn = (Button) findViewById(R.id.nextbtn);

        mic1 = (ImageButton) findViewById(R.id.btn_mic1);
        mic2 = (ImageButton) findViewById(R.id.btn_mic2);
        mic3 = (ImageButton) findViewById(R.id.btn_mic3);
        mic4 = (ImageButton) findViewById(R.id.btn_mic4);
        mic5 = (ImageButton) findViewById(R.id.btn_mic5);

        mic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        "Speak something...");
                try {
                    startActivityForResult(intent, 1);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Sorry! Speech recognition is not supported in this device.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        mic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        "Speak something...");
                try {
                    startActivityForResult(intent, 2);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Sorry! Speech recognition is not supported in this device.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        mic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        "Speak something...");
                try {
                    startActivityForResult(intent, 3);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Sorry! Speech recognition is not supported in this device.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        mic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        "Speak something...");
                try {
                    startActivityForResult(intent, 4);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Sorry! Speech recognition is not supported in this device.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        mic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        "Speak something...");
                try {
                    startActivityForResult(intent, 5);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Sorry! Speech recognition is not supported in this device.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score;
                if (tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv3.getText().equals(ans3) && tv4.getText().equals(ans4)
                        && tv5.getText().equals(ans5)){
                    score = 50;
                    int newscore = prevscore + score;
                    Intent i = new Intent(getApplicationContext(), Game2Score.class);
                    i.putExtra("n",newscore);
                    startActivity(i);
                }else if ((tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv3.getText().equals(ans3) && tv4.getText().equals(ans4)) ||
                        (tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv3.getText().equals(ans3) && tv5.getText().equals(ans5)) ||
                        (tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv4.getText().equals(ans4) && tv5.getText().equals(ans5)) ||
                        (tv1.getText().equals(ans1) && tv3.getText().equals(ans3) && tv4.getText().equals(ans4) && tv5.getText().equals(ans5)) ||
                        (tv2.getText().equals(ans2) && tv3.getText().equals(ans3) && tv4.getText().equals(ans4) && tv5.getText().equals(ans5))){
                    score = 40;
                    int newscore = prevscore + score;
                    Intent i = new Intent(getApplicationContext(), Game2Score.class);
                    i.putExtra("n",newscore);
                    startActivity(i);
                }else if ((tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv3.getText().equals(ans3)) ||
                        (tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv4.getText().equals(ans4)) ||
                        (tv1.getText().equals(ans1) && tv2.getText().equals(ans2) && tv5.getText().equals(ans5)) ||
                        (tv2.getText().equals(ans2) && tv3.getText().equals(ans3) && tv4.getText().equals(ans4)) ||
                        (tv2.getText().equals(ans2) && tv3.getText().equals(ans3) && tv5.getText().equals(ans5)) ||
                        (tv2.getText().equals(ans2) && tv4.getText().equals(ans4) && tv5.getText().equals(ans5)) ||
                        (tv3.getText().equals(ans3) && tv4.getText().equals(ans4) && tv5.getText().equals(ans5))){
                    score = 30;
                    int newscore = prevscore + score;
                    Intent i = new Intent(getApplicationContext(), Game2Score.class);
                    i.putExtra("n",newscore);
                    startActivity(i);
                }else if ((tv1.getText().equals(ans1) && tv2.getText().equals(ans2)) || (tv1.getText().equals(ans1) && tv3.getText().equals(ans3)) ||
                        (tv1.getText().equals(ans1) && tv5.getText().equals(ans5)) || (tv2.getText().equals(ans2) && tv3.getText().equals(ans3)) ||
                        (tv2.getText().equals(ans2) && tv4.getText().equals(ans4)) || (tv2.getText().equals(ans2) && tv5.getText().equals(ans5)) ||
                        (tv3.getText().equals(ans3) && tv4.getText().equals(ans4)) || (tv3.getText().equals(ans3) && tv5.getText().equals(ans5)) ||
                        (tv1.getText().equals(ans1) && tv4.getText().equals(ans4)) || (tv4.getText().equals(ans4) && tv5.getText().equals(ans5))){
                    score = 20;
                    int newscore = prevscore + score;
                    Intent i = new Intent(getApplicationContext(), Game2Score.class);
                    i.putExtra("n",newscore);
                    startActivity(i);
                }else if (tv1.getText().equals(ans1) || tv2.getText().equals(ans2) || tv3.getText().equals(ans3) || tv4.getText().equals(ans4)
                        || tv5.getText().equals(ans5)){
                    score =10;
                    int newscore = prevscore + score;
                    Intent i = new Intent(getApplicationContext(), Game2Score.class);
                    i.putExtra("n",newscore);
                    startActivity(i);
                }else{
                    score = 0;
                    int newscore = prevscore + score;
                    Intent i = new Intent(getApplicationContext(), Game2Score.class);
                    i.putExtra("n",newscore);
                    startActivity(i);
                }
                finish();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    tv1.setText(text);
                }
                break;
            case 2:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    tv2.setText(text);
                }
                break;
            case 3:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    tv3.setText(text);
                }
                break;
            case 4:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    tv4.setText(text);
                }
                break;
            case 5:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    tv5.setText(text);
                }
                break;
        }
    }

}

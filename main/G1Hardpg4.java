package com.application.brainfit;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class G1Hardpg4 extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5;
    ImageView imgview;
    CountDownTimer timer;
    RadioGroup rg1, rg2, rg3, rg4, rg5;
    RadioButton q1rb1, q1rb2, q1rb3, q1rb4, q2rb1, q2rb2, q2rb3, q2rb4, q3rb1, q3rb2, q4rb1, q4rb2, q4rb3, q4rb4, q5rb1, q5rb2, q5rb3, q5rb4;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1_hardpg4);

        Intent i = getIntent();
        final int prevscore = i.getIntExtra("n", 0);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);

        imgview = (ImageView) findViewById(R.id.imgview);

        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg3 = (RadioGroup) findViewById(R.id.rg3);
        rg4 = (RadioGroup) findViewById(R.id.rg4);
        rg5 = (RadioGroup) findViewById(R.id.rg5);

        submitbtn = (Button) findViewById(R.id.submitbtn);

        timer = new MyCountDown(10000, 1000);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                q1rb1 = (RadioButton) findViewById(R.id.q1rb1);
                q1rb2 = (RadioButton) findViewById(R.id.q1rb2);
                q1rb3 = (RadioButton) findViewById(R.id.q1rb3);
                q1rb4 = (RadioButton) findViewById(R.id.q1rb4);
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                q2rb1 = (RadioButton) findViewById(R.id.q2rb1);
                q2rb2 = (RadioButton) findViewById(R.id.q2rb2);
                q2rb3 = (RadioButton) findViewById(R.id.q2rb3);
                q2rb4 = (RadioButton) findViewById(R.id.q2rb4);
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                q3rb1 = (RadioButton) findViewById(R.id.q3rb1);
                q3rb2 = (RadioButton) findViewById(R.id.q3rb2);
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                q4rb1 = (RadioButton) findViewById(R.id.q4rb1);
                q4rb2 = (RadioButton) findViewById(R.id.q4rb2);
                q4rb3 = (RadioButton) findViewById(R.id.q4rb3);
                q4rb4 = (RadioButton) findViewById(R.id.q4rb4);
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                q5rb1 = (RadioButton) findViewById(R.id.q5rb1);
                q5rb2 = (RadioButton) findViewById(R.id.q5rb2);
                q5rb3 = (RadioButton) findViewById(R.id.q5rb3);
                q5rb4 = (RadioButton) findViewById(R.id.q5rb4);
            }
        });

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score;

                if (rg1.getCheckedRadioButtonId() == -1 || rg2.getCheckedRadioButtonId() == -1 || rg3.getCheckedRadioButtonId() == -1 || rg4.getCheckedRadioButtonId() == -1 || rg5.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please answer all the question", Toast.LENGTH_LONG).show();
                } else {
                    if (q1rb3.isChecked() && q2rb4.isChecked() && q3rb1.isChecked() && q4rb1.isChecked() && q5rb3.isChecked()) {
                        score = 25;
                        int newscore = prevscore + score;
                        Intent i = new Intent(getApplicationContext(), Game1Score.class);
                        i.putExtra("n", newscore);
                        startActivity(i);
                    } else if ((q1rb3.isChecked() && q2rb4.isChecked() && q3rb1.isChecked() && q4rb1.isChecked()) ||
                            (q1rb3.isChecked() && q2rb4.isChecked() && q3rb1.isChecked() && q5rb3.isChecked()) ||
                            (q1rb3.isChecked() && q2rb4.isChecked() && q4rb1.isChecked() && q5rb3.isChecked()) ||
                            (q1rb3.isChecked() && q3rb1.isChecked() && q4rb1.isChecked() && q5rb3.isChecked()) ||
                            (q2rb4.isChecked() && q3rb1.isChecked() && q4rb1.isChecked() && q5rb3.isChecked())) {
                        score = 20;
                        int newscore = prevscore + score;
                        Intent i = new Intent(getApplicationContext(), Game1Score.class);
                        i.putExtra("n", newscore);
                        startActivity(i);
                    } else if ((q1rb3.isChecked() && q2rb4.isChecked() && q3rb1.isChecked()) ||
                            (q1rb3.isChecked() && q2rb4.isChecked() && q4rb1.isChecked()) ||
                            (q1rb3.isChecked() && q2rb4.isChecked() && q5rb3.isChecked()) ||
                            (q2rb4.isChecked() && q3rb1.isChecked() && q4rb1.isChecked()) ||
                            (q2rb4.isChecked() && q3rb1.isChecked() && q5rb3.isChecked()) ||
                            (q2rb4.isChecked() && q4rb1.isChecked() && q5rb3.isChecked()) ||
                            (q3rb1.isChecked() && q4rb1.isChecked() && q5rb3.isChecked())) {
                        score = 15;
                        int newscore = prevscore + score;
                        Intent i = new Intent(getApplicationContext(), Game1Score.class);
                        i.putExtra("n", newscore);
                        startActivity(i);
                    } else if ((q1rb3.isChecked() && q2rb4.isChecked()) || (q1rb3.isChecked() && q3rb1.isChecked()) ||
                            (q1rb3.isChecked() && q4rb1.isChecked()) || (q1rb3.isChecked() && q5rb3.isChecked()) ||
                            (q2rb4.isChecked() && q3rb1.isChecked()) || (q2rb4.isChecked() && q4rb1.isChecked()) ||
                            (q2rb4.isChecked() && q5rb3.isChecked()) || (q3rb1.isChecked() && q4rb1.isChecked()) ||
                            (q3rb1.isChecked() && q5rb3.isChecked()) || (q4rb1.isChecked() && q5rb3.isChecked())) {
                        score = 10;
                        int newscore = prevscore + score;
                        Intent i = new Intent(getApplicationContext(), Game1Score.class);
                        i.putExtra("n", newscore);
                        startActivity(i);
                    } else if (q1rb3.isChecked() || q2rb4.isChecked() || q3rb1.isChecked() || q4rb1.isChecked() || q5rb3.isChecked()) {
                        score = 5;
                        int newscore = prevscore + score;
                        Intent i = new Intent(getApplicationContext(), Game1Score.class);
                        i.putExtra("n", newscore);
                        startActivity(i);
                    } else {
                        score = 0;
                        int newscore = prevscore + score;
                        Intent i = new Intent(getApplicationContext(), Game1Score.class);
                        i.putExtra("n", newscore);
                        startActivity(i);
                    }
                }
            }
        });
    }

    private class MyCountDown extends CountDownTimer {
        long duration, interval;

        public MyCountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            start();
        }

        @Override
        public void onFinish() {

            imgview.setVisibility(View.INVISIBLE);
        }

        @Override
        public void onTick(long duration) {
        }
    }
}

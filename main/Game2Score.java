package com.application.brainfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game2Score extends AppCompatActivity {
    TextView tv2;
    Button rebtn, hbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2_score);
        tv2 = (TextView) findViewById(R.id.tv2);
        rebtn = (Button) findViewById(R.id.rebtn);
        hbtn = (Button) findViewById(R.id.hbtn);

        Intent i = getIntent();
        int score = i.getIntExtra("n",0);

        String msg = score+"      Points";
        tv2.setText(msg);

        rebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Game2.class);
                startActivity(i);
                finish();
            }
        });

        hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Exercise.class);
                startActivity(i);
                finish();
            }
        });
    }
}

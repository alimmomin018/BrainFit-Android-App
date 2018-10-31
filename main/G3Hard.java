package com.application.brainfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class G3Hard extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et4,et5,et6;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g3_hard);
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
                    if (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") &&
                            ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") &&
                            ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) {
                        score = 100;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if ((ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN"))
                            || (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))
                            || (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))
                            || (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))
                            || (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))
                            || (ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))) {
                        score = 85;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))  ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL")) ) {
                        score = 68;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans4.equals("Be your own kind of BEAUTIFUL") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans3.equals("HOPE is only thing Stronger than FEAR") && ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans4.equals("Be your own kind of BEAUTIFUL") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans4.equals("Be your own kind of BEAUTIFUL")) ||
                            (ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL")) ||
                            (ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))){
                        score = 51;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten")) ||(ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans3.equals("HOPE is only thing Stronger than FEAR")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans4.equals("Be your own kind of BEAUTIFUL")) ||(ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||(ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans3.equals("HOPE is only thing Stronger than FEAR")) ||
                            (ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans4.equals("Be your own kind of BEAUTIFUL")) ||(ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||
                            (ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||(ans3.equals("HOPE is only thing Stronger than FEAR") && ans4.equals("Be your own kind of BEAUTIFUL")) ||
                            (ans3.equals("HOPE is only thing Stronger than FEAR") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||(ans3.equals("HOPE is only thing Stronger than FEAR") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans4.equals("Be your own kind of BEAUTIFUL") && ans5.equals("The best way to get things DONE, is to simply BEGIN")) ||(ans4.equals("Be your own kind of BEAUTIFUL") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey")) ||
                            (ans5.equals("The best way to get things DONE, is to simply BEGIN") && ans6.equals("NEVER let a Stumble in the road be the END of the Journey"))){
                        score = 34;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if (ans1.equals("PRACTICE like you HAVE never WON. PERFORM like you HAVE never LOST") || ans2.equals("Be CAREFUL with your words, they can be forgiven NOT forgotten") ||
                            ans3.equals("HOPE is only thing Stronger than FEAR") || ans4.equals("Be your own kind of BEAUTIFUL") ||
                            ans5.equals("The best way to get things DONE, is to simply BEGIN") || ans6.equals("NEVER let a Stumble in the road be the END of the Journey")){
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

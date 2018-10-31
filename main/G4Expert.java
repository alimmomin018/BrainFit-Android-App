package com.application.brainfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class G4Expert extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et4,et5,et6;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g4_expert);
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
                    Toast.makeText(getApplicationContext(), "Please answer atleast question", Toast.LENGTH_LONG).show();
                } else {
                    if (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") &&
                            ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") &&
                            ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) {
                        score = 100;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if ((ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT"))
                            || (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))
                            || (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))
                            || (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))
                            || (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))
                            || (ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))) {
                        score = 85;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))  ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK")) ) {
                        score = 68;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK")) ||
                            (ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK")) ||
                            (ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))){
                        score = 51;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK")) ||(ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK")) ||(ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||(ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION")) ||
                            (ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK")) ||(ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||
                            (ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||(ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK")) ||
                            (ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||(ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT")) ||(ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")) ||
                            (ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") && ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION"))){
                        score = 34;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if (ans1.equals("sOME PATHS CAN NOT BE DISCOVERED WITHOUT GETTING LOST") || ans2.equals("yOU ArE BRAVER THAN YOU BELIEVE, STRONGER THAN YOU SEEM, AND SMARTER THAN YOU THINK") ||
                            ans3.equals("wAKE UP WITH DETERMINATION. gOTO BED WITH SATISFATION") || ans4.equals("sTOP LIVING WITHIN THE LIMITATIONS OF WHAT PEOPLE THINK OF YOU AND NEVER LOOK BACK") ||
                            ans5.equals("wHATEVER MAKES YOU FEEL BAD, LEAVE IT. wHATEVER MAKES YOU SMILE, KEEP IT") || ans6.equals("sUCCESS IS A JOURNEY NOT A DESTINATION")){
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

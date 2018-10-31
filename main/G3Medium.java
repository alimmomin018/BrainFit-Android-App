package com.application.brainfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class G3Medium extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et4,et5,et6;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g3_medium);

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
                    if (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") &&
                            ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") &&
                            ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs")) {
                        score = 100;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if ((ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY"))
                            || (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans6.equals("tHecREaTIVEs"))
                            || (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs"))
                            || (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs"))
                            || (ans1.equals("bEAuTIfuLiY BReatHE") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs"))
                            || (ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs"))) {
                        score = 85;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("bEAuTIfuLiY BReatHE") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs"))  ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans3.equals("TrUThtRuST") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans5.equals("ThEmIgHtY")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe")) ) {
                        score = 68;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans5.equals("ThEmIgHtY")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY")) ||
                            (ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs")) ||
                            (ans3.equals("TrUThtRuST") && ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans6.equals("tHecREaTIVEs")) ||
                            (ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME") && ans4.equals("UnDERsTANdiNG pEoPLe")) ||
                            (ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe")) ||
                            (ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans5.equals("ThEmIgHtY")) ||
                            (ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST") && ans6.equals("tHecREaTIVEs"))){
                        score = 51;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    }else if ((ans1.equals("bEAuTIfuLiY BReatHE") && ans2.equals("ASSumEp ReSUME")) ||(ans1.equals("bEAuTIfuLiY BReatHE") && ans3.equals("TrUThtRuST")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans4.equals("UnDERsTANdiNG pEoPLe")) ||(ans1.equals("bEAuTIfuLiY BReatHE") && ans5.equals("ThEmIgHtY")) ||
                            (ans1.equals("bEAuTIfuLiY BReatHE") && ans6.equals("tHecREaTIVEs")) ||(ans2.equals("ASSumEp ReSUME") && ans3.equals("TrUThtRuST")) ||
                            (ans2.equals("ASSumEp ReSUME") && ans4.equals("UnDERsTANdiNG pEoPLe")) ||(ans2.equals("ASSumEp ReSUME") && ans5.equals("ThEmIgHtY")) ||
                            (ans2.equals("ASSumEp ReSUME") && ans6.equals("tHecREaTIVEs")) ||(ans3.equals("TrUThtRuST") && ans4.equals("UnDERsTANdiNG pEoPLe")) ||
                            (ans3.equals("TrUThtRuST") && ans5.equals("ThEmIgHtY")) ||(ans3.equals("TrUThtRuST") && ans6.equals("tHecREaTIVEs")) ||
                            (ans4.equals("UnDERsTANdiNG pEoPLe") && ans5.equals("ThEmIgHtY")) ||(ans4.equals("UnDERsTANdiNG pEoPLe") && ans6.equals("tHecREaTIVEs")) ||
                            (ans5.equals("ThEmIgHtY") && ans6.equals("tHecREaTIVEs"))){
                        score = 34;
                        Intent i = new Intent(getApplicationContext(), Game3Score.class);
                        i.putExtra("n", score);
                        startActivity(i);
                    } else if (ans1.equals("bEAuTIfuLiY BReatHE") || ans2.equals("ASSumEp ReSUME") ||
                            ans3.equals("TrUThtRuST") || ans4.equals("UnDERsTANdiNG pEoPLe") ||
                            ans5.equals("ThEmIgHtY") || ans6.equals("tHecREaTIVEs")){
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

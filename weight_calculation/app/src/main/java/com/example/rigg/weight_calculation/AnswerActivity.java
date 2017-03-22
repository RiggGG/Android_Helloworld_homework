package com.example.rigg.weight_calculation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by rigg on 2017/3/22.
 */

public class AnswerActivity extends Activity{
    private TextView tex1;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tex1 = (TextView)findViewById(R.id.tex1);
        btn = (Button)findViewById(R.id.button6);
        Intent intent = getIntent();
        String select = intent.getStringExtra("select");
        if(select.equals("C. e的a-b次方")){
            tex1.setText("Congraulations!  you're right!");
        }else{
            tex1.setText("You're wrong!");
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnswerActivity.this,ProblemActivity.class);
                startActivity(intent);
            }

        });

    }
}

package com.example.rigg.weight_calculation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rigg on 2017/3/15.
 */

public class ShowActivity extends Activity{
    private Button btn;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        btn = (Button)findViewById(R.id.button3);
        btn2 = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ShowActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent(ShowActivity.this,ProblemActivity.class);
                startActivity(intent2);
            }
        });

    }
}

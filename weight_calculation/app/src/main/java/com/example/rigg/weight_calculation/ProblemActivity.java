package com.example.rigg.weight_calculation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by rigg on 2017/3/22.
 */

public class ProblemActivity extends Activity{
    private Button btn;
    private RadioGroup radiog;
    private Button btn7;
    private ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        btn = (Button) findViewById(R.id.button5);
        radiog = (RadioGroup)findViewById(R.id.radiogroupp);
        btn7 = (Button)findViewById(R.id.button7);
        image1 = (ImageView)findViewById(R.id.imageView);
        image1.setBackground(getResources().getDrawable(R.drawable.question));
        image1.setVisibility(View.VISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sel = "";
                int i = 0;
                for (i = 0; i < radiog.getChildCount(); i++) {
                    //根据索引值获取单选按钮
                    RadioButton r= (RadioButton) radiog.getChildAt(i);
                    //判断单选按钮是否被选中
                    if (r.isChecked()) {
                        //获取被选中的单选按钮的值
                        sel = r.getText().toString();
                        break;
                    }
                }
                Intent intent = new Intent(ProblemActivity.this,AnswerActivity.class);
                intent.putExtra("select",sel);
                startActivity(intent);
            }

        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProblemActivity.this,ShowActivity.class);
                startActivity(intent);
            }
        });
    }
}

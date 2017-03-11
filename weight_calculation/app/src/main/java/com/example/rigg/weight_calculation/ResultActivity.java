package com.example.rigg.weight_calculation;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
/**
 * Created by rigg on 2017/3/5.
 */

public class ResultActivity extends Activity {
    private TextView pageResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        pageResult = (TextView)findViewById(R.id.weight);
        Bundle bundle = this.getIntent().getExtras();//add this can run but can't get varible sex
        Info info = (Info) bundle.getSerializable("Info");

        pageResult.setText("Hello "+info.getSex()+"."+info.getName()+",\n"+"your height is "+info.getHeight()+" cm\n"
                +"your weight is "+info.getWeight()+" kg in theory");
    }
}

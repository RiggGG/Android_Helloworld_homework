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
    private TextView sex;
    private TextView name;
    private TextView weight;
    private TextView height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bundle=new Bundle();
        Info info = (Info) bundle.getSerializable("info");

        name.setText("Hello"+info.getSex()+"");
        sex.setText(info.getName()+",");
        height.setText("your height is "+info.getHeight()+" cm");
        weight.setText("your weight is "+getWeight(info.getSex(),info.getHeight())+" kg in theory");
    }
    public String getWeight(String sex,float height){
        String weight="";
        NumberFormat nFormat=new DecimalFormat();
        if (sex.equals("Mr")) {
            weight=nFormat.format((height-80)*0.7);
        }
        if (sex.equals("Ms")) {
            weight=nFormat.format((height-70)*0.6);
        }
        return weight;
    }
}

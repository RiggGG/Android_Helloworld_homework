package com.example.rigg.weight_calculation;



import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rigg on 2017/3/5.
 */

public class ResultActivity extends Activity {
    private TextView pageResult;
    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        pageResult = (TextView)findViewById(R.id.weight);
        bt1 = (Button)findViewById(R.id.button2);
        Bundle bundle = this.getIntent().getExtras();//add this can run but can't get varible sex
        Info info = (Info) bundle.getSerializable("Info");

        pageResult.setText("Hello "+info.getSex()+"."+info.getName()+",\n"+"your height is "+info.getHeight()+" cm\n"
                +"your weight is "+info.getWeight()+" kg in theory");
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ResultActivity.this,ShowActivity.class);
                startActivity(intent);
            }
        });
    }
}

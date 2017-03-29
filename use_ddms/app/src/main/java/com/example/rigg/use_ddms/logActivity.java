package com.example.rigg.use_ddms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class logActivity extends Activity{

    private Button myButton;
    private Button myButton1;
    static final String LIFT_TAG="LogActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        Log.v(logActivity.LIFT_TAG, "FirstAcvity ---> onCreate");
        myButton = (Button)findViewById(R.id.myButton);
        myButton1 = (Button)findViewById(R.id.myButton1);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(logActivity.this,logActivity2.class);
                startActivity(intent);
            }
        });
        myButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(logActivity.this,logActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.v(logActivity.LIFT_TAG,"FirstAcvity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(logActivity.LIFT_TAG, "FirstAcvity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        Log.v(logActivity.LIFT_TAG, "FirstAcvity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Log.v(logActivity.LIFT_TAG, "FirstAcvity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        Log.v(logActivity.LIFT_TAG, "FirstAcvity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Log.v(logActivity.LIFT_TAG, "FirstAcvity --->onStop");
        super.onStop();
    }
}
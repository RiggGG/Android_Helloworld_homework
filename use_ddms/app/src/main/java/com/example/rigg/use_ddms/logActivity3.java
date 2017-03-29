package com.example.rigg.use_ddms;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by rigg on 2017/3/29.
 */

public class logActivity3 extends Activity{
    private static final String ACTIVITY_TAG="LogDemo";
    private Button bt;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log2);

        bt = (Button)findViewById(R.id.bt);
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(logActivity3.ACTIVITY_TAG, "This is Verbose.");
                Log.d(logActivity3.ACTIVITY_TAG, "This is Debug.");
                Log.i(logActivity3.ACTIVITY_TAG, "This is Information");
                Log.w(logActivity3.ACTIVITY_TAG, "This is Warnning.");
                Log.e(logActivity3.ACTIVITY_TAG, "This is Error.");
            }
        });
    }
}
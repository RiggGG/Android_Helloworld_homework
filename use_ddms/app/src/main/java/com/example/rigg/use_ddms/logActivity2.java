package com.example.rigg.use_ddms;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by rigg on 2017/3/29.
 */

public class logActivity2 extends  Activity {
    private static final String LIFT_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG,"SecondActivity--->onCreate");
        super.onCreate(savedInstanceState);

    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG,"SecondActivity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG, "SecondActivity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG, "SecondActivity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG, "SecondActivity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG, "SecondActivity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Log.v(logActivity2.LIFT_TAG, "SecondActivity --->onStop");
        super.onStop();
    }
}

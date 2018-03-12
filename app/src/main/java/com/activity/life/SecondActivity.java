package com.activity.life;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2017/10/29 0029.
 */
public class SecondActivity extends AppCompatActivity {

    private String TAG=getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG,"====onCreate=======");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "====onStart=======");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "====onRestart=======");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "====onResume=======");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "====onPause=======");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "====onStop=======");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "====onDestroy=======");
    }


}

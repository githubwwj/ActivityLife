package com.activity.life;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2017/10/29 0029.
 */
public class ThirdActivity extends AppCompatActivity {

    private String TAG=getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e(TAG,"====onCreate=======");

        findViewById(R.id.tvStartMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                intent.putExtra("extra_test","hi");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String extra_test=intent.getStringExtra("extra_test");
        Log.e(TAG,"====extra_test="+extra_test);
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

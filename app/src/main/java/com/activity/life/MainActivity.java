package com.activity.life;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "====onCreate=======");
        initView();

    }

    private void initView() {

        findViewById(R.id.starSecondActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tvDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("标题")
                        .setMessage("内容")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .create().show();
            }
        });

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

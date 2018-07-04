package com.activity.life;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            "android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE" };


    public static void verifyStoragePermissions(Activity activity) {

        try {
            //检测是否有写的权限
            int permission = ActivityCompat.checkSelfPermission(activity,
                    "android.permission.WRITE_EXTERNAL_STORAGE");
            if (permission != PackageManager.PERMISSION_GRANTED) {
                // 没有写的权限，去申请写的权限，会弹出对话框
                ActivityCompat.requestPermissions(activity, PERMISSIONS_STORAGE,REQUEST_EXTERNAL_STORAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "====onCreate=======" + getApplicationInfo().uid);
        initView();
        initData();

        verifyStoragePermissions(this);

        File fileDir = Environment.getExternalStorageDirectory();
        File filePath = new File(fileDir, "cache.txt");
        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
//            User1 user = new User1(1111, "wwj", true);
//            objectOutputStream.writeObject(user);
//            objectOutputStream.close();


            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            User1 readUser = (User1) objectInputStream.readObject();
            Log.e(TAG, "==id=" + readUser.userId + "====name=" + readUser.name+"====sex="+readUser.isMale);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void initData() {
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
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e(TAG, "====onSaveInstanceState=======");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "====onSaveInstanceState=======");
    }

    //界面可见
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

    //在前台，可以和用户交互
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "====onResume=======");
    }

    //不在前台
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "====onPause=======");
    }

    //界面不可见
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

package com.example.dell.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Log.d("ActivityState","OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityState","OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityState","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
       Log.d("ActivityState","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityState","OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       Log.d("ActivityState" ,"OnDestroy()");
    }
}

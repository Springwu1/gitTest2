package com.example.wjm.gittest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("master", "onCreate: ");
        Log.i("第三个人在主分支中修改代码", "onCreate: ");
        Log.i("develop", "onCreate: ");
    }
}

package com.example.administrator.viewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.viewdemo.Gesture.GestureActivity;
import com.example.administrator.viewdemo.LayoutParams.SrollByLayoutParamsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnParams, btnGesture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnParams = findViewById(R.id.btn_params);
        btnGesture = findViewById(R.id.btn_gesture);
        btnParams.setOnClickListener(this);
        btnGesture.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_params:
                Intent intent = new Intent(this, SrollByLayoutParamsActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_gesture:
                Intent intent1 = new Intent(this, GestureActivity.class);
                startActivity(intent1);
                break;
        }
    }
}

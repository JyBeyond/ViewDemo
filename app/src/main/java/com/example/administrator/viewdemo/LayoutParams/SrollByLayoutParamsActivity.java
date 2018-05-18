package com.example.administrator.viewdemo.LayoutParams;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.viewdemo.R;

/**
 * @description: this is SrollByLayoutParamsActivity
 * @author: lijingya
 * @email: ljy@91118.com
 * @createDate: 2018/5/16
 * @company: 杭州天音
 */
public class SrollByLayoutParamsActivity extends Activity {

    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_by_params);
        btn = findViewById(R.id.btn);
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) btn.getLayoutParams();
        params.leftMargin += 100;
        btn.setLayoutParams(params);
    }
}
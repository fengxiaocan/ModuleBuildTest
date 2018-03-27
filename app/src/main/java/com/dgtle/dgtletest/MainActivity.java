package com.dgtle.dgtletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.dgtle.baselib.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btAdd(View view){
        // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
        ARouter.getInstance().build("/test/set").navigation();
        LogUtils.e("btAdd");
    }
}

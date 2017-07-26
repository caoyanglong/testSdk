package com.yyhd.fusionads.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import net.lingala.MySdkUtils;

/**
 * Created by caoyanglong on 2017/7/25.
 */

public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int sum = MySdkUtils.sum(1,9);
        Toast.makeText(this, String.valueOf(sum),Toast.LENGTH_LONG).show();
    }
}

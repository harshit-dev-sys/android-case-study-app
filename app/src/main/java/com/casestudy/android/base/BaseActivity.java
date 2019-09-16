package com.casestudy.android.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    public Activity mActivity;
    public Context context;

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        mActivity = this;
        context = this;
    }

}

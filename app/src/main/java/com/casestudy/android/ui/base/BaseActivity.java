package com.casestudy.android.ui.base;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BaseActivity extends AppCompatActivity {

    public AppCompatActivity mActivity;
    public Context context;

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        mActivity = this;
        context = this;
    }

}

package com.casestudy.android.base;

import android.os.Bundle;

import com.casestudy.android.constants.Constant;

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity implements Constant {
    public P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }

}

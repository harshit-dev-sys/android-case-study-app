package com.casestudy.android.base;

import android.content.Context;

public class BasePresenter<V> {
    public V mvpView;

    public void attachView(V mvpView) {
        this.mvpView = mvpView;
    }

    public void detachView() {
        onUnsubscribe();
    }

    public void onUnsubscribe() {
    }

}

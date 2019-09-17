package com.casestudy.android.ui.productList;

import android.content.Context;
import android.os.Bundle;

import com.casestudy.android.R;
import com.casestudy.android.base.MvpActivity;

public class ProductListActivity extends MvpActivity<ProductListPresenter> implements ProductListView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        mvpPresenter.loadProduct();
    }

    @Override
    protected ProductListPresenter createPresenter() {
        return new ProductListPresenter(this);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public int getPath() {
        return R.raw.product_grid;
    }

    @Override
    public void onSuccess(String result) {

    }

    @Override
    public void onFailure(String mesage) {

    }
}

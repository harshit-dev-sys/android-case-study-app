package com.casestudy.android.ui.productList;

import android.util.Log;

import com.casestudy.android.R;
import com.casestudy.android.base.BasePresenter;
import com.casestudy.android.ui.productList.pojo.ProductResponse;
import com.casestudy.android.util.Utility;
import com.google.gson.Gson;

public class ProductListPresenter extends BasePresenter<ProductListView> {

    public ProductListPresenter(ProductListView view) {
        attachView(view);
    }

    public void loadProduct(){

        String data= Utility.getLocalJson(mvpView.getContext(), mvpView.getPath());
        ProductResponse productResponse= new  Gson().fromJson(data,ProductResponse.class);

    }

}

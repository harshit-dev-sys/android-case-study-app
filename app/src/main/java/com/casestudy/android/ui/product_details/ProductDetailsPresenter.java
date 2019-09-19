package com.casestudy.android.ui.product_details;

import com.casestudy.android.ui.base.BasePresenter;

public class ProductDetailsPresenter extends BasePresenter<ProductDetailsView> {

    public ProductDetailsPresenter(ProductDetailsView view) {
        attachView(view);
    }

    public void addToCart(){
        mvpView.onAdding();
    }

}

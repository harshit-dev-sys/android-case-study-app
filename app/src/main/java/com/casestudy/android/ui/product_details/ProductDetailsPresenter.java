package com.casestudy.android.ui.product_details;

import com.casestudy.android.R;
import com.casestudy.android.base.BasePresenter;
import com.casestudy.android.ui.product_list.ProductListView;
import com.casestudy.android.ui.product_list.pojo.ProductResponse;
import com.casestudy.android.util.Utility;
import com.google.gson.Gson;

public class ProductDetailsPresenter extends BasePresenter<ProductDetailsView> {

    public ProductDetailsPresenter(ProductDetailsView view) {
        attachView(view);
    }

    public void addToCart(){
        mvpView.onAdding();
    }

}

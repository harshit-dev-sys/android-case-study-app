package com.casestudy.android.ui.product_list;

import com.casestudy.android.R;
import com.casestudy.android.base.BasePresenter;
import com.casestudy.android.ui.product_list.pojo.ProductResponse;
import com.casestudy.android.util.Utility;
import com.google.gson.Gson;

public class ProductListPresenter extends BasePresenter<ProductListView> {

    public ProductListPresenter(ProductListView view) {
        attachView(view);
    }

    public void loadProduct(){

        String data= Utility.getLocalJson(mvpView.getContext(), mvpView.getPath());
//        Log.e("data"," - "+data);
        if(data!=null&&!data.isEmpty()) {
            ProductResponse productResponse = new Gson().fromJson(data, ProductResponse.class);
            mvpView.onSuccess(productResponse);
        }else{
            mvpView.onFailure(R.string.data_not_found);
        }
    }

}

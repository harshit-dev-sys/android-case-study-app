package com.casestudy.android.ui.product_details;

import android.content.Context;

import com.casestudy.android.base.BaseView;
import com.casestudy.android.ui.product_list.pojo.ProductResponse;

public interface ProductDetailsView extends BaseView {

    Context getContext();
    void onAdding();
    void Success();

}

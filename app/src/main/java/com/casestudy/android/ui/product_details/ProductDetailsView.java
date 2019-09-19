package com.casestudy.android.ui.product_details;

import android.content.Context;

import com.casestudy.android.ui.base.BaseView;

public interface ProductDetailsView extends BaseView {

    Context getContext();
    void onAdding();
    void Success();

}

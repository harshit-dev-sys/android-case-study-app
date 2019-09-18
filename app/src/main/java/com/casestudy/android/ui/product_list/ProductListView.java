package com.casestudy.android.ui.product_list;

import android.content.Context;
import com.casestudy.android.base.BaseView;
import com.casestudy.android.ui.product_list.pojo.ProductResponse;

public interface ProductListView extends BaseView {

    Context getContext();
    int getPath();
    void onSuccess(ProductResponse productResponse);
    void onFailure(int message);

}

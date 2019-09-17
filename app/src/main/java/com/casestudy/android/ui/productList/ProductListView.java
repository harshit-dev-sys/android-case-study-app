package com.casestudy.android.ui.productList;

import android.content.Context;
import com.casestudy.android.base.BaseView;

public interface ProductListView extends BaseView {

    Context getContext();
    int getPath();
    void onSuccess(String result);
    void onFailure(String mesage);

}

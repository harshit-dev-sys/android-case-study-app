package com.casestudy.android.ui.product_list;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.widget.Toast;

import com.casestudy.android.R;
import com.casestudy.android.base.MvpActivity;
import com.casestudy.android.databinding.ProductListBinding;
import com.casestudy.android.ui.product_details.ProductDetailsActivity;
import com.casestudy.android.ui.product_list.adapter.ProductListAdapter;
import com.casestudy.android.ui.product_list.listner.OnProductListener;
import com.casestudy.android.ui.product_list.pojo.ProductResponse;
import com.casestudy.android.ui.product_list.pojo.SlotsItem;
import com.casestudy.android.util.Utility;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends MvpActivity<ProductListPresenter> implements ProductListView, OnProductListener {

    private ProductListBinding binding;
    private ProductListAdapter adapter;
    private List<SlotsItem> slotsItems=new ArrayList<>();
    private String bannerURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_list);
        init();
    }

    private void init(){

        //Set GridLayoutManager for show product as grid
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        slotsItems=new ArrayList<>();
        adapter=new ProductListAdapter(slotsItems,this);
        binding.recyclerView.setAdapter(adapter);

        // Get data from local raw folder
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
    public void onSuccess(ProductResponse productResponse) {
        bannerURL=productResponse.getBanner();
        binding.subBanner.setText(productResponse.getSubheader());
        Utility.setImage(getContext(),productResponse.getBanner(),binding.header);
        slotsItems.clear();
        slotsItems.addAll(productResponse.getSlots());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFailure(int message) {
        Toast.makeText(getContext(),getString(message),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProductClick(int position) {
        Intent intent=new Intent(getContext(), ProductDetailsActivity.class);
        intent.putExtra(productData,slotsItems.get(position));
        intent.putExtra(banner,bannerURL);
        startActivity(intent);
    }
}

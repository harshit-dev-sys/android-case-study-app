package com.casestudy.android.ui.product_details;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.casestudy.android.R;
import com.casestudy.android.base.MvpActivity;
import com.casestudy.android.databinding.ProductDetailsBinding;
import com.casestudy.android.ui.product_list.pojo.SlotsItem;
import com.casestudy.android.util.Utility;

public class ProductDetailsActivity extends MvpActivity<ProductDetailsPresenter> implements ProductDetailsView, View.OnClickListener {

    private ProductDetailsBinding binding;
    private SlotsItem slotsItem;
    private String bannerURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_details);
        init();
    }

    private void init(){
        bannerURL=getIntent().getStringExtra(banner);
        slotsItem=(SlotsItem) getIntent().getSerializableExtra(productData);

        Utility.setImage(getContext(),bannerURL,binding.header);
        binding.subBanner.setText(slotsItem.getDescription());
        Utility.setImage(getContext(),slotsItem.getImageUrl(),binding.itemImage);
        binding.brandName.setText(slotsItem.getBrand());
        binding.name.setText(slotsItem.getName());
        binding.price.setText(slotsItem.getCurrencySymbol()+slotsItem.getPrice());
        binding.rating.setRating(Float.parseFloat(slotsItem.getRating()));
        binding.variant.setText(slotsItem.getVariant());

        binding.back.setOnClickListener(this);
        binding.addToCart.setOnClickListener(this);
    }

    @Override
    protected ProductDetailsPresenter createPresenter() {
        return new ProductDetailsPresenter(this);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onAdding() {
        binding.addToCart.setText(getString(R.string.adding));
    }

    @Override
    public void Success() {
        binding.addToCart.setText(getString(R.string.add_to_bag));
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back:
                onBackPressed();
                break;
            case R.id.add_to_cart:
                mvpPresenter.addToCart();
                break;
        }
    }
}

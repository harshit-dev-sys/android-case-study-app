package com.casestudy.android.ui.product_list.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.casestudy.android.R;
import com.casestudy.android.databinding.ProductListAdapterBinding;
import com.casestudy.android.ui.product_details.ProductDetailsActivity;
import com.casestudy.android.ui.product_list.listner.OnProductListener;
import com.casestudy.android.ui.product_list.pojo.SlotsItem;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ShopListViewHolder> {

    private List<SlotsItem> data;
    private Context context;
    private LayoutInflater inflater;
    private OnProductListener onViewClickListener;

    public ProductListAdapter(List<SlotsItem> data, OnProductListener onViewClickListener) {
        this.data = data;
        this.onViewClickListener = onViewClickListener;
    }

    @Override
    public ShopListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();

        if (inflater == null) {
            inflater = inflater.from(parent.getContext());
        }
        ProductListAdapterBinding binding = ProductListAdapterBinding.inflate(inflater, parent, false);
        return new ShopListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(final ShopListViewHolder holder, final int position) {

        final SlotsItem productsItem=data.get(position);

        holder.bindConnection(productsItem);

        final ProductListAdapterBinding databinding = holder.getBinding();

        holder.binding.mainLy.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("event "," : "+event.getAction());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if(android.os.Build.VERSION.SDK_INT >= 28)
                            holder.binding.cardView.setOutlineSpotShadowColor(context.getResources().getColor(R.color.shadow_pressed));
                        holder.binding.itemName.setTextColor(context.getResources().getColor(R.color.shadow_pressed));
                        return true;
                    case MotionEvent.ACTION_CANCEL:
                        if(android.os.Build.VERSION.SDK_INT >= 28)
                            holder.binding.cardView.setOutlineSpotShadowColor(context.getResources().getColor(R.color.shadow_normal));
                        holder.binding.itemName.setTextColor(context.getResources().getColor(R.color.text_black));
                        return true;
                    case MotionEvent.ACTION_UP:
                        if(android.os.Build.VERSION.SDK_INT >= 28)
                            holder.binding.cardView.setOutlineSpotShadowColor(context.getResources().getColor(R.color.shadow_normal));
                        holder.binding.itemName.setTextColor(context.getResources().getColor(R.color.text_black));
                        onViewClickListener.onProductClick(position);
                    return true;
                }
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        if(data!=null)
        return data.size();
        return 0;
    }


    public static class ShopListViewHolder extends RecyclerView.ViewHolder {
        private ProductListAdapterBinding binding;

        public ShopListViewHolder(ProductListAdapterBinding _binding) {
            super(_binding.getRoot());
            binding = _binding;
        }

        public ProductListAdapterBinding getBinding() {
            return binding;
        }

        public void bindConnection(SlotsItem result) {
            binding.setSlotItem(result);
        }
    }
}

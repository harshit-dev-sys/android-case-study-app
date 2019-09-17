package com.casestudy.android.ui.productList.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.casestudy.android.databinding.ProductListAdapterBinding;
import com.casestudy.android.ui.productList.listner.OnProductListener;
import com.casestudy.android.ui.productList.pojo.SlotsItem;

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
    public void onBindViewHolder(ShopListViewHolder holder, final int position) {

        final SlotsItem productsItem=data.get(position);

        holder.bindConnection(productsItem);

        final ProductListAdapterBinding databinding = holder.getBinding();

        databinding.setLayoutListener(onViewClickListener);

    }

    @Override
    public int getItemCount() {
        return data.size();
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

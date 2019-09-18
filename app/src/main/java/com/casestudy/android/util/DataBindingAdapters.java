package com.casestudy.android.util;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;

public class DataBindingAdapters {
        @BindingAdapter("android:src")
        public static void setImageResource(ImageView imageView, String url){
            Utility.setImage(imageView.getContext(),url,imageView);
        }
}

package com.casestudy.android.views;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class HeaderImageView extends AppCompatImageView {

    public HeaderImageView(Context context) {
        super(context);
    }

    public HeaderImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HeaderImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width/3);
    }

}
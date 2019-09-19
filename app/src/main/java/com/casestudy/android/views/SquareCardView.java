package com.casestudy.android.views;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquareCardView extends RelativeLayout {

    public SquareCardView(Context context) {
        super(context);
    }

    public SquareCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareCardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width+10);
    }

}
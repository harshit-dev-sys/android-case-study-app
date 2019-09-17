package com.casestudy.android.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.casestudy.android.R;

public class ButtonCustom extends AppCompatButton {
private Typeface tf = null;
private String customFont;
public ButtonCustom(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    setCustomFontTextView(context, attrs);
}

public ButtonCustom(Context context, AttributeSet attrs) {
    super(context, attrs);
    setCustomFontTextView(context, attrs);
}

public ButtonCustom(Context context) {
    super(context);

}
public boolean setCustomFontTextView(Context ctx, String asset) {
    try {
        tf = Typeface.createFromAsset(ctx.getAssets(), "Raleway-Regular.ttf");
    } catch (Exception e) {
        return false;
    }
    setTypeface(tf);
    return true;
}

private void setCustomFontTextView(Context ctx, AttributeSet attrs) {
    final TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.EditTextLightBold);
    customFont = a.getString(R.styleable.EditTextLightBold_edittextfont);
    setCustomFontTextView(ctx, customFont);
    a.recycle();
}

}
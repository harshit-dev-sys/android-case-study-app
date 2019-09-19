package com.casestudy.android.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.casestudy.android.R;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class Utility {

    public static String getLocalJson(Context context, int path){
        try {
            InputStream is = context.getResources().openRawResource(path);
            Writer writer = new StringWriter();
            char[] buffer = new char[1024];
            try {
                Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                int n;
                while ((n = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, n);
                }
            } finally {
                is.close();
            }

            return writer.toString();
        }catch (Exception e){
            return "";
        }
    }

    public static void setImage(Context context, String imageURL, ImageView imageView){
        RequestOptions options = new RequestOptions()
                .centerInside()
                .placeholder(R.drawable.loading);
        Glide
             .with(context)
//             .setDefaultRequestOptions(options)
             .load(imageURL)
             .into(imageView);
    }


    public static void setImage(Context context, String imageURL, ImageView imageView, int radius){
        RequestOptions options = new RequestOptions()
                .centerInside()
                .placeholder(R.drawable.loading);
        Glide
             .with(context)
//             .setDefaultRequestOptions(options)
             .load(imageURL)
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(radius)))
             .into(imageView);
    }


}

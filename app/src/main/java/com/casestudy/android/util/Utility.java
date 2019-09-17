package com.casestudy.android.util;

import android.content.Context;

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


}

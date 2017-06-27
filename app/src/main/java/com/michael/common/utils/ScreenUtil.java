package com.michael.common.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/**
 * 得到屏幕的宽高
 *
 * Created by michael on 16/3/17.
 */
public class ScreenUtil
{
    /**
     * 返回屏幕的宽度
     * */
    public static int getWidth(Context context)
    {
        DisplayMetrics dm = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        return screenWidth;
    }

    /**
     * 返回屏幕的高度
     * */
    public static int getHeight(Context context)
    {
        DisplayMetrics dm = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenHeight = dm.heightPixels;
        return screenHeight;
    }
}

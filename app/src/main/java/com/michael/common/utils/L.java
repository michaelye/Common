package com.michael.common.utils;

import android.util.Log;

/**
 * 日志打印类
 *
 * Created by michael on 16/3/30.
 */
public class L
{
    public static boolean isDebug = false;// Log日志的开关

    public static void e(String tag, String message)
    {
        e(tag, message, null);
    }

    public static void e(String tag, String message, Throwable t)
    {
        if (isDebug)
        {
            Log.e(tag, message, t);
        }
    }

    public static void v(String tag, String message)
    {
        v(tag, message, null);
    }

    public static void v(String tag, String message, Throwable t)
    {
        if (isDebug)
        {
            Log.v(tag, message, t);
        }
    }

    public static void i(String tag, String message)
    {
        i(tag, message, null);
    }

    public static void i(String tag, String message, Throwable t)
    {
        if (isDebug)
        {
            Log.i(tag, message, t);
        }
    }

    public static void d(String tag, String message)
    {
        d(tag, message, null);
    }

    public static void d(String tag, String message, Throwable t)
    {
        if (isDebug)
        {
            Log.d(tag, message, t);
        }
    }

    public static void w(String tag, String message)
    {
        w(tag, message, null);
    }

    public static void w(String tag, String message, Throwable t)
    {
        if (isDebug)
        {
            Log.w(tag, message, t);
        }
    }
}

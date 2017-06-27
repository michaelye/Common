package com.michael.common.notify;

import android.content.Context;
import android.widget.Toast;

/**
 * 
 * Toast工具类
 * 
 * @author Michael
 * 
 */
public class Toaster
{

	/**
	 * 显示一个长时间的Toast
	 * */
	public static void showLong(Context context, String tip)
	{
		Toast.makeText(context, tip, Toast.LENGTH_LONG).show();
	}

	/**
	 * 显示一个普通Toast
	 * */
	public static void show(Context context, String tip)
	{
		Toast.makeText(context, tip, Toast.LENGTH_SHORT).show();
	}
}

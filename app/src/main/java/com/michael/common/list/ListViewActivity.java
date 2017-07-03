package com.michael.common.list;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.michael.common.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示如何使用ListView
 *
 * Created by michael on 2017/6/28.
 */

public class ListViewActivity extends Activity
{
    private ListView lvList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        iniComponent();
    }

    private void iniComponent()
    {
        lvList = (ListView)findViewById(R.id.lvList);
        lvList.setAdapter(new ListViewAdapter(this, getList()));
    }

    private List<String> getList()
    {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            list.add("I love douban:"+i);
        }
        return list;
    }
}

package com.michael.common.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.michael.common.R;

import java.util.List;

/**
 * Created by michael on 2017/6/30.
 */

public class ListViewAdapter extends BaseCompatAdapter<String>
{
    private List<String> list;

    public ListViewAdapter(Context context, List<String> list)
    {
        super(context, list);
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder;
        if (convertView == null)
        {
            convertView = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvTitle = (TextView)convertView.findViewById(R.id.tvTitle);
            convertView.setTag(viewHolder);
        } else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvTitle.setText(list.get(position));
        return convertView;
    }

    class ViewHolder
    {
        TextView tvTitle;
    }
}

package com.example.dell.pertemuan6.sample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.pertemuan6.R;
import com.example.dell.pertemuan6.model.DataItem;

import java.util.List;

/**
 * Created by dell on 24/05/2017.
 */

public class DataItemAdapter extends ArrayAdapter<DataItem> {

    List<DataItem> mDataitem;
    LayoutInflater minflater;

    public DataItemAdapter(Context context, List<DataItem> objects) {
        super(context, R.layout.list_item, objects);

        mDataitem = objects;
        minflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = minflater.inflate(R.layout.list_item, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.itemNameText);


        DataItem item = mDataitem.get(position);

        tvName.setText(item.getNomerSoal());



        return convertView;
        }


}

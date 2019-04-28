package com.tj.pizzastore02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tj.pizzastore02.R;
import com.tj.pizzastore02.datas.PizzaStore;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<PizzaStore> {

    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;


    public StoreAdapter(Context context, List<PizzaStore> list) {
        super(context, R.layout.store_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.store_list_item, null);
        }

        PizzaStore data = mList.get(position);

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);

        Glide.with(mContext).load(data.logoUrl).into(logoImg);

        nameTxt.setText(data.name);
        openTimeTxt.setText(data.openTime);


        return row;
    }
}

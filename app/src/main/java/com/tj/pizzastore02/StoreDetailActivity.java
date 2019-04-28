package com.tj.pizzastore02;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.tj.pizzastore02.databinding.ActivityStoreDetailBinding;
import com.tj.pizzastore02.datas.PizzaStore;

public class StoreDetailActivity extends BaseActivity {

    PizzaStore storeData;

    ActivityStoreDetailBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        storeData = (PizzaStore) getIntent().getSerializableExtra("가게정보");

        act.phoneNumTxt.setText(storeData.phoneNum);
        act.nameTxt.setText(storeData.name);
        Glide.with(mContext).load(storeData.logoUrl).into(act.logoImg);

    }

    @Override
    public void bindViews() {

        act = DataBindingUtil.setContentView(this, R.layout.activity_store_detail);
    }
}

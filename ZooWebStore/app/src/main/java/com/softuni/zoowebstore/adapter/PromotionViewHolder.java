package com.softuni.zoowebstore.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.softuni.zoowebstore.R;
import com.softuni.zoowebstore.data.Accessory;
import com.softuni.zoowebstore.data.BaseModel;
import com.softuni.zoowebstore.data.Promotion;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PromotionViewHolder extends BaseViewHolder<Promotion>{

    @BindView(R.id.img_item) ImageView imgItem;

    private Promotion dataItem;

    public PromotionViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    @Override
    public void setData(Promotion item) {
        this.dataItem = item;
        Picasso.with(itemView.getContext()).load(item.getImageUrl()).into(imgItem);
    }
}

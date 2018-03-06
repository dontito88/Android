package com.softuni.zoowebstore.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.softuni.zoowebstore.R;
import com.softuni.zoowebstore.data.Accessory;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccessoryViewHolder extends BaseViewHolder<Accessory>{

    @BindView(R.id.txt_name) TextView txtName;
    @BindView(R.id.txt_description) TextView txtDescription;
    @BindView(R.id.img_item) ImageView imgItem;
    @BindView(R.id.btn_like) Button btnLike;

    private Accessory dataItem;

    public AccessoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @OnClick(R.id.btn_like)
    public void onLikeClikced() {
        btnLike.setEnabled(false);
        dataItem.setLiked();
    }
    @Override
    public void setData(Accessory item) {
        this.dataItem = item;
        txtName.setText(item.getName());
        txtDescription.setText(item.getDescription());
        btnLike.setEnabled(!item.isLiked());
        Picasso.with(itemView.getContext()).load(item.getImageUrl()).into(imgItem);
    }
}

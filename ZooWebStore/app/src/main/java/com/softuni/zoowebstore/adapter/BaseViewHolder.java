package com.softuni.zoowebstore.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.softuni.zoowebstore.data.BaseModel;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder{

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setData(T data);
}

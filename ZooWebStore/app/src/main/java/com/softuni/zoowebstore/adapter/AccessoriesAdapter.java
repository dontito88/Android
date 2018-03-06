package com.softuni.zoowebstore.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softuni.zoowebstore.R;
import com.softuni.zoowebstore.data.Accessory;
import com.softuni.zoowebstore.data.BaseModel;
import com.softuni.zoowebstore.data.Promotion;

import java.util.List;

public class AccessoriesAdapter extends RecyclerView.Adapter<BaseViewHolder>{

    private static int TYPE_ACCESSORY = 1;
    private static int TYPE_PROMOTION = 2;

    private List<BaseModel> data;

    public AccessoriesAdapter(List<BaseModel> data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        BaseModel item = data.get(position);
        if (item instanceof Promotion){
            return TYPE_PROMOTION;
        }
        return TYPE_ACCESSORY;
    }

    @Override
    public BaseViewHolder<Accessory> onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder vh = null;
        if (viewType == TYPE_ACCESSORY){
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_accessory, parent, false);
            vh = new AccessoryViewHolder(view);
        }
        else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_promotion, parent, false);
            vh = new PromotionViewHolder(view);
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        BaseModel item = data.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

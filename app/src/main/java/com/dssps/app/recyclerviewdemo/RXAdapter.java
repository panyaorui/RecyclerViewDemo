package com.dssps.app.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：潘跃瑞
 * 时间：2016/11/18
 * 功能：
 */

public class RXAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<User> data = new ArrayList<User>();

    public RXAdapter(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void addData(List<User> data){
           this.data = data;
//           notifyDataSetChanged();
    }
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder viewHolder = null;
        switch (viewType){
            case 0:
                viewHolder = new OneHolder(layoutInflater.inflate(R.layout.item_one,parent,false));
                break;
            case 1:
                viewHolder = new TwoHolder(layoutInflater.inflate(R.layout.item_two,parent,false));
                break;
            case 2:
                viewHolder = new ThreeHolder(layoutInflater.inflate(R.layout.item_three,parent,false));
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
         holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }
}

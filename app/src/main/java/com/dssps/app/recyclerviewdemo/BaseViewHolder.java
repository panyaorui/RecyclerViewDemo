package com.dssps.app.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 作者：潘跃瑞
 * 时间：2016/11/18
 * 功能：
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {


    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindData(BaseModel data);
}

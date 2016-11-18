package com.dssps.app.recyclerviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 作者：潘跃瑞
 * 时间：2016/11/18
 * 功能：
 */

public class OneHolder extends BaseViewHolder {
    private TextView name;
    private ImageView img;

    public OneHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        img = (ImageView) itemView.findViewById(R.id.img);
    }

    @Override
    public void bindData(BaseModel data) {
        User user = (User) data;
        name.setText(user.getName());
        img.setBackgroundResource(user.getColor1());
    }
}

package com.dssps.app.recyclerviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 作者：潘跃瑞
 * 时间：2016/11/18
 * 功能：
 */

public class ThreeHolder extends BaseViewHolder {
    private TextView name;
    private ImageView img;
    private TextView age;
    private ImageView img2;

    public ThreeHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        img = (ImageView) itemView.findViewById(R.id.img);
        img2 = (ImageView) itemView.findViewById(R.id.img2);
        age = (TextView) itemView.findViewById(R.id.age);
    }

    @Override
    public void bindData(BaseModel data) {
        User user = (User) data;
        name.setText(user.getName());
        img.setBackgroundResource(user.getColor1());
        img2.setBackgroundResource(user.getColor2());
        age.setText(user.getAge());
    }
}

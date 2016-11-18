package com.dssps.app.recyclerviewdemo;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    RXAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        adapter = new RXAdapter(this);
        recyclerView.setAdapter(adapter);
         gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int type = adapter.getItemViewType(position);
                if(type == 2){
                    return 2;
                }
                return 1;
            }
        });
        LinearLayoutManager  linearLayoutManager =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration(){
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
                int size = layoutParams.getSpanSize();
                int index = layoutParams.getSpanIndex();
                outRect.top = 20;
                if(size != gridLayoutManager.getSpanCount()){
                       if(index == 0) {
                           outRect.right = 10;
                       }

                }
            }
        });
        initData();

    }

    private void initData() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            User user;
             if(i < 5) {
                 user = new User(0,"王菲","0",R.color.colorAccent,0);
             }else if(i <10){
                  user = new User(1,"王菲","1",R.color.colorPrimary,0);
             }else{
                  user = new User(2,"王菲","2",R.color.colorPrimary,R.color.colorPrimary);
             }
            list.add(user);
        }
        adapter.addData(list);
    }
}

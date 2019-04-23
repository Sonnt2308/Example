package com.example.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

 public class MyAdapter extends RecyclerView.Adapter {


     private TextView tvHead;
     private TextView tvViewDesc;




     private List<ListItem> listItems;
     private Context context;


    public MyAdapter(List<ListItem> listItems  , Context context) {
            this.listItems = listItems;
            this.context = context;

    }

     @NonNull
     @Override
     public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
         View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false
         );


         return new RecyclerView.ViewHolder(view) {
         };
     }

     @Override
     public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            ListItem listItem = listItems.get(i);

            viewHolder.tvHead.setText(listItem.getHead());
         viewHolder.tvViewDesc.setText(listItem.getDesc());




     }

     @Override
     public int getItemCount() {
         return listItems.size();
     }
 }

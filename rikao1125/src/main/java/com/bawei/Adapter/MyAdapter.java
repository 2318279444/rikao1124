package com.bawei.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.Bean.Movece;
import com.bawei.rikao1125.R;
import com.bumptech.glide.Glide;

import java.util.List;

/*
 *@auther:邓先超
 *@Date: 2019/11/25
 *@Time:8:46
 *@Description:${DESCRIPTION}
 **/
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    List<Movece.ResultBean> list;
    Context context;

    public MyAdapter(List<Movece.ResultBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Glide.with(context).load(list.get(position).getImageUrl()).into(holder.imageView);
        holder.textView1.setText(list.get(position).getName());
        holder.textView2.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView1,textView2;
        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imag);
            textView1=itemView.findViewById(R.id.text1);
            textView2=itemView.findViewById(R.id.text2);
        }
    }
}

package com.example.foodapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>{

    ArrayList<Product> productArrayList;

    public ProductAdapter(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img_food.setImageResource(productArrayList.get(position).getFood_image());
        holder.tv_food.setText(productArrayList.get(position).getFood_name());
        holder.tv_des.setText(productArrayList.get(position).getFood_des());
        holder.tv_price.setText(productArrayList.get(position).getFood_price());
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img_food;
        TextView tv_food;
        TextView tv_des;
        TextView tv_price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_food = itemView.findViewById(R.id.img_food);
            tv_food = itemView.findViewById(R.id.tv_food);
            tv_des = itemView.findViewById(R.id.tv_description);
            tv_price = itemView.findViewById(R.id.tv_price);
        }
    }
}

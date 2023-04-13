package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FoodDetailActivity extends AppCompatActivity {

    ImageView food_back, food_image;
    TextView food_name, food_price,food_des, food_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        initView();

        food_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        food_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodDetailActivity.this, "Added food to cart<3", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        food_back = findViewById(R.id.food_back);
        food_order = findViewById(R.id.food_order);

        food_name = findViewById(R.id.food_name);
        food_price = findViewById(R.id.food_price);
        food_image = findViewById(R.id.food_img);
        food_des = findViewById(R.id.food_info_txt);
    }
}
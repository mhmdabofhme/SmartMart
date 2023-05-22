package com.example.smartmart.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smartmart.MarketProductsActivity;
import com.example.smartmart.ProductDetailsActivity;
import com.example.smartmart.R;

public class MarketProductsAdapter extends RecyclerView.Adapter<MarketProductsAdapter.MyViewHolder> {

    private Activity activity;


    public MarketProductsAdapter(Activity activity) {
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_market_products, parent, false);

        return new MyViewHolder(itemView);

    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.startActivity(new Intent(activity, ProductDetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        MyViewHolder(View view) {
            super(view);

        }

    }
}
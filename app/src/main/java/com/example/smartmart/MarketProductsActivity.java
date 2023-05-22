package com.example.smartmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.smartmart.adapters.MarketProductsAdapter;
import com.example.smartmart.databinding.ActivityMarketProductsBinding;

public class MarketProductsActivity extends AppCompatActivity {
private ActivityMarketProductsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMarketProductsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.recMarketProducts.setAdapter(new MarketProductsAdapter(this));
    }
}
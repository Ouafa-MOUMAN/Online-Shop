package com.example.onlineshop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        setupBottomNavigation();
    }

    private void setupBottomNavigation() {
        LinearLayout navHome = findViewById(R.id.nav_home);
        LinearLayout navCategory = findViewById(R.id.nav_category);
        LinearLayout navOrder = findViewById(R.id.nav_order);
        LinearLayout navAccount = findViewById(R.id.nav_account);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderActivity.this, MainActivity.class));
                finish();
            }
        });

        navCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderActivity.this, CategoryActivity.class));
                finish();
            }
        });

        navOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Déjà sur cette page
            }
        });

        navAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderActivity.this, ProfileActivity.class));
                finish();
            }
        });
    }
}
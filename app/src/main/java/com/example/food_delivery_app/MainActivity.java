package com.example.food_delivery_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cartviewbtn = findViewById(R.id.cart_food_page);
        CardView offersbtn01 = findViewById(R.id.offerpage01);
        CardView offersbtn02 = findViewById(R.id.offers02);
        CardView offersbtn03 = findViewById(R.id.offers03);
        ImageView mapbtn = findViewById(R.id.mappagebtn);
        ImageView profilebtn = findViewById(R.id.account_page);
        LinearLayout pizzabtn = findViewById(R.id.pissabtn);
        LinearLayout pastarsbtn = findViewById(R.id.pastasbtn);
        LinearLayout appetizersbtn = findViewById(R.id.appertzersbtn);
        LinearLayout dessertsbtn = findViewById(R.id.dessertsbtn);

        dessertsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Desserts_Page.class));
            }
        });

        appetizersbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Appetizers_Page.class));
            }
        });

        pastarsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Pastas_Page.class));
            }
        });

        pizzabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Pizza_Page.class));
            }
        });

        offersbtn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Offers_03_Page.class));
            }
        });

        offersbtn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Offers_02_page.class));
            }
        });


        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Profile_Page.class));
            }
        });

        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Map_Page.class));
            }
        });

        offersbtn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Offers_01_page.class));
            }
        });

        cartviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cart_View_Page.class));
            }
        });
    }
}
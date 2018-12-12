package com.mtandev.manilatourguideapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView whattosee = (ImageView) findViewById(R.id.whattosee_icon);

        whattosee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whattoseeIntent = new Intent(MainActivity.this, WhattoseeActivity.class);
                startActivity(whattoseeIntent);
            }
        });

        ImageView events = (ImageView) findViewById(R.id.events_icon);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

        ImageView hotels = (ImageView) findViewById(R.id.hotel_icon);

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.restaurant_icon);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });
    }
}

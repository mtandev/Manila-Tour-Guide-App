package com.mtandev.manilatourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        TextView header = (TextView) findViewById(R.id.header);

        header.setText(R.string.restaurants);

        final ImageView home = (ImageView) findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(RestaurantsActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        });

        ImageView whattosee = (ImageView) findViewById(R.id.whattosee_icon);
        whattosee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whattoseeIntent = new Intent(RestaurantsActivity.this, WhattoseeActivity.class);
                startActivity(whattoseeIntent);
                finish();
            }
        });

        ImageView events = (ImageView) findViewById(R.id.events_icon);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(RestaurantsActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
                finish();
            }
        });

        ImageView hotels = (ImageView) findViewById(R.id.hotel_icon);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(RestaurantsActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
                finish();
            }
        });

        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.poblacion_title, R.string.poblacion_text, R.drawable.poblacion));
        venues.add(new Venue(R.string.aristocrat_title, R.string.aristocrat_text, R.drawable.aristocrat));
        venues.add(new Venue(R.string.spiral_title, R.string.spiral_text, R.drawable.spiral));
        venues.add(new Venue(R.string.cafeilang_title, R.string.cafeilang_text, R.drawable.cafeilang));

        VenuesAdapter venueAdapter = new VenuesAdapter(this, venues);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);

    }
}

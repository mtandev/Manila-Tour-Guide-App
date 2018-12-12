package com.mtandev.manilatourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        TextView header = (TextView) findViewById(R.id.header);

        header.setText(R.string.hotels);

        final ImageView home = (ImageView) findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(HotelsActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        });

        ImageView whattosee = (ImageView) findViewById(R.id.whattosee_icon);
        whattosee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whattoseeIntent = new Intent(HotelsActivity.this, WhattoseeActivity.class);
                startActivity(whattoseeIntent);
                finish();
            }
        });

        ImageView events = (ImageView) findViewById(R.id.events_icon);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(HotelsActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
                finish();
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.restaurant_icon);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(HotelsActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
                finish();
            }
        });

        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.sofitel_title, R.string.sofitel_text, R.drawable.sofitel));
        venues.add(new Venue(R.string.shangrila_title, R.string.shangrila_text, R.drawable.shangrila));
        venues.add(new Venue(R.string.peninsula_title, R.string.peninsula_text, R.drawable.peninsula));
        venues.add(new Venue(R.string.airbnb_title, R.string.airbnb_text, R.drawable.airbnb));

        VenuesAdapter venueAdapter = new VenuesAdapter(this, venues);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);
    }
}

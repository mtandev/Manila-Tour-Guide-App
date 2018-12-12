package com.mtandev.manilatourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        TextView header = (TextView) findViewById(R.id.header);

        header.setText(R.string.events);

        ImageView home = (ImageView) findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(EventsActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        });

        ImageView whattosee = (ImageView) findViewById(R.id.whattosee_icon);
        whattosee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whattoseeIntent = new Intent(EventsActivity.this, WhattoseeActivity.class);
                startActivity(whattoseeIntent);
                finish();
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.restaurant_icon);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(EventsActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
                finish();
            }
        });

        ImageView hotels = (ImageView) findViewById(R.id.hotel_icon);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(EventsActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
                finish();
            }
        });

        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.zerowaste_title, R.string.zerowaste_text, R.drawable.zerowaste));
        venues.add(new  Venue(R.string.bazaar_title, R.string.ballet_text, R.drawable.bazaar));
        venues.add(new Venue(R.string.ballet_title, R.string.ballet_text, R.drawable.ballet));
        venues.add(new Venue(R.string.bayani_title, R.string.ballet_text, R.drawable.bayani));

        VenuesAdapter venueAdapter = new VenuesAdapter(this, venues);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);
    }
}
